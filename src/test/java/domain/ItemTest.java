package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {

    @Test
    void shouldCreateItemWith10PercentDiscount() {
        Price price = new Price(10.0, Currency.USD);
        Price discountedPrice = DiscountService.applyDiscount(price, 10.0);
        Item apple_pencil = new Item("Apple Pencil", discountedPrice);

        assertEquals(discountedPrice, apple_pencil.getPrice());
    }
}