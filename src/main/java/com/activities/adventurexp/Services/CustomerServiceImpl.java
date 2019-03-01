package com.activities.adventurexp.Services;

import com.activities.adventurexp.Repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    public CustomerServiceImpl() {
    }

    @Autowired
    CustomerRepo customerRepo;
}
