package io.oikk.algorithm.sort;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class DigitArraySortTest {

    static int[] numbers;

    @BeforeAll
    static void initNumbers(){
        numbers = new int[]{5,2,4,1,7};
    }

    @DisplayName("삽입 정렬 시간 테스트")
    @Test
    void insertionSort(){
        // given

        // when
        int[] result = DigitArraySort.insertionSort(numbers);

        // then
        int[] thenResult = {1,2,4,5,7};
        assertThat(thenResult).isEqualTo(result);
    }

    @DisplayName("삽입 정렬 시간 테스트2")
    @Test
    void insertionSort2(){
        // given

        // when
        int[] result = DigitArraySort.insertionSort(numbers);

        // then
        int[] thenResult = {1,2,4,5,6};
        assertThat(thenResult).isNotEqualTo(result);
    }

//    @DisplayName("병합 테스트")
//    @Test
//    void MergeTest(){
//        //given
//
//        //when
//
//        //then
//
//
//    }
}
