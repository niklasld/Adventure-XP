package com.activities.adventurexp.Controllers;

import com.activities.adventurexp.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

@Controller
public class AdminController {
    public AdminController() {

    }

    @Autowired
    AdminService adminService;

    Logger log = Logger.getLogger(AdminController.class.getName());


    @GetMapping("/addActivity")
    public String addActivity(Model model){

        model.addAttribute("Add", adminService.addActivities(acti))

    }
}
