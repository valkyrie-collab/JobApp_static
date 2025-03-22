package com.valkyrie.job_app_three.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.valkyrie.job_app_three.services.JobService;

@Controller
public class HomeController {
    @Autowired
    private JobService service;

    @GetMapping({"/", "/home"})
    public String getHomepage() {
        return "Homepage";
    }

    @PostMapping("/alljobs")
    public String getAllJobs(Model model) {
        model.addAttribute("jobs", service.getJobs());
        return "AllJobpage";
    }

    @GetMapping("/addjob")
    public String getAddJob() {
        return "AddJobpage";
    }
}
