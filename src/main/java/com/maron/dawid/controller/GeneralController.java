package com.maron.dawid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeneralController {

    @GetMapping("/landing")
    public String showLandingPage() {
        return mainPage();
    }
    @GetMapping("/projects")
    public String showSkillsPage() {
        return "projects";
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @GetMapping
    public String mainPage() {
        return "landing-page";
    }

}
