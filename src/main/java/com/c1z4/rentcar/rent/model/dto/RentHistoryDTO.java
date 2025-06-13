package com.c1z4.rentcar.rent.model.dto;

import java.time.LocalDateTime;

public class RentHistoryDTO {

    private LocalDateTime rentDate;
    private LocalDateTime returnDate;
    private int rentTime;
    private boolean delayStatus;
    private CarDTO carCode;
    private MemberDTO memberCode;
    private MemberDTO memberName;

    public RentHistoryDTO() {
    }

    public RentHistoryDTO(LocalDateTime rentDate, LocalDateTime returnDate, int rentTime, boolean delayStatus, CarDTO carCode, MemberDTO memberCode, MemberDTO memberName) {
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.rentTime = rentTime;
        this.delayStatus = delayStatus;
        this.carCode = carCode;
        this.memberCode = memberCode;
        this.memberName = memberName;
    }

    public LocalDateTime getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDateTime rentDate) {
        this.rentDate = rentDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
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

    public MemberDTO getMemberName() {
        return memberName;
    }

    public void setMemberName(MemberDTO memberName) {
        this.memberName = memberName;
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
                ", memberName=" + memberName +
                '}';
    }
}