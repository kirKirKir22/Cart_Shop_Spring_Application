package com.pet_project.cart_shop_spring.service;


import java.util.List;

public interface CartService {

    void add(List<Integer> items);

    List<Integer> get();
}
