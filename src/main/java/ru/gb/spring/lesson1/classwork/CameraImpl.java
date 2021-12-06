package ru.gb.spring.lesson1.classwork;

public class CameraImpl implements Camera{

    private CameraRoll cameraRoll;

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    @Override
    public void doPhotograph() {
        System.out.println("click!");
        cameraRoll.processing();
    }
}
