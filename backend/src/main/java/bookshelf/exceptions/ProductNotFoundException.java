package bookshelf.exceptions;

import bookshelf.models.entities.Product;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long productId){
        super(String.format("Product with id '%s' not found", productId));
    }
}
