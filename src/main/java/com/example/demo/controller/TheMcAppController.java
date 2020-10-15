package com.example.demo.controller;

import com.example.demo.model.MotorCycle;
import com.example.demo.repository.MotorCycleRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TheMcAppController {

    MotorCycleRepository motorCycleRepository;

    public TheMcAppController(MotorCycleRepository motorCycleRepository) {
        this.motorCycleRepository = motorCycleRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("std", motorCycleRepository.findAll());
        return "index";
    }


    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("motorcycle", new MotorCycle());
        return "create";

    }
    @PostMapping("/create")
    public String create(@ModelAttribute MotorCycle mc) {

        motorCycleRepository.save(mc);
        return "redirect:/";
    }

    public String index(){
        return "";
    }

}
