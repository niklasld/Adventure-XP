package com.activities.adventurexp.Models;

public class Booking {
    private int bookingId;
    private String bookingName;
    private String bookingDate;
    private int bookingPhone;
    private String bookingEmail;
    private int bookingPersons;
    private int FK_activityId;

    public Booking() {
    }

    public Booking(String bookingName, String bookingDate, int bookingPhone, String bookingEmail, int bookingPersons, int FK_activityId) {
        this.bookingName = bookingName;
        this.bookingDate = bookingDate;
        this.bookingPhone = bookingPhone;
        this.bookingEmail = bookingEmail;
        this.bookingPersons = bookingPersons;
        this.FK_activityId = FK_activityId;
    }

    public Booking(int bookingId, String bookingName, String bookingDate, int bookingPhone, String bookingEmail, int bookingPersons, int FK_activityId) {
        this.bookingId = bookingId;
        this.bookingName = bookingName;
        this.bookingDate = bookingDate;
        this.bookingPhone = bookingPhone;
        this.bookingEmail = bookingEmail;
        this.bookingPersons = bookingPersons;
        this.FK_activityId = FK_activityId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getBookingPhone() {
        return bookingPhone;
    }

    public void setBookingPhone(int bookingPhone) {
        this.bookingPhone = bookingPhone;
    }

    public String getBookingEmail() {
        return bookingEmail;
    }

    public void setBookingEmail(String bookingEmail) {
        this.bookingEmail = bookingEmail;
    }

    public int getBookingPersons() {
        return bookingPersons;
    }

    public void setBookingPersons(int bookingPersons) {
        this.bookingPersons = bookingPersons;
    }

    public int getFK_activityId() {
        return FK_activityId;
    }

    public void setFK_activityId(int FK_activityId) {
        this.FK_activityId = FK_activityId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingName='" + bookingName + '\'' +
                ", bookingDate='" + bookingDate + '\'' +
                ", bookingPhone=" + bookingPhone +
                ", bookingEmail='" + bookingEmail + '\'' +
                ", bookingPersons=" + bookingPersons +
                ", FK_activityId=" + FK_activityId +
                '}';
    }
}
