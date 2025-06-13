package com.c1z4.rentcar.like.model.dto;

public class CarLikeDTO {

    private int carCode;
    private String carNumber;
    private int rentPrice;
    private boolean liked;

    public CarLikeDTO() {}

    public CarLikeDTO(int carCode, String carNumber, int rentPrice, boolean liked) {
        this.carCode = carCode;
        this.carNumber = carNumber;
        this.rentPrice = rentPrice;
        this.liked = liked;
    }

    @Override
    public String toString() {
        return "CarLikeDTO{" +
                "carCode=" + carCode +
                ", carNumber='" + carNumber + '\'' +
                ", rentPrice=" + rentPrice +
                ", liked=" + liked +
                '}';
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

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }
}
