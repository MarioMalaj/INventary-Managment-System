package Service;

import Converter.Productconverter;
import Dao.ProductDao;
import Entity.Product;
import Model.ProductRequest;

public class ProductService{
    public void create(ProductRequest request){
        Product product = Productconverter.convertToEntity(request);

        ProductDao dao = new ProductDao();
        dao.createProduct(product);

    }
}
