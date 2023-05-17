package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Discount;

public class Meat extends Food {
    public Meat(int amount, double price, boolean isVegetarian) {
        super(amount, price, isVegetarian);
    }

    @Override
    public double getDiscount() {
        return Discount.DEFAULT_DISCOUNT;
    }
}