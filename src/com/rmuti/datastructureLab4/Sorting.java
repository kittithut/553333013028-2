package com.rmuti.datastructureLab4;

import java.util.Arrays;

public class Sorting {

	public static int[] selectionSort(int[] arr) {
		int minIndex, temp, loop = 0;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
				loop++;
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.print(loop + " - ");
		return arr;
	}

	public static int[] bubbleSort(int[] arr) {
		int temp, loop = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				loop++;
			}
		}
		System.out.print(loop + " - ");
		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		int loop = 0;
		int[] sortedData = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    sortedData[j] = arr[i];
                } else if (arr[i] < sortedData[j]) {
                    for (int k = i; k > j; k--) {
                        sortedData[k] = sortedData[k - 1];
                    }
                    sortedData[j] = arr[i];
                    break;
                }
                loop++;
            }
        }
		System.out.print(loop + " - ");
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 2999, 900, 23, 22, 34, 799, 78, 1000, 90, 1, 67, 0, 1200 };
		System.out.println("Selection Sort : "
				+ Arrays.toString(selectionSort(arr)));
		System.out.println("Bubble Sort : " + Arrays.toString(bubbleSort(arr)));
		System.out.println("Insertion Sort : " + Arrays.toString(insertionSort(arr)));
	}
}
