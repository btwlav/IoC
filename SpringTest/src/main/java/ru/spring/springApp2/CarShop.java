package ru.spring.springApp2;

public class CarShop {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void ShowCost() {
        System.out.println(car.getCost() + " руб.");
    }
}
