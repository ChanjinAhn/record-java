package io.oikk;

import java.io.IOException;

public class Main {

    // 시작 시작과 타이머를 입력받은 후 종료 시간을 출력
    public static void main(String[] args) throws IOException {

        int i = 0, hap = 0;
        String a = "Technology";
        do {
            if (a.charAt(i) == 'o') {

                System.out.println(i);

                hap += i;





                System.out.println(hap);
            }
            i++;
        } while (i < a.length());

        System.out.println(hap);


    }
}

