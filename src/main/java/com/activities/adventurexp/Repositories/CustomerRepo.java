package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;

import java.util.List;

public interface CustomerRepo {

    Activities getActivity(int id);

    List<Activities> getActivities();
}
