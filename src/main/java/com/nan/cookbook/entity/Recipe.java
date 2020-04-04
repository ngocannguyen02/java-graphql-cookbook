package com.nan.cookbook.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipe {
    private String title;
    private String description;
    private List<Ingredient> ingredients;
}