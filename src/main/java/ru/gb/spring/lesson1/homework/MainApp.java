package ru.gb.spring.lesson1.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.gb.spring.lesson1.homework.AppConfig;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Patient patient = context.getBean("patient", Patient.class);
        patient.goToHospitalReception();
        Doctor doctor = context.getBean("doctor", Doctor.class);
        doctor.seePatient(patient);
    }
}
