package com.springframework.webmvc.services;

import com.springframework.webmvc.commands.RecipeCommand;
import com.springframework.webmvc.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(String id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(String id);

    void deleteById(String id);
}
