package com.valkyrie.job_app_three.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valkyrie.job_app_three.models.Job;
import com.valkyrie.job_app_three.repository.JobRepo;

@Service
public class JobService {
    @Autowired
    private JobRepo repo;

    public void addJob(Job job) {
        repo.addJob(job);
    }

    public List<Job> getJobs() {
        return repo.getAllJobs();
    }
}
