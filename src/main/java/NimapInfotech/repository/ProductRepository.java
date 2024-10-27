package NimapInfotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NimapInfotech.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}

