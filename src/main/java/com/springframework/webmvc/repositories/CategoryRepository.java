package com.springframework.webmvc.repositories;

import com.springframework.webmvc.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long>{
}
