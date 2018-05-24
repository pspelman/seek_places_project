package com.seeker.placer.controllers;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seeker.placer.models.Place;
import com.seeker.placer.services.UserService;

@Controller
public class MainController {
    private final UserService userService;
    public MainController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/")
    public String indexRoute(Model model) {
    	List<Place> places = userService.allPlaces();
    	System.out.println(places);
    	model.addAttribute("places", places);
        return "index.html";
    }


}
