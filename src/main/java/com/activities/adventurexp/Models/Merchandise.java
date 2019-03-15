package com.activities.adventurexp.Models;

public class Merchandise {
    int merchId, merchStock;
    String merchName, merchDesc;
    double merchPrice;

    public Merchandise(int merchId, int merchStock, String merchName, String merchDesc, double merchPrice) {
        this.merchId = merchId;
        this.merchStock = merchStock;
        this.merchName = merchName;
        this.merchDesc = merchDesc;
        this.merchPrice = merchPrice;
    }

    public Merchandise(int merchStock, String merchName, String merchDesc, double merchPrice) {
        this.merchStock = merchStock;
        this.merchName = merchName;
        this.merchDesc = merchDesc;
        this.merchPrice = merchPrice;
    }

    public Merchandise() {
    }

    public int getMerchId() {
        return merchId;
    }

    public void setMerchId(int merchId) {
        this.merchId = merchId;
    }

    public int getMerchStock() {
        return merchStock;
    }

    public void setMerchStock(int merchStock) {
        this.merchStock = merchStock;
    }

    public String getMerchName() {
        return merchName;
    }

    public void setMerchName(String merchName) {
        this.merchName = merchName;
    }

    public String getMerchDesc() {
        return merchDesc;
    }

    public void setMerchDesc(String merchDesc) {
        this.merchDesc = merchDesc;
    }

    public double getMerchPrice() {
        return merchPrice;
    }

    public void setMerchPrice(double merchPrice) {
        this.merchPrice = merchPrice;
    }
}
