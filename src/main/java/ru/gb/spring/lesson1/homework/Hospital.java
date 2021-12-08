package ru.gb.spring.lesson1.homework;

public interface Hospital {
    String getHealthHistory(PatientImpl patient);

    int getDoctorsOffice(Doctor doctor);

    String getDoctorsSchedule(Doctor doctor);
}
