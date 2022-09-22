package io.oikk.algorithm.sort;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DigitArraySortTest {

    int[] numbers;
    long beforeTime;
    long afterTime;
    long secDiffTime;

    private final DigitArraySort sort = new DigitArraySort();


    @Disabled
    @BeforeEach
    void beforeRunTimeCheck () {
        beforeTime = System.currentTimeMillis();
    }

    @Disabled
    @AfterEach
    void afterRunTimeCheck() {
        afterTime = System.currentTimeMillis();
        secDiffTime = (afterTime - beforeTime);
        System.out.println("메소드 실행 시간: " +secDiffTime);
    }

    @DisplayName("삽입 정렬 시간 테스트")
    @Test
    void insertionSort(){
        // given
        numbers = new int[]{5,2,4,1,7};
        // when
        int[] result = sort.insertionSort(numbers);

        // then
        int[] thenResult = {1,2,4,5,7};
        assertThat(thenResult).isEqualTo(result);

    }

    @DisplayName("버블 정렬 시간 테스트")
    @Test
    void bubbleSortTest(){
        // given
        numbers = new int[]{8,3,7,5,4,2};

        // when
        int[] result = sort.bubbleSort(numbers);

        // then
        int[] thenResult = {2,3,4,5,7,8};
        assertThat(thenResult).isEqualTo(result);
    }

    @DisplayName("선택 정렬 테스트")
    @Test
    void selectionSort () {
        // given
        numbers = new int[]{8,3,7,5,4,2};

        // when
        int[] result = sort.selectionSort(numbers);

        // then
        int[] thenResult = {2,3,4,5,7,8};
        assertThat(thenResult).isEqualTo(result);
    }
//    @DisplayName("병합 테스트")2
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
