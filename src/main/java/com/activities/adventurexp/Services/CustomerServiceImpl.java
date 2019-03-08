package com.activities.adventurexp.Services;

import com.activities.adventurexp.Controllers.AdminController;
import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CustomerServiceImpl implements CustomerService{
    public CustomerServiceImpl() {
    }

    @Autowired
    CustomerRepo customerRepo;

    Logger log = Logger.getLogger(AdminController.class.getName());

    public List<Activities> getActivities(){
        log.info("getActivities service called");
        List<Activities> activitiesArrayList = customerRepo.getActivities();

        return activitiesArrayList;
    }


}
