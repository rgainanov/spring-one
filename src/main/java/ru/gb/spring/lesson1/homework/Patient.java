package ru.gb.spring.lesson1.homework;

public class Patient {
    private String name;
    private Hospital hospital;
    private Doctor doctor;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void goToHospitalReception() {
        String healthHistory = hospital.getHealthHistory(this);
        int drOfficeNr = hospital.getDoctorsOffice(doctor);
        String drSchedule = hospital.getDoctorsSchedule(doctor);
        System.out.println(
                "Dr. " + doctor.getName() + " : works - " + drSchedule + ", in - " + drOfficeNr
                        + ". " + "[health history] - " + healthHistory + "."
        );
    }

}
