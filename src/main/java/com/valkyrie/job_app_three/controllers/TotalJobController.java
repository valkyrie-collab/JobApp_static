package com.valkyrie.job_app_three.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.valkyrie.job_app_three.models.Job;
import com.valkyrie.job_app_three.services.JobService;

@Controller
public class TotalJobController {
    @Autowired
    private JobService service;

    @PostMapping("/apply") 
    public String getAccepted(@RequestParam String title, Model model) {
        //for loop can be used
        Job job = service.getJobs().stream()
            .filter(s -> s.getTitle().equals(title))
            .findFirst()
            .orElse(null);
        model.addAttribute("job", job);
        return "JobAccepted";
    }
}
