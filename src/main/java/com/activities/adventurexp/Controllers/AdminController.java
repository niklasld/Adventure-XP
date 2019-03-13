package com.activities.adventurexp.Controllers;

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

    private final String INDEX = "index";
    private final String CREATEBOOKING = "createBooking";

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
