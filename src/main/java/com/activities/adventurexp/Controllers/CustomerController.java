package com.activities.adventurexp.Controllers;

import com.activities.adventurexp.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import java.util.logging.Logger;

@Controller
public class CustomerController {

    public CustomerController() {
    }

    @Autowired
    CustomerService customerService;

    Logger log = Logger.getLogger(AdminController.class.getName());

    private final String INDEX = "index";
    private final String ACTIVITYLIST = "activityList";

    @GetMapping("/")
    public String index(Model model) {
        log.info("Index called...");


        return INDEX;
    }

    @GetMapping("/activityList")

    public String activityList(Model model){
        log.info("activityList called..");

        model.addAttribute("activities", customerService.getActivities() );

       return ACTIVITYLIST;
    }
}
