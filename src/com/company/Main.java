package com.company;
import java.sql.*;
import java.text.ParseException;


public class Main {
    public static void main(String[] args) throws ParseException {

        Hospital chinmayaHospital = new Hospital("Chinmaya", "bangalore");

        Patient priyanka = new Patient("priyanka", "bangalore", "2021-03-01");
        Patient priya = new Patient("priyanka", "bangalore","2021-03-02");
        Patient nishi = new Patient("priyanka", "patna","2021-03-03");
        Patient shambhavi = new Patient("priyanka", "bangalore","2021-03-04");

        chinmayaHospital.addPatient(priyanka,priya,nishi,shambhavi);
        System.out.println(chinmayaHospital.getLocalPatientPercentageforDates("2021-03-01", "2021-03-03"));
    }
}
