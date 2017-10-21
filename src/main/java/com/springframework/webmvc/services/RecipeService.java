package com.springframework.webmvc.services;

import com.springframework.webmvc.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
