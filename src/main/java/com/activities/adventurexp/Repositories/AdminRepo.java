package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;import com.activities.adventurexp.Models.Booking;

import java.util.List;

public interface AdminRepo {

    Activities addActivities(Activities activities);

    List<Booking> getBookings();

    Booking createBooking(Booking booking);

    List<Activities> getActivities();
}
