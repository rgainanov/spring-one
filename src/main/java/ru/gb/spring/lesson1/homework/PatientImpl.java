package ru.gb.spring.lesson1.homework;

public class PatientImpl implements Patient {
    private String name;
    private Hospital hospital;
    private Doctor doctor;

    public Hospital getHospital() {
        return hospital;
    }

    @Override
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
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
