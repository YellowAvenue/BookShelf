package bookshelf.models.services;

import bookshelf.exceptions.ProductNotFoundException;
import bookshelf.models.dto.DtoConverter;
import bookshelf.models.dto.ProductDto;
import bookshelf.models.entities.Product;
import bookshelf.models.repository.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    /**
     *
     * @param productDto dto to save
     */
    public void save(ProductDto productDto){
        productRepo.save(DtoConverter.dtoToProduct(productDto));
    }

    /**
     * Find all products
     *
     * @return products
     */
    public List<ProductDto> findAll(){
        return DtoConverter.productListToDtos(productRepo.findAll());
    }

    public ProductDto findProductById(Long id){
        return DtoConverter.productToDto(productRepo
                .findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id)));
    }

    public List<ProductDto> getListProductsById(List<Long> idList){
        List<ProductDto> productDtos = new ArrayList<>();
        for(Long id : idList){
            productDtos.add(findProductById(id));
        }
        return productDtos;
    }
}
