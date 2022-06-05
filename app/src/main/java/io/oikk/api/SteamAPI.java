package io.oikk.api;

import java.util.Arrays;


public class SteamAPI {

    /**
     * More than a variable value in an array, filter
     * @param numbers array
     * @param varNumber variable value
     * @return long[]
     */
    public static long[] filterExample(long[] numbers, long varNumber){
        return Arrays.stream(numbers).filter(num -> num > varNumber).toArray();
    }

    /**
     * More than a variable value in an array, taskWhile
     * @param numbus array
     * @param varNumber variable value
     * @return long[]
     */
    public static long[] taskWhileExample(long[] numbus, long varNumber){
        return Arrays.stream(numbus).takeWhile(num -> num > varNumber).toArray();
    }

}
