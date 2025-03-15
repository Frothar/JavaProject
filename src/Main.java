import models.Person;
import models.Product;
import sorting.ISortingAlgorithm;
import sorting.BubbleSort;
import sorting.MergeSort;

import java.util.ArrayList;
import java.util.List;

public class Main {

  // Kody ANSI (dla kolorowego tekstu w konsoli)
  private static final String ANSI_RESET = "\u001B[0m";
  private static final String ANSI_RED   = "\u001B[31m";
  private static final String ANSI_GREEN = "\u001B[32m";

  public static void main(String[] args) {

    // 1. Test sortowania listy Person
    List<Person> people = new ArrayList<>();
    people.add(new Person("Adam", "Kowalski", "12345678901"));
    people.add(new Person("Zofia", "Nowak", "12345678902"));
    people.add(new Person("Adam", "Adamski", "12345678903"));
    people.add(new Person("Beata", "Zielińska", "12345678904"));

    // Bubble Sort
    ISortingAlgorithm<Person> bubbleSortPeople = new BubbleSort<>();
    bubbleSortPeople.sort(people);
    System.out.println("People po Bubble Sort:");
    for (Person p : people) {
      System.out.println(p);
    }
    if (isSorted(people)) {
      System.out.println(ANSI_GREEN + "TEST PASSED" + ANSI_RESET
        + ": Lista Person (BubbleSort) jest posortowana.\n");
    } else {
      System.out.println(ANSI_RED + "TEST FAILED" + ANSI_RESET
        + ": Lista Person (BubbleSort) nie jest posortowana!\n");
    }

    // Przywracamy listę do nieposortowanej postaci
    people.clear();
    people.add(new Person("Adam", "Kowalski", "12345678901"));
    people.add(new Person("Zofia", "Nowak", "12345678902"));
    people.add(new Person("Adam", "Adamski", "12345678903"));
    people.add(new Person("Beata", "Zielińska", "12345678904"));

    // Merge Sort
    ISortingAlgorithm<Person> mergeSortPeople = new MergeSort<>();
    mergeSortPeople.sort(people);
    System.out.println("People po Merge Sort:");
    for (Person p : people) {
      System.out.println(p);
    }
    if (isSorted(people)) {
      System.out.println(ANSI_GREEN + "TEST PASSED" + ANSI_RESET
        + ": Lista Person (MergeSort) jest posortowana.\n");
    } else {
      System.out.println(ANSI_RED + "TEST FAILED" + ANSI_RESET
        + ": Lista Person (MergeSort) nie jest posortowana!\n");
    }

    // 2. Test sortowania listy Product
    List<Product> products = new ArrayList<>();
    products.add(new Product("Monitor", 899.99));
    products.add(new Product("Klawiatura", 99.99));
    products.add(new Product("Laptop", 3599.00));
    products.add(new Product("Mysz", 59.50));

    // Bubble Sort
    ISortingAlgorithm<Product> bubbleSortProducts = new BubbleSort<>();
    bubbleSortProducts.sort(products);
    System.out.println("Products po Bubble Sort (po cenie rosnąco):");
    for (Product prod : products) {
      System.out.println(prod);
    }
    if (isSorted(products)) {
      System.out.println(ANSI_GREEN + "TEST PASSED" + ANSI_RESET
        + ": Lista Product (BubbleSort) jest posortowana.\n");
    } else {
      System.out.println(ANSI_RED + "TEST FAILED" + ANSI_RESET
        + ": Lista Product (BubbleSort) nie jest posortowana!\n");
    }

    // Przywracamy listę do nieposortowanej postaci
    products.clear();
    products.add(new Product("Monitor", 899.99));
    products.add(new Product("Klawiatura", 99.99));
    products.add(new Product("Laptop", 3599.00));
    products.add(new Product("Mysz", 59.50));

    // Merge Sort
    ISortingAlgorithm<Product> mergeSortProducts = new MergeSort<>();
    mergeSortProducts.sort(products);
    System.out.println("Products po Merge Sort (po cenie rosnąco):");
    for (Product prod : products) {
      System.out.println(prod);
    }
    if (isSorted(products)) {
      System.out.println(ANSI_GREEN + "TEST PASSED" + ANSI_RESET
        + ": Lista Product (MergeSort) jest posortowana.\n");
    } else {
      System.out.println(ANSI_RED + "TEST FAILED" + ANSI_RESET
        + ": Lista Product (MergeSort) nie jest posortowana!\n");
    }
  }

  /**
   * Generyczna metoda sprawdzająca, czy lista jest posortowana rosnąco
   * (wg compareTo).
   */
  private static <T extends Comparable<? super T>> boolean isSorted(List<T> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      // jeśli compareTo > 0, to element [i] jest "większy" i nie powinien być przed [i+1]
      if (list.get(i).compareTo(list.get(i + 1)) > 0) {
        return false;
      }
    }
    return true;
  }
}
