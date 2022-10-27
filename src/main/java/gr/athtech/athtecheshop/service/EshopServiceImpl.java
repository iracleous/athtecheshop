package gr.athtech.athtecheshop.service;

import gr.athtech.athtecheshop.model.Product;
import gr.athtech.athtecheshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EshopServiceImpl implements  EshopService {

     private ProductRepository products;


    @Override
    public int login(String userName, String password) {
        return 0;
    }

    @Override
    public List<Product> showProducts() {
        return products.findAll();
    }

    @Override
    public int createBasket(int userId) {
        return 0;
    }

    @Override
    public void addToBasket(int basketId, int productId) {

    }

    @Override
    public void pay(int userId, int basketId, double amount) {

    }

    @Override
    public void addProduct(Product product) {
        products.save(product);
    }
}
