package main.java;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<String> cart = new ArrayList<>();

    public void addToCart(String product) {
        cart.add(product);
    }

    public double checkout(PriceCatalog catalog, double payment)
            throws NoSuchProductException, InsufficientFundsException {
        double total = 0.0;
        for (String product : cart) {
            total += catalog.getPrice(product);
        }
        total *= 1.10;

        double discountPercent = 5 + Math.random() * 10;
        double discount = total * (discountPercent / 100);
        double finalPrice = total - discount;

        if (payment < finalPrice) {
            throw new InsufficientFundsException(
                    "Not enough funds. Required: " + finalPrice + " , provided: " + payment
            );
        }
        cart.clear();
        return finalPrice;
    }
public List<String> getCart(){
        return new ArrayList<>(cart);
}
}
