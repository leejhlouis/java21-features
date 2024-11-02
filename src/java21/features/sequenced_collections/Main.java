package java21.features.sequenced_collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
  public static void main(String[] args) {
    // NEW: Java 21 introduced `getFirst()`, `getLast()`, `addFirst()`, and `addLast()` methods
    System.out.println("ArrayList example");
    var arrayList = new ArrayList<>(Arrays.asList("Athens", "Beijing", "Canberra"));
    arrayList.addFirst("Apple");
    arrayList.addLast("Elderberry");

    System.out.println(arrayList);
    System.out.println(arrayList.getFirst());
    System.out.println(arrayList.getLast());

    System.out.println("\nDeque example");
    var deque = new ArrayDeque<>(Arrays.asList("Dublin", "Edinburgh", "Frankfurt"));
    deque.addFirst("Apple");
    deque.addLast("Elderberry");

    System.out.println(deque);
    System.out.println(deque.getFirst());
    System.out.println(deque.getLast());

    System.out.println("\nLinkedHashSet example");
    var linkedHashSet = new LinkedHashSet<>(Arrays.asList("Gibraltar", "Hanoi", "Indianapolis"));
    linkedHashSet.add("Elderberry");

    System.out.println(linkedHashSet);
    System.out.println(linkedHashSet.getFirst());
    System.out.println(linkedHashSet.getLast());
  }
}