package com.example.r6strategies;



public class OperatorRecyclerViewItem {// Save car name.
    private String carName;

    // Save car image resource id.
    private int carImageId;

    private String info;

    public OperatorRecyclerViewItem(String carName, int carImageId) {
        this.carName = carName;
        this.carImageId = carImageId;
        info = "spot a ";

    }

    public OperatorRecyclerViewItem(String carName, int carImageId,String info) {
        this.carName = carName;
        this.carImageId = carImageId;
        this.info = info;

    }

    public String getCarName() {
        return carName;
    }

    public String getInfo() {
        return info;
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