package me.saniya.template;

public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        CoffeeWithHook coffee = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}
