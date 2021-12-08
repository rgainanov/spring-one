package ru.gb.spring.lesson1.homework;

public interface Patient {
    String getName();

    void setHospital(Hospital hospital);

    void setDoctor(Doctor doctor);

    void setName(String name);

    void goToHospitalReception();
}
