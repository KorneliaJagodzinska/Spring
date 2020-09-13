package com.sda.javagda31.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String getIndexPage() {
        return "index";
    }

    @GetMapping("/calculator")
    public String getCalculator() {
        return "calculator";
    }

    @PostMapping("/calculator")
    public String displayCalculator(Model model, Integer sizeX, Integer sizeY) {
        model.addAttribute("rowNumber", sizeY);
        model.addAttribute("colNumber", sizeX);
        return "calculator";
    }

}
