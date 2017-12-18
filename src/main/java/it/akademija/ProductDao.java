package it.akademija;

import java.util.List;

public interface ProductDao {
    List<Products> getProducts();
    void createProduct(Products product);

    void deleteProduct(String name);
}
