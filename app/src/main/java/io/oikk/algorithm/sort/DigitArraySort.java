package io.oikk.algorithm.sort;

import java.util.Arrays;

public class DigitArraySort {
    int[] insertionSort(int[] numbers){
        for (int i = 1; i < numbers.length; i++) {
            int number = numbers[i];
            int j = i -1 ;
            while (j >=0 && number < numbers[j]){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = number;
        }
        return numbers;
    }

    int[] bubbleSort(int[] numbers){
        Arrays.sort(numbers);
        for (int i = numbers.length; i > 0; i--) {
            int j = i;
            int k = 0;
                int z = numbers[k];
                while (j > 0 && k+1 < i){
                    if (z < numbers[k+1]){
                        numbers[k] = z;
                        z = numbers[k+1];
                    }else {
                        numbers[k] = numbers[k+1];
                    }
                    k++;
                    j--;
                }
                numbers[k] = z;
        }
        return numbers;
    }

    int[] selectionSort(int[] numbers){
        for (int i = 0; i < numbers.length-1; i++) {
            int index = i;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j] < numbers[index]){
                    index = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }
        return numbers;
    }
}