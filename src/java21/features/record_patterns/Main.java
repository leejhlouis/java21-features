package java21.features.record_patterns;

import java21.features.record_patterns.models.DrinkItem;
import java21.features.record_patterns.models.FoodItem;
import java21.features.record_patterns.models.Item;

public class Main {
  public static void main(String[] args) {
    var foodItem = new FoodItem("Avocado", 8.72);
    var drinkItem = new DrinkItem("Boba", 10.99);

    printDetails(foodItem);
    printDetails(drinkItem);
  }

  private static void printDetails(Item item) {
    // NEW: Java 21 introduced record patterns, simplifying variable initialization
    if (item instanceof FoodItem(var name, var price)) {
      System.out.println(STR."Food item with name \{name} has price \{price}");
    } else if (item instanceof DrinkItem(var name, var price)) {
      System.out.println(STR."Drink item with name \{name} has price \{price}");
    }
  }
}
