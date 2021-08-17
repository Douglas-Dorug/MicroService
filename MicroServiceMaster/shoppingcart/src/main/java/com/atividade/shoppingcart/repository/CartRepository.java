package com.atividade.shoppingcart.repository;

import com.atividade.shoppingcart.models.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
