package com.adminon.sporty.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.adminon.sporty.entity.Products;
public interface ProductRepository extends JpaRepository<Products, Long> {

}
