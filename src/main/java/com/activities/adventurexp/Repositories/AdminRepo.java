package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Merchandise;

public interface AdminRepo {

    Activities addActivities(Activities activities);

    Merchandise getMerchandise(int id);
    Merchandise updateMerch(Merchandise merch);
}
