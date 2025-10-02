package Sprint_2;

import Sprint_2.model.Apple;
import Sprint_2.model.Food;
import Sprint_2.model.Meat;
import Sprint_2.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food[] items = {
                new Meat(5, 100),
                new Apple(10, 50, Sprint_2.model.constants.Colour.RED),
                new Apple(8, 60, Sprint_2.model.constants.Colour.GREEN)
        };

        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("Общая сумма без скидки: " + cart.getTotalAmountWithoutDiscount());
        System.out.println("Общая сумма со скидкой: " + cart.getTotalAmountWithDiscount());
        System.out.println("Сумма вегетарианских продуктов: " + cart.getVegetarianAmount());
    }
}
