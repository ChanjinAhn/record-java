package io.oikk.api;


import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class SteamAPITest {

    @Test
    public void steamFileterAndTaskWhileTest(){
        long[] numbers = {10L, 5L, 1L, 2L, 3L, 10L, 20L, 5L};

        long[] filterResult = SteamAPI.filterExample(numbers, 3);
        long[] taskWhileResult = SteamAPI.taskWhileExample(numbers, 3);

        System.out.println(Arrays.toString(numbers));
        System.out.println("filter result: " + Arrays.toString(filterResult));
        System.out.println("taskWhile result: " + Arrays.toString(taskWhileResult));
    }

}
