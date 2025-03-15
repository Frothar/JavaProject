package models;

import comparable.IMyComparable;

public class Person implements Comparable<Person>, IMyComparable<Person> {
  private final String firstName;
  private final String lastName;
  private final String pesel;

  public Person(String firstName, String lastName, String pesel) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.pesel = pesel;
  }

  public int compareTo(Person other) {
    // Sortowanie najpierw po imieniu, przy remisie po nazwisku
    int firstNameComparison = this.firstName.compareTo(other.firstName);
    if (firstNameComparison != 0) {
      return firstNameComparison;
    }
    return this.lastName.compareTo(other.lastName);
  }

  public String toString() {
    return firstName + " " + lastName + " (PESEL: " + pesel + ")";
  }
}
