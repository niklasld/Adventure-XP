package com.activities.adventurexp.Services;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Merchandise;
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

    @Override
    public Merchandise getMerchandise(int id) {
        Merchandise merch = adminRepo.getMerchandise(id);
        return merch;
    }

    @Override
    public Merchandise updateMerchandise(Merchandise merch) {
        adminRepo.updateMerch(merch);
        return merch;
    }

}
