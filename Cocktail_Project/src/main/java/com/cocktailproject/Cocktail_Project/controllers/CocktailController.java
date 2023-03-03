package com.cocktailproject.Cocktail_Project.controllers;

import com.cocktailproject.Cocktail_Project.dao.CocktailDao;
import com.cocktailproject.Cocktail_Project.model.Cocktail;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CocktailController {

    private CocktailDao cocktailDao;

    public CocktailController(CocktailDao cocktailDao){
        this.cocktailDao = cocktailDao;
    }

    @RequestMapping(path = "/cocktails/{id}", method = RequestMethod.GET)
    public Cocktail get(@PathVariable int id){
        return cocktailDao.get(id);
    }


}
