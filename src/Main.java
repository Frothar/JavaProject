import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] numbers = {64, 34, 25, 12, 22, 11, 90};

    System.out.println("Original Array: " + Arrays.toString(numbers));

    int[] bubbleSorted = Arrays.copyOf(numbers, numbers.length);
    BubbleSort.bubbleSort(bubbleSorted);
    System.out.println("Bubble Sort: " + Arrays.toString(bubbleSorted));

    int[] mergeSorted = MergeSort.mergeSort(numbers);
    System.out.println("Merge Sort: " + Arrays.toString(mergeSorted));
  }
}
