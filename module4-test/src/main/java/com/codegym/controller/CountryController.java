package com.codegym.controller;

import com.codegym.entity.Province;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping ("")
public class CountryController {

    @GetMapping("/home")
    public ModelAndView showAllCountryControl () {
        ModelAndView modelAndView = new ModelAndView("/home");
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createProvince () {
        ModelAndView modelAndView = new ModelAndView("/create");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView editProvince () {
        ModelAndView modelAndView = new ModelAndView("/edit");
        return modelAndView;
    }
}
