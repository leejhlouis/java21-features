package java21.features.unnamed.variables;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> names = List.of("Alice", "Bob", "Charlie");

    // Example #1: Using `_` in a for loop
    var total = 0;
    for (var _ : names) {
      total++;
    }
    System.out.println(STR."Total names: \{total}");

    // Example #2: Using `_` in a try catch
    try {
      System.out.println(STR."Last element \{names.getLast()}");
    } catch (Exception _) {
      System.out.println(STR."An error occurred");
    }
  }
}
