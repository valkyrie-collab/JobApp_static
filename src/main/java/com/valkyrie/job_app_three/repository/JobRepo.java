package com.valkyrie.job_app_three.repository;

import java.util.List;
import java.util.LinkedList;

import org.springframework.stereotype.Repository;

import com.valkyrie.job_app_three.models.Job;

@Repository
public class JobRepo {
    private List<Job> jobs = new LinkedList<>(List.of(
        new Job("Software Engineer", "TechCorp", 120000),
        new Job("Data Scientist", "DataWorks", 110000),
        new Job("Product Manager", "Innovate Inc.", 130000),
        new Job("FullStack Developer", "Tata grp.", 145000)
    ));

    public void addJob(Job job) {
        jobs.add(job);
    }

    public List<Job> getAllJobs() {
        return jobs;
    }
}
