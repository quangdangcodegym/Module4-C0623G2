package com.cg.customermvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    @GetMapping("")
    public String getAll(Model model) {
        model.addAttribute("message", "Ly Ly Mãi Yêu Anh Quang");
        return "list";
    }
}
