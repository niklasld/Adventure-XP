package com.activities.adventurexp.Controllers;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Booking;
import com.activities.adventurexp.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class AdminController {
    public AdminController() {

    }

    @Autowired
    AdminService adminService;

    Logger log = Logger.getLogger(AdminController.class.getName());
    public final String ADDACTIVITY = "/addActivity";
    private final String INDEX = "index";
    private final String CREATEBOOKING = "createBooking";

    @GetMapping("/addActivity")
    public String addActivity(Model model){
        log.info("AddActivity called...");
        model.addAttribute("newActivity", new Activities());
        return ADDACTIVITY;
    }

    @PostMapping("/addActivityPost")
    public String addActivityPost(Activities activity) {
        log.info("addActivityPost called..");
        adminService.addActivities(activity);

        return "/activityList";
    }

    @GetMapping("/createBooking")
    public String createBooking(Model model) {
        log.info("createBooking called...");

        model.addAttribute("booking", new Booking());
        model.addAttribute("activities", adminService.getActivities());

        return CREATEBOOKING;
    }

    @PostMapping("/createBooking")
    public String createBooking(@ModelAttribute Booking booking){
        String date = booking.getBookingDate();
        log.info(date);

        String[] dateSplit = date.split("-");


        booking.setBookingDate(dateSplit[2]+"-"+dateSplit[1]+"-"+dateSplit[0]);

        adminService.createBooking(booking);

        return  "redirect:/";
    }
}
