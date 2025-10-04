package Sprint2;

import Sprint2.model.Apple;
import Sprint2.model.Food;
import Sprint2.model.Meat;
import Sprint2.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] items = {
                new Meat(5, 100.0),
                new Apple(10, 50.0, Sprint2.model.constants.Colour.RED),
                new Apple(8, 60.0, Sprint2.model.constants.Colour.GREEN)
        };

        ShoppingCart cart = new ShoppingCart(items);

        System.out.printf("Общая сумма без скидки: " + cart.getTotalAmountWithoutDiscount());
        System.out.printf("Общая сумма со скидкой: " + cart.getTotalAmountWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов: " + cart.getVegetarianAmount());
    }
}
