<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>

    <style>
        /* Always set the map height explicitly to define the size of the div
         * element that contains the map. */
        #map {
            height: 75%;
        }
        /* Optional: Makes the sample page fill the window. */
        html, body {
            height: 100%;
            margin: 0;
            padding: 0;
        }
    </style>


    <div id='root'></div>

    <script src="https://fb.me/react-15.0.1.js"></script>
    <script src="https://fb.me/react-dom-15.0.1.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/babel-core/5.8.23/browser.min.js"></script>

    <script type="text/babel"></script>

</head>
<body>
    ${search_errors}
    <div class="container">
        <%--<t:generic_navbar>--%>
                <%--<jsp:attribute name="top_nav">--%>
                <%--</jsp:attribute>--%>
        <%--</t:generic_navbar>--%>
            <!-- Initialize Facebook Authentication -->
            <script>
                window.fbAsyncInit = function() {
                    FB.init({
                        appId      : '2156847117878192',
                        cookie     : true,
                        xfbml      : true,
                        version    : 'v3.0'
                    });

                    FB.getLoginStatus(function(response) {
                        statusChangeCallback(response);
                    });

                };

                (function(d, s, id){
                    var js, fjs = d.getElementsByTagName(s)[0];
                    if (d.getElementById(id)) {return;}
                    js = d.createElement(s); js.id = id;
                    js.src = "https://connect.facebook.net/en_US/sdk.js";
                    fjs.parentNode.insertBefore(js, fjs);
                }(document, 'script', 'facebook-jssdk'));

                function statusChangeCallback(response){
                    if(response.status === 'connected'){
                        console.log('Logged in and authenticated');
                        setElements(true);
                    }else{
                        console.log('Not authenticated');
                        setElements(false);
                    }
                }

                function checkLoginState() {
                    FB.getLoginStatus(function(response) {
                        statusChangeCallback(response);
                    });
                }

                function logout(){
                    FB.logout(function(response){
                        setElements(false);
                    });
                }

                function setElements(isLoggedIn){
                    if(isLoggedIn){
                        document.getElementById('fb-btn').style.display = 'none';
                        document.getElementById('map').style.display = 'block';
                        document.getElementById('logout-btn').style.display = 'block';
                    }else{
                        document.getElementById('fb-btn').style.display = 'block';
                        document.getElementById('map').style.display = 'none';
                        document.getElementById('logout-btn').style.display = 'none';
                    }
                }
            </script>



            <nav class="navbar navbar-expand-md navbar-dark bg-dark">
                <a class="navbar-brand" href="#">Navbar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                    <ul class="navbar-nav mr-auto">
                        <li>
                            <a class="nav-link" href="loggedInPage.html">Home <span class="sr-only">(current)</span></a>
                        </li>
                    </ul>
                    <ul class="nav nvabar-nav navbar-right">
                        <li>
                            <a href="#" onclick="logout()" id="logout-btn" class="alert-danger">Logout</a>
                        </li>
                        <li>
                            <fb:login-button
                                    id="fb-btn"
                                    scope="public_profile,email"
                                    onlogin="checkLoginState();">
                            </fb:login-button>
                        </li>
                    </ul>
                </div>
            </nav>
            <h1>main seek page</h1>
            <div id="map"></div>
            <script>

                //todo: add GET call to REST route on server to get places

                var places = [{
                    lat: 47.612049,
                    lng: -122.337432,
                    name: 'Westlake Center',
                },{
                    lat: 47.598036,
                    lng: -122.324956,
                    name: 'Seattle Pinball Museum',
                },{
                    lat: 47.591403,
                    lng: -122.332509,
                    name: 'Safeco Stadium',
                },{
                    lat: 47.655335,
                    lng: -122.303520,
                    name: 'University Of Washington',
                }]
                var map;

                //Define the map function
                function initMap() {
                    var uluru = {lat: 47.6098114, lng: -122.19656910000003};
                    var notuluru = {lat: 47.615544, lng: -122.203845};
                    var fave_city = uluru;
                    //Initialize the map
                    map = new google.maps.Map(document.getElementById('map'), {
                        //todo: set the start location to their favorite city or something
                        // center: {lat: 47.6098114, lng: -122.19656910000003},
                        center: fave_city,
                        zoom: 8
                    });

                    places.forEach(function (element) {
                        var location = {lat: element.lat, lng: element.lng};
                        var custommarker = new google.maps.Marker({position: location, map: map, label: element.name});
                        console.log(custommarker);
                        console.log(location);
                        console.log(element);
                    });
                    var marker = new google.maps.Marker({position: uluru, map:map, label: 'Coding Dojo'});
                    var marker1 = new google.maps.Marker({position: notuluru, map:map, label: 'Bellevue Square'});
                }
            </script>
            <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyD86xjRo8z7-xUgW2HgsVJv6-6MWhDOWz4&callback=initMap"
                    async defer></script></body>
</html>

