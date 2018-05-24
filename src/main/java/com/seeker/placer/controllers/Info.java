package com.seeker.placer.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seeker.placer.models.Place;
import com.seeker.placer.services.UserService;

@RestController
public class Info {
    private final UserService userService;
    public Info(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/getPlaces")
    public List<Place> getAllPlaces() {
    	System.out.println("You're hitting the get allPlaces route as well");
    	return userService.allPlaces();
    }

}
