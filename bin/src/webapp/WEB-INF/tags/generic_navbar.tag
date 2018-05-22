<%@tag description="Overall Page template" pageEncoding="UTF-8" %>
<%@attribute name="top_nav" fragment="true" %>
<%@attribute name="page_header" fragment="true" %>

<HTML>

<body>
<div class="top_nav">
    <jsp:invoke fragment="top_nav" />
    <button name="home" class="btn-inverse" value="home" onclick="location.href='/';">Home</button>
    <button name="" class="btn-inverse" value="" onclick="location.href='//all';">All </button>
    <button name="add_" class="btn-inverse" value="add_" onclick="location.href='//new';">Add </button>

<%--<button name="top10" class="btn-inverse" value="Top 10" onclick="location.href='/songs/topTen';">Top 10</button>--%>
    <%--<form name="artist_search_form" action="/songs/search/artist" method="get" class="form-inline nav_artist_search">--%>
        <%--<input type="text" name="artistNameString">--%>
        <%--<input type="submit" class="btn-inverse" value="search">--%>
        <%--<span class="alert-danger">${artist_search_error}</span>--%>
    <%--</form>--%>
</div>
</body>
</HTML>