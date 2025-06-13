package com.c1z4.rentcar.car;

public class CarDTO {

    private int carCode;
    private String carNumber;
    private int rentPrice;
    private String rentLocation;
    private boolean rentStatus;
    private int modelCode;

    public CarDTO() {}

    public CarDTO(int carCode, String carNumber, int rentPrice, String rentLocation, boolean rentStatus, int modelCode) {
        this.carCode = carCode;
        this.carNumber = carNumber;
        this.rentPrice = rentPrice;
        this.rentLocation = rentLocation;
        this.rentStatus = rentStatus;
        this.modelCode = modelCode;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getRentLocation() {
        return rentLocation;
    }

    public void setRentLocation(String rentLocation) {
        this.rentLocation = rentLocation;
    }

    public boolean isRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(boolean rentStatus) {
        this.rentStatus = rentStatus;
    }

    public int getModelCode() {
        return modelCode;
    }

    public void setModelCode(int modelCode) {
        this.modelCode = modelCode;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "carCode=" + carCode +
                ", carNumber='" + carNumber + '\'' +
                ", rentPrice=" + rentPrice +
                ", rentLocation='" + rentLocation + '\'' +
                ", rentStatus=" + rentStatus +
                ", modelCode=" + modelCode +
                '}';
    }
}
