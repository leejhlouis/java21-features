package java21.features.string_templates;

import java21.features.string_templates.models.Product;

public class Main {
  public static void main(String[] args) {
      var product = new Product(1L, "Phone", 1000.0);

      // NEW: Java 21 introduced string template
      var string4 = STR."Product with id \{ product.productId() } is \{ product.name() } and has price $\{ product.price() }";
      System.out.println(string4);
  }
}