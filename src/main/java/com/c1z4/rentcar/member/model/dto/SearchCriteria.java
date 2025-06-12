package com.c1z4.rentcar.member.model.dto;

public class SearchCriteria {

    private Integer codeValue;
    private String nameValue;
    private String phoneValue;

    public SearchCriteria() {
    }

    public SearchCriteria(Integer codeValue, String nameValue, String phoneValue) {
        this.codeValue = codeValue;
        this.nameValue = nameValue;
        this.phoneValue = phoneValue;
    }

    public Integer getCodeValue() {
        return codeValue;
    }

    public void setCodeValue(Integer codeValue) {
        this.codeValue = codeValue;
    }

    public String getNameValue() {
        return nameValue;
    }

    public void setNameValue(String nameValue) {
        this.nameValue = nameValue;
    }

    public String getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(String phoneValue) {
        this.phoneValue = phoneValue;
    }

    @Override
    public String toString() {
        return "SearchCriteria{" +
                "codeValue=" + codeValue +
                ", nameValue='" + nameValue + '\'' +
                ", phoneValue='" + phoneValue + '\'' +
                '}';
    }
}
