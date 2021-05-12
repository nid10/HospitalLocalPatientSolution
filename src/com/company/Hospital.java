package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Hospital {
    String name;
    String location;
    ArrayList<Patient> listOfPatientObject = new ArrayList<>();

    public Hospital(String name, String location) {
        this.name = name.toUpperCase();
        this.location = location.toUpperCase();
    }

    public void addPatient(Patient... patientObjects){
        listOfPatientObject.addAll(Arrays.asList(patientObjects));
    }
    public float getLocalPatientPercentageforDates(String startDate, String endDate) throws ParseException {
        int countOfLocalPatient = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateStart = format.parse(startDate);
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        Date dateEnd = format2.parse(endDate);
        for(Patient patient : listOfPatientObject){
            if(patient.location.equals(this.location) && (patient.registrationDate.compareTo(dateStart)==0 || patient.registrationDate.compareTo(dateStart)>0) && (patient.registrationDate.compareTo(dateEnd)==0 ||patient.registrationDate.compareTo(dateEnd)<0)){
                countOfLocalPatient += 1;
            }
        }

        return (((float)countOfLocalPatient/(float)listOfPatientObject.size())*100);
    }

    }

