package com.demo.demodeployment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

    @GetMapping("/home")
    public ModelAndView goHome() {
        return new ModelAndView("index");
    }
}
