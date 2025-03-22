package com.valkyrie.job_app_three.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.valkyrie.job_app_three.models.Job;
import com.valkyrie.job_app_three.services.JobService;

@Controller
public class AddJobController {
    @Autowired
    private JobService service;

    @PostMapping("/addjob")
    public String getPreview(@ModelAttribute Job job, Model model) {
        service.addJob(job);
        model.addAttribute("job", job);
        return "Previewpage";
    }
}
