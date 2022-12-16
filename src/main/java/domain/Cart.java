package domain;

import java.util.*;

public class Cart {
    private final Map<Item, Integer> items = new HashMap<>();
    private final Queue<Item> removedItems = new LinkedList<>();
    private boolean isCheckedOut = false;

    public void addItem(Item item, Integer quantity) {
        items.put(item, items.getOrDefault(item, 0) + quantity);
    }

    public void removeItem(Item item) {
        items.remove(item);
        removedItems.add(item);
    }

    public Order checkout() {
        isCheckedOut = true;
        List<Item> itemList = new ArrayList<>();

        items.forEach((item, quantity) -> {
            for (int i = 0; i < quantity; i++) {
                itemList.add(item);
            }
        });
        return new Order(itemList);
    }

    public Queue<Item> getRemovedItems() {
        return removedItems;
    }

    public Map<Item, Integer> getItems() {
        return items;
    }

}
