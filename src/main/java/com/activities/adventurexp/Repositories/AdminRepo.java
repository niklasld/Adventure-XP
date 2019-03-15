package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Booking;

import java.util.List;
import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Merchandise;


public interface AdminRepo {

    Activities addActivities(Activities activities);

    List<Booking> getBookings();

    Booking createBooking(Booking booking);

    List<Activities> getActivities();
    Merchandise getMerchandise(int id);
    Merchandise updateMerch(Merchandise merch);
}
