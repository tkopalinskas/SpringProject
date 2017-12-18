package it.akademija;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryProductDAO implements ProductDao {
    private final List<Products> products = new CopyOnWriteArrayList<>();
    @Override
    public List<Products> getProducts() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public void createProduct(Products product) {
        products.add(product);
    }

    @Override
    public void deleteUser(String name) {
        for (Products product :products){
            if(name.equals(product.getName())){
                products.remove(product);
                break;
            }
        }
    }
}
