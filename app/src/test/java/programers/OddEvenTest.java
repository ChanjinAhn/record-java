package programers;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import programers.oddEven.OddEven;

public class OddEvenTest {


    @DisplayName("홀수 Test")
    @Test
    void oddTest() {
        // given
        int num = 3;
        OddEven oddEven = new OddEven();

        // when
        String answer = oddEven.solution(num);

        // then
        assertThat(answer).isEqualTo("Odd");
    }

    @DisplayName("짝수 Test")
    @Test
    void evenTest() {
        //given
        int num = 4;
        OddEven oddEven = new OddEven();
        // when
        String answer = oddEven.solution(num);

        // then
        assertThat(answer).isEqualTo("Even");
    }



}
