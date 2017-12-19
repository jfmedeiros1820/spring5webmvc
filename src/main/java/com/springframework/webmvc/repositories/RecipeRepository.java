package com.springframework.webmvc.repositories;

import com.springframework.webmvc.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, String> {
}
