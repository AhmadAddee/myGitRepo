package company.com.userView;

import company.com.model.RecipeWeek;

import java.util.List;

public class User extends Person implements IUser {

    private List<RecipeWeek> recipeWeekList;


    @Override
    public void printBanner() {
        System.out.print("User type selected: User\n\n" +
                "Please choose one of the following operations:\n" +
                "[1] List my weeks\n[2] List recipes\n" +
                "[3] View recipe\n[4] Generate a new week\n" +
                "Option: _");
    }

    @Override
    public void sessionLoop() {
        super.sessionLoop();
    }

    @Override
    public void viewRecipeWeek() {

    }

    @Override
    public void generateRecipeWeek() {

    }

    @Override
    public void ViewRecipe() {

    }

    @Override
    public void viewRecipePool() {

    }

}
