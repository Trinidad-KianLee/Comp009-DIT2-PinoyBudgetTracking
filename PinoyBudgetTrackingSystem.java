package assignment1_2_andmore;

import java.util.*;

public class PinoyBudgetTrackingSystem {
    private Map<String, Double> categories;
    private double totalBudget;

    public PinoyBudgetTrackingSystem(double totalBudget) {
        this.totalBudget = totalBudget;
        categories = new HashMap<>();
    }

   
    public void addCategory(String category, double initialBudget) {
        categories.put(category, initialBudget);
    }

   
    public void recordExpense(String category, double expense) {
        if (categories.containsKey(category)) {
            double currentBudget = categories.get(category);
            categories.put(category, currentBudget - expense);
        }
    }

  
    public double viewRemainingBudget(String category) {
        return categories.getOrDefault(category, 0.0);
    }

    
    public double viewTotalBudget() {
        return totalBudget;
    }

  
    public double viewRemainingBudget() {
        double totalExpense = 0;
        for (double budget : categories.values()) {
            totalExpense += budget;
        }
        return totalBudget - totalExpense;
    }

 
    public Map<String, Double> viewAllCategories() {
        return new HashMap<>(categories);
    }
}
