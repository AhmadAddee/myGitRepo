package company.com;

import company.com.model.RecipePool;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Person person = null;
//        int optionInput;
//
//        printMainMenu();
//        optionInput = scan.nextInt();
//
//        if (optionInput == 1)
//            person = new User();
//        else if (optionInput == 2)
//            person = new Dietician();
//        else
//            System.out.println("Please choose one of the options below! ");
//
//        person.printBanner();
//        optionInput = scan.nextInt();
//
//
//
//    }
//    public static void printMainMenu(){
//        System.out.print("=== Recipe Manager ===" +
//                "\n \n" + "Please choose an user type: \n" +
//                "[1] User \n[2] Dietician" +
//                "\n \n" + "Selected user: _");
        RecipePool recipePool = new RecipePool();
        //recipePool.addRecipe("Pancake");
        System.out.println(recipePool.toString());
        System.out.println(DayOfWeek.of(2));
    }
}
