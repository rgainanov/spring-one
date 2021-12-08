package ru.gb.spring.lesson1.homework;

import java.util.HashMap;
import java.util.Map;

public class HospitalOne implements Hospital {
    private Map<String, Integer> doctorsOfficeMap = new HashMap<String, Integer>() {{
        put("Doctor1", 100);
        put("Doctor2", 200);
    }};

    private Map<String, String> doctorsWorkHours = new HashMap<String, String>() {{
        put("Doctor1", "11AM - 3PM");
        put("Doctor2", "9AM - 12AM");
    }};

    @Override
    public String getHealthHistory(PatientImpl patient) {
        return (patient.getName() + " health history");
    }

    @Override
    public int getDoctorsOffice(Doctor doctor) {
        return doctorsOfficeMap.get(doctor.getName());
    }

    @Override
    public String getDoctorsSchedule(Doctor doctor) {
        return doctorsWorkHours.get(doctor.getName());
    }
}
