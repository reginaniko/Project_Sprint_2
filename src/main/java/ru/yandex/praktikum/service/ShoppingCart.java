package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPriceWithoutDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            totalPrice += items[i].getAmount() * items[i].getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPiceDiscounted = 0;
        double totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            totalPrice += items[i].getAmount() * items[i].getPrice();
            totalPiceDiscounted += items[i].getAmount() * items[i].getPrice() * items[i].getDiscount();
        }
        double result = totalPrice - totalPiceDiscounted;
        return result;
    }

    public double getTotalVegetarianPriceWithoutDiscount() {
        double totalPriceVegetarian = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                totalPriceVegetarian += items[i].getAmount() * items[i].getPrice();
            }
        }
        return totalPriceVegetarian;
    }
}

