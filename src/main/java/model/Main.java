package model;


import service.ShoppingCart;

import static model.constants.Colour.GREEN;
import static model.constants.Colour.RED;

public class Main {
    public static void main(String[] args) {

        Food Meat = new Meat(5, 100.0);
        Food redApple = new Apple(10, 50, RED);
        Food greenApple = new Apple(8, 60, GREEN);

        Food[] foods = new Food[] {Meat, redApple, greenApple };

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма без скидки: " + cart.TotalWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.TotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.VegeterianTotal());
    }
}
