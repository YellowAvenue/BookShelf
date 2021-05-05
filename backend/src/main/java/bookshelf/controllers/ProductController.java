package bookshelf.controllers;

import bookshelf.models.dto.ProductDto;
import bookshelf.models.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        //TODO здесь может быть ошибка
        return productService.findProductById(id);
    }
//    @GetMapping("/df")
//    @ResponseBody
//    public ProductDto getProductById(){
//        System.out.println("asdf");
//        //TODO здесь может быть ошибка
//        return productService.findProductById(1L);
//    }
}
