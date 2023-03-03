package com.cocktailproject.Cocktail_Project.dao;

import com.cocktailproject.Cocktail_Project.model.Cocktail;

import java.util.ArrayList;
import java.util.List;

public class MemoryCocktailDao implements CocktailDao {

    private static List<Cocktail> cocktailsList = new ArrayList<>();

    public MemoryCocktailDao(){
        if (cocktailsList.size() == 0){
            setCocktails();
        }
    }

    @Override
    public List<Cocktail> cocktail() {
        return null;
    }

    @Override
    public Cocktail get(int id) {
        for (Cocktail cocktail : cocktailsList) {
            if (cocktail.getId() == id) {
                return cocktail;
            }
        }
        return null;
    }

    private void setCocktails(){
        cocktailsList.add(new Cocktail(1,
                "Manhattan",
                "Source Unknown",
                "2 oz bourbon, 1 oz Sweet Vermouth, 2 dashes Angostura Bitters",
                "Coupe",
                "Combine with ice, stir and strain."));
        cocktailsList.add(new Cocktail(2,
                "Old Fashioned",
                "Source Unknown",
                "2 oz bourbon, 1 barspoon Simple Syrup, 2 dashes Angostura Bitters",
                "Old Fashioned",
                "Combine with ice, stir and strain."));
    }

}
