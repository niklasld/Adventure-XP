package com.activities.adventurexp.Services;

import com.activities.adventurexp.Controllers.AdminController;
import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Booking;
import com.activities.adventurexp.Repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class AdminServiceImpl implements AdminService{
    public AdminServiceImpl() {
    }

    @Autowired
    AdminRepo adminRepo;

    Logger log = Logger.getLogger(AdminController.class.getName());

    public List<Booking> getBookings(){
        log.info("getBookings service called");
        List<Booking> bookings = adminRepo.getBookings();

        return bookings;
    }

    public List<Activities> getActivities(){
        log.info("getActivities service called");
        List<Activities> activitiesArrayList = adminRepo.getActivities();

        return activitiesArrayList;
    }

    public void createBooking(Booking booking) {
        adminRepo.createBooking(booking);
    }
}
