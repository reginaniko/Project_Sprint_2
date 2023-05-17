package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100, false);
        Food redApples = new Apple(10, 50, true, Colour.RED);
        Food greenApples = new Apple(8, 60, true, Colour.GREEN);

        Food[] items = { meat, redApples, greenApples };
        ShoppingCart shoppingCart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " +
                shoppingCart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " +
                shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Общая сумма вегетарианских продуктов без скидки: " +
                shoppingCart.getTotalVegetarianPriceWithoutDiscount());
    }
}
