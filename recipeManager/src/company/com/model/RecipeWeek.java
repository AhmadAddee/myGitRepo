package company.com.model;

import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

public class RecipeWeek {
    private Map<DayOfWeek, Recipe> dayRecipeMapping;
    private int weekId;

    public RecipeWeek(Map<DayOfWeek, Recipe> dayRecipeMapping) {
        this.dayRecipeMapping = dayRecipeMapping;
        weekId = 0;
    }
}
