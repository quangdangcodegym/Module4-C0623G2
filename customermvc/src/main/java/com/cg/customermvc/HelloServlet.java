package com.cg.customermvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class HelloServlet {
    @GetMapping("")
    public String listCustomer(Model model) {
        model.addAttribute("message", "HELLO CODEYGYM");
        return "list";
    }
}