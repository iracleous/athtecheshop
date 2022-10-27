package gr.athtech.athtecheshop.service;

import gr.athtech.athtecheshop.model.Product;

import java.util.List;

public interface EshopService {

    int login(String userName, String password);
    List<Product> showProducts();
    int createBasket(int userId);
    void addToBasket(int basketId, int productId);
    void pay(int userId, int basketId, double amount);


    void addProduct(Product product);
}
