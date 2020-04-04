package com.nan.cookbook.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.nan.cookbook.entity.Recipe;
import com.nan.cookbook.service.RecipeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecipeMutationResolver implements GraphQLMutationResolver {
    @Autowired
    private RecipeService recipeService;

    public Recipe createRecipe (Recipe recipe) {
        return recipeService.createRecipeRecord(recipe);
    }
}

