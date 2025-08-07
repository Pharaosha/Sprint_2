package service;

import model.Food;

public class ShoppingCart {
    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public  double TotalWithoutDiscount() {
        double total = 0.0;
        for (Food Food : foods) {
            total += Food.getPrice() * Food.getAmount();
        }
        return total;
    }



    public double TotalWithDiscount() {
        double total = 0.0;
        for (Food Food : foods) {
            double discount = Food.getDiscount();
            double discountPrice = Food.getPrice() * (1 - discount/100);
            total += discountPrice * Food.getAmount();
        }
        return total;
    }
    public double VegeterianTotal() {
        double total = 0.0;
        for (Food Food : foods) {
            if (Food != null && Food.isVegetarian()) {
                total += Food.getPrice() * Food.getAmount();
            }
        }
        return total;
    }
}
