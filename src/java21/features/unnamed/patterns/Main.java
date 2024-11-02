package java21.features.unnamed.patterns;

import java21.features.unnamed.patterns.models.Building;
import java21.features.unnamed.patterns.models.House;

public class Main {
  public static void main(String[] args) {
    var house = new House("123 Main St", 4, true);
    printNoOfBedrooms(house);
  }

  private static void printNoOfBedrooms(Building building) {
    // NEW: unnamed pattern (can use `_` as a placeholder)
    if (building instanceof House(_, var noOfBedrooms, _)) {
      System.out.println(STR."No of bedrooms: \{noOfBedrooms}");
    }
  }
}
