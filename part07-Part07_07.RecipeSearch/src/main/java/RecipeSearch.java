
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner fileScan = new Scanner(Paths.get(fileName))) {
            while (fileScan.hasNextLine()) {
                String name = fileScan.nextLine();
                int time = Integer.valueOf(fileScan.nextLine());
                Recipe recipe = new Recipe(name, time);
                while (fileScan.hasNextLine()) {
                    String ingredient = fileScan.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(ingredient);
                }
                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("File non trovato");
        }

        while (true) {
            System.out.println("Commands:");
            System.out.println("list - lists the recipes\r\n" + //
                    "stop - stops the program\r\n" + //
                    "find name - searches recipes by name\r\n" + //
                    "find cooking time - searches recipes by cooking time\r\n" + //
                    "find ingredient - searches recipes by ingredient");
            System.out.println("Enter command:");
            String command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe r : recipes) {
                    System.out.println(r);
                }
            }
            if (command.equals("find name")) {
                System.out.println("Searched word: ");
                String recipe2Find = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(recipe2Find)) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time: ");
                int maxTime = Integer.valueOf(scanner.nextLine());
                for (Recipe recipe : recipes) {
                    if (recipe.getTime() <= maxTime) {
                        System.out.println(recipe);
                    }
                }
            }
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient: ");
                String ingredient = scanner.nextLine();
                for (Recipe recipe : recipes) {
                    ArrayList<String> ingredients = recipe.getIngredients();
                    if (ingredients.contains(ingredient)) {
                        System.out.println(recipe);
                    }

                }
            }
        }
        scanner.close();
    }

}
