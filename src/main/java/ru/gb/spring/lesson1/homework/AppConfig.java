package ru.gb.spring.lesson1.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.gb.spring.lesson1")
public class AppConfig {
    @Bean
    public Doctor doctor() {
        return new Surgeon("Doctor1");
    }

    @Bean
    public Hospital hospital() {
        return new Hospital();
    }

    @Bean
    public Patient patient(Hospital hospital, Doctor doctor) {
        Patient patient = new Patient("Ivanov");
        patient.setDoctor(doctor);
        patient.setHospital(hospital);
        return patient;
    }
 }
