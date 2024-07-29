package com._urk.rideSwap.repository;

import com._urk.rideSwap.models.Product;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductsRepository extends JpaRepository<Product, Integer> {



        List<Product> findByOwnerId(int ownerId, Sort sort);



}
