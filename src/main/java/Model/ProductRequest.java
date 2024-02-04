package Model;

import Entity.Product;

import java.util.List;

public class CreateRequest {
    private List<Product> request;

    public List<Product> getRequest() {
        return request;
    }

    public void setRequest(List<Product> request) {
        this.request = request;
    }
}
