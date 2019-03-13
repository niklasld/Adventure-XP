package com.activities.adventurexp.Services;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    public AdminServiceImpl() {
    }

    @Autowired
    AdminRepo adminRepo;

    public Activities addActivities(Activities activities){
        adminRepo.addActivities(activities);
        return activities;
    }

}
