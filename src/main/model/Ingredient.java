package model;

// Represents an ingredient that will be used in a recipe
public class Ingredient {

    protected String name;
    protected double amount;
    protected String unit;

    // REQUIRES: name, amount, and unit must not be empty
    // EFFECTS: initialize an ingredient with a name, amount, and unit of measurement
    public Ingredient(String name, double amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;

    }

    // EFFECTS: return the name of the ingredient
    public String getIngredientName() {
        return name;
    }

    // EFFECTS: return the amount of the ingredient
    public double getIngredientAmount() {
        return amount;
    }

    // EFFECTS: return the unit of the ingredient
    public String getIngredientUnit() {
        return unit;
    }
}
