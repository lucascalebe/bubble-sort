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
    boolean isValueSwapped = true;

    while (isValueSwapped) {
      isValueSwapped = false;
      for (int i = 0; i < array.length - 1; i++) {
        if (array[i] > array[i + 1]) {
          swap(array, i, i + 1);
          isValueSwapped = true;
        }
      }
    }
  }

  private static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
