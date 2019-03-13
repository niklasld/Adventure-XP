package com.activities.adventurexp.Services;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Merchandise;

public interface AdminService {

    Activities addActivities(Activities activities);

    Merchandise getMerchandise(int id);
    Merchandise updateMerchandise(Merchandise merch);
}