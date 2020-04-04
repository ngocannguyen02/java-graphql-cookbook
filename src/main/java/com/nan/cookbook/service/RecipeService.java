package com.nan.cookbook.service;

import com.nan.cookbook.entity.Recipe;

public interface RecipeService {
    public Recipe getRecipeDetailsByTitle(String title);
    public Recipe createRecipeRecord(Recipe recipe);
}