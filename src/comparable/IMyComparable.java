package comparable;

public interface IMyComparable<T> {
  /**
   * Porównuje bieżący obiekt z obiektem 'other'.
   * Zwraca:
   * -1 jeśli this < other
   *  0 jeśli this == other
   *  1 jeśli this > other
   */
  int compareTo(T other);
}
