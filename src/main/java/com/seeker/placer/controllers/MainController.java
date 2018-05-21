package com.seeker.placer.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.validation.Valid;

@Controller
public class MainController {
    //todo: hookup the place service
//    private final PlaceService placeService;
//    public PlaceController(PlaceService placeService) {
//        this.placeService = placeService;
//    }

    //todo: CRUD routes

    @RequestMapping("/")
    public String indexRoute(Model model) {
        return "index.html";
    }

//    @RequestMapping("/places/view/{id}")
//    public String viewPlace(@PathVariable("id") Long id,
//                                         Model model,
//                                         RedirectAttributes redirectAttributes) {
//        Optional<Place> place = placeService.getPlaceById(id);
//        if (place.isPresent()) {
//            model.addAttribute("place", place.get());
//            return "placeView";
//        } else {
//            redirectAttributes.addFlashAttribute("get_by_id_error", "no place with that ID was found");
//            return "redirect:/";
//        }
//    }
//
//    @RequestMapping("/places/new")
//    public String newPlace(@ModelAttribute("place") Place place) {
//
//        return "placeFormNew";
//    }
//
//    @PostMapping("/places/new")
//    public String newPlace(@Valid @ModelAttribute("place") Place place, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "placeFormNew";
//        } else {
//            this.placeService.addPlace(place);
//        }
//    }
//
//    @RequestMapping("/place/delete/{id}")
//    public String deletePlace(@PathVariable("id") Long id) {
//        placeService.destroyPlace(id);
//        return "redirect:/";
//    }

}
