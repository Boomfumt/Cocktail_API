package com.cocktailproject.Cocktail_Project.dao;

import com.cocktailproject.Cocktail_Project.model.Cocktail;

import java.util.List;

public interface CocktailDao {

    List<Cocktail> cocktail();

    Cocktail get(int id);

}
