package Converter;

import Dao.ProductDao;
import Entity.Category;
import Entity.Product;
import Model.ProductRequest;

public class Productconverter {
    public static Product convertToEntity(ProductRequest request) {
        Product product = new Product();
        product.setProduct_Name(request.getName());
        product.setPrice(request.getPrice());
        product.setDescription(request.getDescription());
        product.setQuantity(request.getQuantity());
        product.setCategory(new Category(request.getCategory()));

        return product;

    }
}

