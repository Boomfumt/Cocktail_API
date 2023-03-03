package com.cocktailproject.Cocktail_Project.model;

import javax.validation.constraints.*;

public class Cocktail {


    private int id;
    @NotBlank(message = "The name field cannot be left blank.")
    private String name;
    private String author;
    @NotBlank(message = "You can't make a drink without, you know, ingredients.")
    private String ingredients;
    private String glassType;
    private String instructions;

    public Cocktail(int id, String name, String author, String ingredients, String glassType, String instructions) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.ingredients = ingredients;
        this.glassType = glassType;
        this.instructions = instructions;
    }

    public Cocktail(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString(){
        return  "\n ----------------------" +
                "\n Cocktail Instructions" +
                "\n ----------------------" +
                "\n Id: " + id +
                "\n Id: " + name +
                "\n Id: " + author +
                "\n Id: " + ingredients +
                "\n Id: " + glassType +
                "\n Id: " + instructions;

    }
}
