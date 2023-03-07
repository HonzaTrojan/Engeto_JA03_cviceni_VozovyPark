package com.engeto.vozovyPark;

import java.time.LocalDate;

public class Car {
    String make;
    String type;
    String vehicleRegistrationPlate;
    LocalDate lastTechnicalCheck;
    int mileage;

    ///region Getters and setters
    private String getMake(){
        return make;
    }
    private void setMake(String make){
        this.make = make;
    }

    private String getType() {
        return type;
    }
    private void setType(String type) {
        this.type = type;
    }
    private String getVehicleRegistrationPlate() {
        return vehicleRegistrationPlate;
    }
    public void setVehicleRegistrationPlate(String vehicleRegistrationPlate) {
        this.vehicleRegistrationPlate = vehicleRegistrationPlate;
    }

    public LocalDate getLastTechnicalCheck() {
        return lastTechnicalCheck;
    }
    public void setLastTechnicalCheck(LocalDate lastTechnicalCheck) {
        this.lastTechnicalCheck = lastTechnicalCheck;
    }

    private int getMileage() {
        return mileage;
    }
    private void setMileage(int mileage) {
        this.mileage = mileage;
    }
    ///endregion

    ///region Constructors
    Car (String make, String type, String vehicleRegistrationPlate,
         LocalDate lastTechnicalCheck, int mileage){
        this.make = make;
        this.type = type;
        this.vehicleRegistrationPlate = vehicleRegistrationPlate;
        this.lastTechnicalCheck = lastTechnicalCheck;
        this.mileage = mileage;
    }

    ///endregion



}
