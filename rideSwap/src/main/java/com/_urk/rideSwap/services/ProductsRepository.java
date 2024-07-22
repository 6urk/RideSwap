package com._urk.rideSwap.services;

import com._urk.rideSwap.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Integer> {




}
