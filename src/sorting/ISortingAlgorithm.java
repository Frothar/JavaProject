package sorting;

import java.util.List;

/**
 * Interfejs dla algorytmów sortujących.
 * @param <T> typ obiektów do sortowania
 */
public interface ISortingAlgorithm<T> {
  void sort(List<T> list);
}
