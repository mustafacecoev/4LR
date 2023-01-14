package org.evil.domain;

public class UserReserve {
    private Cars cars;
    private int quantity;

    public UserReserve() {
        this.cars = new Cars();
        this.quantity = 0;
    }

    public UserReserve(Cars cars, int quantity) {
        this.cars = cars;
        this.quantity = quantity;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
