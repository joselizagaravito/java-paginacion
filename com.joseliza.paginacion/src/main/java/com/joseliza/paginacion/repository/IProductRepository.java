package com.joseliza.paginacion.repository;

import com.joseliza.paginacion.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
