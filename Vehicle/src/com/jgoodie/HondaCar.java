package com.jgoodie;

public class HondaCar extends Car {

    private boolean engineStarted = false;
    private boolean stereoOn = false;
    private boolean backupCameraEngaged = false;
    private boolean parkingBreakEngaged = false;

    public HondaCar(String vehicleType, String model, int year, int doors, int weight, boolean engineStarted, boolean stereoOn, boolean backupCameraEngaged, boolean parkingBreakEngaged) {
        super(vehicleType, "Honda", model, year, 4, doors, weight);
        this.engineStarted = engineStarted;
        this.stereoOn = stereoOn;
        this.backupCameraEngaged = backupCameraEngaged;
        this.parkingBreakEngaged = parkingBreakEngaged;
        System.out.println("HondaCar constructor");
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        this.engineStarted = engineStarted;
    }

    public boolean isStereoOn() {
        return stereoOn;
    }

    public void setStereoOn(boolean stereoOn) {
        this.stereoOn = stereoOn;
    }

    public boolean isBackupCameraEngaged() {
        return backupCameraEngaged;
    }

    public void setBackupCameraEngaged(boolean backupCameraEngaged) {
        this.backupCameraEngaged = backupCameraEngaged;
    }

    public boolean isParkingBreakEngaged() {
        return parkingBreakEngaged;
    }

    public void setParkingBreakEngaged(boolean parkingBreakEngaged) {
        this.parkingBreakEngaged = parkingBreakEngaged;
    }
}
