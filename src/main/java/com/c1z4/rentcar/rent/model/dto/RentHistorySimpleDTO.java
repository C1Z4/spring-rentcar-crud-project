package com.c1z4.rentcar.rent.model.dto;

import java.time.LocalDateTime;

public class RentHistorySimpleDTO {
    private LocalDateTime rentDate;
    private int rentTime;
    private boolean delayStatus;
    private int carCode;
    private int memberCode;

    public RentHistorySimpleDTO() {}

    public RentHistorySimpleDTO(LocalDateTime rentDate, int rentTime, boolean delayStatus, int carCode, int memberCode) {
        this.rentDate = rentDate;
        this.rentTime = rentTime;
        this.delayStatus = delayStatus;
        this.carCode = carCode;
        this.memberCode = memberCode;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public int getRentTime() {
        return rentTime;
    }

    public void setRentTime(int rentTime) {
        this.rentTime = rentTime;
    }

    public boolean isDelayStatus() {
        return delayStatus;
    }

    public void setDelayStatus(boolean delayStatus) {
        this.delayStatus = delayStatus;
    }

    public int getCarCode() {
        return carCode;
    }

    public void setCarCode(int carCode) {
        this.carCode = carCode;
    }

    public int getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(int memberCode) {
        this.memberCode = memberCode;
    }

    @Override
    public String toString() {
        return "RentHistorySimpleDTO{" +
                "rentDate=" + rentDate +
                ", rentTime=" + rentTime +
                ", delayStatus=" + delayStatus +
                ", carCode=" + carCode +
                ", memberCode=" + memberCode +
                '}';
    }
}
