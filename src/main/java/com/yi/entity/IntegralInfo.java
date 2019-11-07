package com.yi.entity;

public class IntegralInfo {
    private Integer inteId;

    private String stuid;

    private Double number;

    public Integer getInteId() {
        return inteId;
    }

    public void setInteId(Integer inteId) {
        this.inteId = inteId;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public Double getNumber() {
        return number;
    }

    public void setNumber(Double number) {
        this.number = number;
    }
}