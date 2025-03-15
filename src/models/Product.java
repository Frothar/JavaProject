package models;

import comparable.IMyComparable;

public class Product implements Comparable<Product>, IMyComparable<Product> {
  private final String name;
  private final double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public int compareTo(Product other) {
    // Sortowanie po cenie rosnąco
    return Double.compare(this.price, other.price);
  }

  public String toString() {
    return String.format("%s - %.2f PLN", name, price);
  }
}
