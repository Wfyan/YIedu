package com.yi.entity;

public class OrderInfo {
    private Integer orderId;

    private String stuid;

    private Integer cid;

    private Double price;

    private Integer onpay;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getStuid() {
        return stuid;
    }

    public void setStuid(String stuid) {
        this.stuid = stuid == null ? null : stuid.trim();
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOnpay() {
        return onpay;
    }

    public void setOnpay(Integer onpay) {
        this.onpay = onpay;
    }
}