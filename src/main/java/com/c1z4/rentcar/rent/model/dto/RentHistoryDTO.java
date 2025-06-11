package com.c1z4.rentcar.rent.model.dto;

import java.sql.Date;

public class RentHistoryDTO {
    private Date rentDate;
    private Date returnDate;
    private int rentTime;
    private boolean delayStatus;
    private CarDTO carCode;
    private MemberDTO memberCode;

    public RentHistoryDTO() {}

    public RentHistoryDTO(Date rentDate, Date returnDate, int rentTime, boolean delayStatus, CarDTO carCode, MemberDTO memberCode) {
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentTime = rentTime;
        this.delayStatus = delayStatus;
        this.carCode = carCode;
        this.memberCode = memberCode;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public void setRentDate(Date rentDate) {
        this.rentDate = rentDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
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

    public CarDTO getCarCode() {
        return carCode;
    }

    public void setCarCode(CarDTO carCode) {
        this.carCode = carCode;
    }

    public MemberDTO getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(MemberDTO memberCode) {
        this.memberCode = memberCode;
    }

    @Override
    public String toString() {
        return "RentHistoryDTO{" +
                "rentDate=" + rentDate +
                ", returnDate=" + returnDate +
                ", rentTime=" + rentTime +
                ", delayStatus=" + delayStatus +
                ", carCode=" + carCode +
                ", memberCode=" + memberCode +
                '}';
    }
}
