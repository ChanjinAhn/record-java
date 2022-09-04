package io.oikk.algorithm.sort;

public class DigitArraySort {


    static int[] insertionSort(int[] numbers){
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


//    void MergeSort(int[] numbers){
//
//    }
}
