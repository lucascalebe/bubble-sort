package com.tinnova.bubblesort;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] array = {5, 3, 2, 4, 7, 1, 0, 6};

    System.out.println("Unsorted array: " + Arrays.toString(array));

    bubbleSort(array);

    System.out.println("Sorted array: " + Arrays.toString(array));
  }

  public static void bubbleSort(int[] array) {
    int length = array.length;
    boolean isValueSwapped;

    for (int i = 0; i < length - 1; i++) {
      isValueSwapped = false;

      for (int j = 0; j < length - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          isValueSwapped = true;
        }
      }

      if (!isValueSwapped) {
        break;
      }
    }
  }
}
