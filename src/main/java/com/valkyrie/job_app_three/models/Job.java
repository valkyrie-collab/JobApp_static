package com.valkyrie.job_app_three.models;

public class Job {
    private String title;
    private String company;
    private int salary;

    public Job(String title, String company, int salary) {
        setTitle(title); setCompany(company); setSalary(salary);
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setCompany(String company) {
        this.company = company; 
    }
    public String getCompany() {
        return company;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format(
            "The Job Title: %s\nThe Job Company: %s\nThe Job Salary: %d",
            title, company, salary
        );
    }
}
