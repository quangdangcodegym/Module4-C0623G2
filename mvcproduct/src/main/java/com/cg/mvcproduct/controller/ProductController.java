package com.cg.mvcproduct.controller;

import com.cg.mvcproduct.bean.Circle;
import com.cg.mvcproduct.bean.Product;
import com.cg.mvcproduct.bean.Rectangle;
import com.cg.mvcproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @Autowired
    private Rectangle rectangle;

    @Autowired
    private Circle circle;

    @ModelAttribute("myAttribute")
    public String addAttributeToModel() {
        return "Hello from @ModelAttribute!";
    }
    @GetMapping
    public String listProducts(Model model, Product ProductCategoryHELLO) {
        System.out.println(rectangle);
        System.out.println(circle);
        return "list";
    }

    @GetMapping("/new")
    public String newProductForm(Model model) {
        Product p = new Product(5L, "Quang", 1200f);
        productService.saveUser(p);
        model.addAttribute("product", p);
        return "new";
    }
    @PostMapping("/new")
    public String saveProduct(Model model, Product ProductCategoryHELLO) {
        return "redirect:/products";
    }
}
