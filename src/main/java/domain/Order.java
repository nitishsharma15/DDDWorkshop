package domain;

import java.util.List;

public class Order {
    private final List<Item> items;

    public Order(List<Item> items) {
        this.items = items;
    }
}
