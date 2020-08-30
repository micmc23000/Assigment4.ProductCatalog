package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    ProductService productService;

    @RequestMapping("/products")
    public ModelAndView getProductsPage() {
        String viewName = "/allProducts";
        List<Product> productList = productService.getAllProducts();
        System.out.println("getProductsPage");
        System.out.println(productList);
        return new ModelAndView(viewName, "productList", productList);
    }

    @RequestMapping("/addproduct")
    public ModelAndView getAddProductPage() {
        System.out.println("getAddProductPage");

        String viewName = "/addProduct";
        return new ModelAndView(viewName);
    }
}
