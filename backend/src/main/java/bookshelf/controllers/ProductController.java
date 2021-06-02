package bookshelf.controllers;

import bookshelf.models.dto.ProductDto;
import bookshelf.models.dto.ProductSectionIdDTO;
import bookshelf.models.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products/get/{id}")
    @ResponseBody
    public ProductDto getProductById(@PathVariable Long id){
        System.out.println(id);
        return productService.findProductById(id);
    }

    @PostMapping("/products/getProductsSection")
    @ResponseBody
    public List<ProductDto> getListProductsById(@RequestBody ProductSectionIdDTO productsId){
        return productService.getListProductsById(productsId.getId());
    }
}
