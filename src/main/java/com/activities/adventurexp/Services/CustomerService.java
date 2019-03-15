package com.activities.adventurexp.Services;

import com.activities.adventurexp.Models.Activities;

import java.util.List;

public interface CustomerService {


    Activities getActivity(int id);
    List<Activities> getActivities();

}

