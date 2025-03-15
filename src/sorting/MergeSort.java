package sorting;

import java.util.ArrayList;
import java.util.List;
import comparable.IMyComparable;

public class MergeSort<T extends IMyComparable<T>> implements ISortingAlgorithm<T> {

  public void sort(List<T> list) {
    if (list.size() <= 1) {
      return;
    }
    List<T> sorted = mergeSort(list);
    for (int i = 0; i < sorted.size(); i++) {
      list.set(i, sorted.get(i));
    }
  }

  private List<T> mergeSort(List<T> list) {
    if (list.size() <= 1) {
      return list;
    }
    int mid = list.size() / 2;
    List<T> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
    List<T> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

    return merge(left, right);
  }

  private List<T> merge(List<T> left, List<T> right) {
    List<T> merged = new ArrayList<>();
    int i = 0, j = 0;

    while (i < left.size() && j < right.size()) {
      if (left.get(i).compareTo(right.get(j)) <= 0) {
        merged.add(left.get(i));
        i++;
      } else {
        merged.add(right.get(j));
        j++;
      }
    }

    while (i < left.size()) {
      merged.add(left.get(i));
      i++;
    }
    while (j < right.size()) {
      merged.add(right.get(j));
      j++;
    }

    return merged;
  }
}
