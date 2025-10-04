package Sprint2.model;

import java.util.Objects;

import static Sprint2.model.constants.Colour.RED;
import static Sprint2.model.constants.Discount.RED_APPLE_DISCOUNT;
import static Sprint2.model.constants.Discount.NO_DISCOUNT;

public class Apple extends Food {
    private final String color;

    public Apple(Integer amount, Double price, String color) {
        super(amount, price, true);
        this.color = color;
    }

    public Double getDiscount() {
        return Objects.equals(color, RED) ?
                RED_APPLE_DISCOUNT : NO_DISCOUNT;
    }
}
