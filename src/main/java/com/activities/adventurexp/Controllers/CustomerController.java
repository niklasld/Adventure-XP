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

    @GetMapping("/")
    public String index(Model model) {
        log.info("Index called...");


        return INDEX;
    }
}
