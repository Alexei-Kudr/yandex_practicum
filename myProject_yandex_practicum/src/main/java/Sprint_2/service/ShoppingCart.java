package Sprint_2.service;

import Sprint_2.model.Food;
import Sprint_2.model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalAmountWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.amount * item.price;
        }
        return total;
    }

    public double getTotalAmountWithDiscount() {
        double total = 0;
        for (Food item : items) {
            double itemPrice = item.amount * item.price;
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                double discount = discountable.getDiscount();
                itemPrice *= (100 - discount) / 100;
            }
            total += itemPrice;
        }
        return total;
    }

    public double getVegetarianAmount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian) {
                total += item.amount * item.price;
            }
        }
        return total;
    }
}
