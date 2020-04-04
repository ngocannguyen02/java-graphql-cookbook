package com.nan.cookbook.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.nan.cookbook.entity.Recipe;
import com.nan.cookbook.service.RecipeService;

import org.springframework.stereotype.Service;

// TOOO change for something persistent Mongo, Neo4j, MySQL...
@Service
public class RecipeServiceImpl implements RecipeService {

    private Map<String, Recipe> map = new HashMap<>();

    @Override
    public Recipe getRecipeDetailsByTitle (String title)
    {
        return null != title ? map.get(title) : null;
    }

    @Override
    public Recipe createRecipeRecord (Recipe recipe)
    {
        if(null != recipe) {
            map.put(recipe.getTitle(), recipe);
        }
        return recipe;
    }

}