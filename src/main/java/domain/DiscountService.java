package domain;

public class DiscountService {

    public static Price applyDiscount(Price price, Double discount) {
        return new Price(price.getAmount() - price.getAmount() * discount / 100, price.getCurrency());
    }

}
