package io.oikk.algorithm.sort;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DigitArraySortTest {

    int[] numbers;
    int[] thenResult;
    long beforeTime;
    long afterTime;
    long secDiffTime;

    private final DigitArraySort sort = new DigitArraySort();

    @BeforeAll
    void numbersInit () {
        numbers = new int[]{8,3,7,5,4,2};
        thenResult = new int[]{2, 3, 4, 5, 7, 8};
    }

    void beforeRunTimeCheck () {
        beforeTime = System.currentTimeMillis();
    }

    void afterRunTimeCheck() {
        afterTime = System.currentTimeMillis();
        secDiffTime = (afterTime - beforeTime);
        System.out.println("메소드 실행 시간: " +secDiffTime);
    }

    @DisplayName("삽입 정렬 시간 테스트")
    @Test
    void insertionSort(){
        // given

        // when
        int[] result = sort.insertionSort(numbers);

        // then
        assertThat(thenResult).isEqualTo(result);

    }

    @DisplayName("버블 정렬 시간 테스트")
    @Test
    void bubbleSortTest(){
        // given

        // when
        int[] result = sort.bubbleSort(numbers);

        // then
        assertThat(thenResult).isEqualTo(result);
    }

    @DisplayName("선택 정렬 테스트")
    @Test
    void selectionSort () {
        // given

        // when
        int[] result = sort.selectionSort(numbers);

        // then
        assertThat(thenResult).isEqualTo(result);
    }
    @DisplayName("카운팅 정렬 테스트")
    @Test
    void countingSort () {
        // given

        // when
        int[] result = sort.countingSort(numbers, 11);

        // then
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
