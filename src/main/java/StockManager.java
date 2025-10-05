package main.java;

import java.util.HashMap;
import java.util.Map;

public class StockManager {
    private Map<String, Integer> stock = new HashMap<>();

    public void addStock (String product, int quantity){
        if (quantity < 0){
            throw new IllegalArgumentException(" Quantity cannot be negative: " + quantity);
        }
        stock.put(product, stock.getOrDefault(product, 0) + quantity);
    }
    public void reduceStock(String product) throws OutOfStockException{
        int current = stock.getOrDefault(product, 0);
        if (current <=0) {
            throw new OutOfStockException(" Product " + product + " is out of stock ");
        }
        stock.put(product, current - 1);
    }
    public int getStock(String product){
        return stock.getOrDefault(product, 0);
    }
    public Map<String, Integer> getStock() {
        return stock;
    }
}
