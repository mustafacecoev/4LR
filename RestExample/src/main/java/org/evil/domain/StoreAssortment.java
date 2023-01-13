package org.evil.domain;


public class StoreAssortment {
    private Cars[] carss;
    private int[] quantity;

    public StoreAssortment(Cars[] carss, int[] quantity) {
        this.carss = carss;
        this.quantity = quantity;
    }

    public StoreAssortment() {
    }

    public void setQuantityFromIndex(int index, int value) {
        try {
            quantity[index] = value;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Cars[] getCarss() {
        return carss;
    }

    public void setCarss(Cars[] carss) {
        this.carss = carss;
    }

    public int[] getQuantity() {
        return quantity;
    }

    public void setQuantity(int[] quantity) {
        this.quantity = quantity;
    }
}
