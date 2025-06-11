package com.c1z4.rentcar.rent.model.dto;

public class CarDTO {
    private int carCode;
    private String carNum;
    private int carPrice;
    private String rentLocation;
    private boolean rentStatus;
    private int modelCode;

    public CarDTO() {}

    public CarDTO(int carCode, String carNum, int carPrice, String rentLocation, boolean rentStatus, int modelCode) {
        this.carCode = carCode;
        this.carNum = carNum;
        this.carPrice = carPrice;
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

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
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
                ", carNum='" + carNum + '\'' +
                ", carPrice=" + carPrice +
                ", rentLocation='" + rentLocation + '\'' +
                ", rentStatus=" + rentStatus +
                ", modelCode=" + modelCode +
                '}';
    }
}
