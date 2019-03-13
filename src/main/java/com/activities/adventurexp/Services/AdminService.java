package com.activities.adventurexp.Services;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Booking;

import java.util.List;

public interface AdminService {
    List<Booking> getBookings();
    List<Activities> getActivities();
    void createBooking(Booking booking);

    Activities addActivities(Activities activities);
}
