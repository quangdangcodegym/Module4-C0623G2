package com.cg.mvcproduct;

import com.cg.mvcproduct.model.Product;
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

    @GetMapping("")
    public String getAllProducts(Model model) {
        model.addAttribute("message", "HELLO EM YÊU");
        return "list";
    }

    @GetMapping("/new")
    public String createProduct(){
        return "create";
    }
    @PostMapping("/new")
    public String insertProduct(@ModelAttribute("product") Product product, BindingResult result, Model model){


        return "create";
    }
}
