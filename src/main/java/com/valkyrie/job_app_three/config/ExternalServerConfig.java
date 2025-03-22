package com.valkyrie.job_app_three.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.valkyrie.job_app_three.main.JobAppThreeApplication;

public class ExternalServerConfig extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JobAppThreeApplication.class);
    }
}
