package com.cg.mvcproduct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    @GetMapping("")
    public String getAllProducts(Model model) {
        model.addAttribute("message", "HELLO EM YÊU");
        return "list";
    }
}
