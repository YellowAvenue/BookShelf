package bookshelf.controllers;

import bookshelf.models.entities.*;
import bookshelf.models.repository.*;
import bookshelf.models.services.MakerService;
import bookshelf.models.services.OrderService;
import bookshelf.models.services.ProductService;
import bookshelf.models.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class tests {
    final MakerService makerService;
    final OrderService orderService;
    final Product_typeRepo product_typeService;
    final ProductService productService;
    final UserService userService;


    public tests(MakerService makerService, OrderService orderService, Product_typeRepo product_typeService,
                 ProductService productService, UserService userService) {
        this.makerService = makerService;
        this.orderService = orderService;
        this.product_typeService = product_typeService;
        this.productService = productService;
        this.userService = userService;
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @ResponseBody
    public List<Order> getOrders(){
        return orderService.findAll();
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> getProducts(){
        return productService.findAll();
    }

    @RequestMapping(value = "/makers", method = RequestMethod.GET)
    @ResponseBody
    public List<Maker> getMakers(){
        return makerService.findAll();
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public List<User> getUsers(){
        return userService.findAll();
    }

    @RequestMapping(value = "/product_types", method = RequestMethod.GET)
    @ResponseBody
    public List<Product_type> getProduct_types(){
        return product_typeService.findAll();
    }
}
