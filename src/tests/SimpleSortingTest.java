package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleSortingTest {

  @org.junit.Test
  public void testBubbleSort() {
    // Given: nieposortowana lista
    List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 5, 6));

    // When: wykonujemy sortowanie
    bubbleSort(numbers);

    // Then: sprawdzamy, czy jest posortowana rosnąco
    assertTrue(isSorted(numbers), "Lista powinna być posortowana rosnąco, ale nie jest.");
  }

  private void bubbleSort(List<Integer> list) {
    int n = list.size();
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (list.get(j) > list.get(j + 1)) {
          int temp = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, temp);
        }
      }
    }
  }

  // Sprawdza, czy lista jest posortowana w sposób rosnący
  private boolean isSorted(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      if (list.get(i) > list.get(i + 1)) {
        return false;
      }
    }
    return true;
  }
}
