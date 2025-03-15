package sorting;

import java.util.List;
import comparable.IMyComparable;

public class BubbleSort<T extends IMyComparable<T>> implements ISortingAlgorithm<T> {

  public void sort(List<T> list) {
    int n = list.size();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - 1 - i; j++) {
        if (list.get(j).compareTo(list.get(j + 1)) > 0) {
          T temp = list.get(j);
          list.set(j, list.get(j + 1));
          list.set(j + 1, temp);
        }
      }
    }
  }
}
