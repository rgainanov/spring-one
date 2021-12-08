package ru.gb.spring.lesson1.homework;

import java.util.HashMap;
import java.util.Map;

public class Hospital {
    private Map<String, Integer> doctorsOfficeMap = new HashMap<String, Integer>() {{
        put("Doctor1", 100);
        put("Doctor2", 200);
    }};

    private Map<String, String> doctorsWorkHours = new HashMap<String, String>() {{
        put("Doctor1", "11AM - 3PM");
        put("Doctor2", "9AM - 12AM");
    }};


    public String getHealthHistory(Patient patient) {
        return (patient.getName() + " health history");
    }

    public int getDoctorsOffice(Doctor doctor) {
        return doctorsOfficeMap.get(doctor.getName());
    }

    public String getDoctorsSchedule(Doctor doctor) {
        return doctorsWorkHours.get(doctor.getName());
    }
}
