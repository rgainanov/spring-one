package ru.gb.spring.lesson1.classwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.gb.spring.lesson1.classwork")
public class AppConfig {
    @Bean
    public CameraRoll cameraRoll() {
        return new BlackAndWhiteCameraRoll();
    }

    @Bean
    public Camera camera(CameraRoll cameraRoll) {
        Camera camera = new CameraImpl();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }
}
