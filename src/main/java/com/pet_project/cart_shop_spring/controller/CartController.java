package com.pet_project.cart_shop_spring.controller;

import com.pet_project.cart_shop_spring.service.CartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @RequestMapping("/add")
    public String add(@RequestParam List<Integer> items) {
        cartService.add(items);
        return "товар добавлен";
    }

    @RequestMapping("/get")
    public List<Integer> get() {
        return cartService.get();
    }
}
