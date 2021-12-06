package ru.gb.spring.lesson1.classwork;

import org.springframework.stereotype.Component;

@Component("cameraRoll")
public class ColorCameraRoll implements CameraRoll{
    @Override
    public void processing() {
        System.out.println("1 color frame");
    }
}
