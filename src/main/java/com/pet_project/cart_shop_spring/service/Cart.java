package com.pet_project.cart_shop_spring.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
@Component
@SessionScope
public class Cart {

    private final List<Integer> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void add(Integer item) {
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
