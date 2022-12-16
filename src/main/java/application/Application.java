package application;

import domain.Cart;
import domain.Currency;
import domain.Item;
import domain.Price;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Item apple_pencil = new Item("Apple Pencil", new Price(10.0, Currency.USD));

        cart.addItem(apple_pencil, 2);
    }
}
