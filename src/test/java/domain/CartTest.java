package domain;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void shouldAddTwoApplePencilToTheCart() {
        Item apple_pencil = new Item("Apple Pencil", new Price(49.00, Currency.USD));
//        domain.Item sony_wireless_headphone = new domain.Item("Sony Wireless Headphone");
        Cart cart = new Cart();

        cart.addItem(apple_pencil, 2);

        Map<Item, Integer> items = cart.getItems();
        assertEquals(2, items.get(apple_pencil));
    }

    @Test
    void shouldRemoveApplePencilFromTheCard() {
        Item apple_pencil = new Item("Apple Pencil", new Price(49.00, Currency.USD));
        Cart cart = new Cart();
        cart.addItem(apple_pencil, 2);

        cart.removeItem(apple_pencil);

        Map<Item, Integer> items = cart.getItems();
        assertEquals(0, items.size());
    }

    @Test
    void shouldReturnRemovedItems() {
        Item apple_pencil = new Item("Apple Pencil", new Price(49.00, Currency.USD));
        Item sony_headphone = new Item("Sony Headphone", new Price(49.00, Currency.USD));
        Cart cart = new Cart();
        cart.addItem(apple_pencil, 2);
        cart.addItem(sony_headphone, 1);
        cart.removeItem(apple_pencil);
        cart.removeItem(sony_headphone);

        Queue<Item> removedItems = cart.getRemovedItems();

        assertTrue(removedItems.contains(apple_pencil));
        assertTrue(removedItems.contains(sony_headphone));
    }

    @Test
    void ShouldDifferentiateTwoCartsWithSameItems() {
        Item apple_pencil = new Item("Apple Pencil", new Price(49.00, Currency.USD));
        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.addItem(apple_pencil, 1);
        cart2.addItem(apple_pencil, 1);

        assertNotEquals(cart1, cart2);
    }


}