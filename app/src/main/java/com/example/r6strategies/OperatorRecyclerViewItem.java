package com.example.r6strategies;

import com.example.r6strategies.Modelli.OperatoreSpot;

public class OperatorRecyclerViewItem {// Save car name.
    private String carName;

    public OperatoreSpot os;

    // Save car image resource id.
    private int carImageId;

    public OperatorRecyclerViewItem(String carName, int carImageId,OperatoreSpot os) {
        this.carName = carName;
        this.carImageId = carImageId;
        this.os=os;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarImageId() {
        return carImageId;
    }

    public void setCarImageId(int carImageId) {
        this.carImageId = carImageId;
    }
}