package com.nan.cookbook.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.nan.cookbook.entity.Recipe;
import com.nan.cookbook.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecipeQueryResolver implements GraphQLQueryResolver {
    @Autowired
    private RecipeService recipeService;

    public Recipe recipe (String title)
    {
        return recipeService.getRecipeDetailsByTitle(title);
    }
}
