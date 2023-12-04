package com.resellerapp.controller;

import com.resellerapp.model.OfferCreateBindingModel;
import com.resellerapp.service.OfferService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/offers")
public class OfferController {
    private final OfferService offerService;

    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("offer-add");
    }
    @PostMapping("/create")
    public ModelAndView create(OfferCreateBindingModel offerCreateBindingModel){

        boolean isCreated = offerService.create(offerCreateBindingModel);

        String view = isCreated ? "redirect:/home" : "/create";

        return new ModelAndView(view);
    }
}
