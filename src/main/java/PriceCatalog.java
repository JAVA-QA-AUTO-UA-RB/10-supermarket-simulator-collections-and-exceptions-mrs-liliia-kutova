package main.java;

import java.util.HashMap;
import java.util.Map;

public class PriceCatalog {
    private Map<String, Double> priceCatalog = new HashMap<>();

    public void addPrice(String product, double price){
        if (price < 0){
            throw new IllegalArgumentException(" Price cannot be negative: " + price);
        }
        priceCatalog.put(product, price);
    }
    public double getPrice(String product) throws NoSuchProductException {
        if (!priceCatalog.containsKey(product)){
            throw new NoSuchProductException (" Product " + product + " not found in catalog ");
        }
        return priceCatalog.get(product);
    }
    public Map<String, Double> getPrices(){
        return new HashMap<>(priceCatalog);
    }
}
