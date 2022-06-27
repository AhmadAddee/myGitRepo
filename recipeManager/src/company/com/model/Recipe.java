package company.com.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String meal;
    private List<String> ingredientsList;
    private List<String> steps;
    private String tag;
    private int id;

    public Recipe(String meal, int id) {
        this.meal = meal;
        ingredientsList = new ArrayList<>();
        steps = new ArrayList<>();
        this.id = id;
    }

    public void addIngredient(String ingredient){
        ingredientsList.add(ingredient);
    }

    public void addStep(String step){
        steps.add(step);
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public int getId(){
        return this.id;
    }

    public String getMeal(){
        return this.meal;
    }

    public String getTag(){
        return this.tag;
    }

    @Override
    public String toString() {
        StringBuilder sB = new StringBuilder(this.getMeal());
        sB.append("\n\n== Ingredients: ==");
        for (String s : ingredientsList){
            sB.append("\n" + s);
        }
        sB.append("\n== Method: ==");
        for (String s : steps){
            sB.append("\n" + s);
        }
        return sB.toString();
    }
}
