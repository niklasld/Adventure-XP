package com.activities.adventurexp.Repositories;

import com.activities.adventurexp.Models.Activities;
import com.activities.adventurexp.Models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AdminRepoImpl implements AdminRepo{
    public AdminRepoImpl() {
    }

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Booking> getBookings() {
        String sql = "SELECT * FROM booking";
        return this.template.query(sql, new ResultSetExtractor<List<Booking>>() {

            @Override
            public List<Booking> extractData(ResultSet rs) throws SQLException, DataAccessException {
                int bookingId, bookingPhone, bookingPersons, FK_activityId;
                String bookingName, bookingDate, bookingEmail;
                ArrayList<Booking> bookings = new ArrayList<>();

                while (rs.next()) {
                    bookingId = rs.getInt("bookingId");
                    bookingName = rs.getString("bookingName");
                    bookingDate = rs.getString("bookingDate");
                    bookingPhone = rs.getInt("bookingPhone");
                    bookingEmail = rs.getString("bookingEmail");
                    bookingPersons = rs.getInt("bookingPersons");
                    FK_activityId = rs.getInt("FK_activityId");

                    bookings.add(new Booking(bookingId, bookingName, bookingDate, bookingPhone, bookingEmail, bookingPersons, FK_activityId));
                }
                return bookings;
            }
        });
    }

    @Override
    public Booking createBooking(Booking booking) {


        String sql = "INSERT INTO AdventureXP.booking VALUES(default,?,?,?,?,?,?)";
        String bookingName = booking.getBookingName();
        String bookingDate = booking.getBookingDate();
        int bookingPhone = booking.getBookingPhone();
        String bookingEmail = booking.getBookingEmail();
        int bookingPersons = booking.getBookingPersons();
        int FK_activityId = booking.getFK_activityId();

        this.template.update(sql, bookingName, bookingDate, bookingPhone, bookingEmail, bookingPersons, FK_activityId);

        return booking;

    }

    @Override
    public List<Activities> getActivities() {
        String sql = "SELECT * FROM Activities";
        return this.template.query(sql, new ResultSetExtractor<List<Activities>>() {

            @Override
            public List<Activities> extractData(ResultSet rs) throws SQLException, DataAccessException {
                int activityId;
                String activityName, activityDescription;
                ArrayList<Activities> activitiesArrayList = new ArrayList<>();

                while (rs.next()) {
                    activityId = rs.getInt("activityId");
                    activityName = rs.getString("activityName");
                    activityDescription = rs.getString("activityDescription");

                    activitiesArrayList.add(new Activities(activityId, activityName, activityDescription));
                }
                return activitiesArrayList;
            }
        });
    }

}
