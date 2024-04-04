package assignment1_2_andmore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter total budget for the month: ");
        double totalBudget = scanner.nextDouble();
        scanner.nextLine();

        PinoyBudgetTrackingSystem budgetTracker = new PinoyBudgetTrackingSystem(totalBudget);

       
        System.out.println("Enter initial budgets for each category:");
        String[] categoryNames = {"Food", "Transportation", "School Accessories", "Shopping"};
        for (String category : categoryNames) {
            System.out.print(category + ": ");
            double initialBudget = scanner.nextDouble();
            budgetTracker.addCategory(category, initialBudget);
        }

       
        System.out.println("\nEnter expenses for each category:");
        for (String category : categoryNames) {
            System.out.print("Expense for " + category + ": ");
            double expense = scanner.nextDouble();
            budgetTracker.recordExpense(category, expense);
        }

      
        System.out.println("\nRemaining budgets:");
        for (String category : categoryNames) {
            System.out.println(category + ": " + budgetTracker.viewRemainingBudget(category));
        }

      
        System.out.println("\nTotal budget for the month: " + budgetTracker.viewTotalBudget());

    
        System.out.println("Remaining budget for the month: " + budgetTracker.viewRemainingBudget());

       
        System.out.println("\nCategories and Budgets:");
        Map<String, Double> allCategories = budgetTracker.viewAllCategories();
        for (Map.Entry<String, Double> entry : allCategories.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

