package Client;

import Model.ProductRequest;

import javax.management.BadAttributeValueExpException;

public class ProductValidator {
    public void validateProduct (ProductRequest request) throws BadAttributeValueExpException {
        if (request.getName()==null) throw new BadAttributeValueExpException(request);
    }
}
