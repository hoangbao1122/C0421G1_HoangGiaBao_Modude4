package com.example.baitap.controller;

import com.example.baitap.model.dto.CardDto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class CardController {

    @GetMapping("/shop-card")
    public ModelAndView showCard(@SessionAttribute CardDto card) { // lay ssession ra
       return new ModelAndView("card/list","card",card);
    }

}
