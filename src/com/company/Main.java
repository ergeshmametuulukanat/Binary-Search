package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-5, -2, 1, 5, 6, 8, 10, 20};
        System.out.println(binarySearch(arr, 1, 0, arr.length - 1));
        System.out.println(binarySearch(arr, 1));
    }
    //Рекурсия
    private static int binarySearch(int[] sortedArray, int key, int low, int high) {
        int middle = low + (high - low) / 2;

        if (low > high) {
            return -1;
        }

        if (key == sortedArray[middle]) {
            return middle;
        } else if (key < sortedArray[middle]) {
            return binarySearch(sortedArray, key, low, middle - 1);
        } else {
            return binarySearch(sortedArray, key, middle + 1, high);
        }
    }

    private static int binarySearch(int[] sortedArray, int key) {
        int low = 0;
        int high = sortedArray.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < sortedArray[middle]) {
                high = middle - 1;
            } else if (key > sortedArray[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
