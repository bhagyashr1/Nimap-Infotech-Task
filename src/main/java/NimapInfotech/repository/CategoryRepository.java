package NimapInfotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import NimapInfotech.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>
{
}
