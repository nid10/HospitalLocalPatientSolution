package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient {
    String name;
    String location;
    Date registrationDate;

    public Patient(String name, String location, String registrationDate) throws ParseException {
        this.name = name.toUpperCase();
        this.location = location.toUpperCase();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        this.registrationDate = format.parse(registrationDate);
    }
}
