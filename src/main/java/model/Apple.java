package model;

import static model.constants.Colour.RED;
import static model.constants.Discount.RED_APPLE_DISCOUNT;

public class Apple extends Food {

    private String Colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.Colour = colour;
    }

    @Override
    public double getDiscount() {
        if (RED.equalsIgnoreCase(Colour)) {
            return RED_APPLE_DISCOUNT;
        }
        return 0.0;
    }
}
