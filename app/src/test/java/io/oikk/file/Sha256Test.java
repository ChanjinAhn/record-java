package io.oikk.file;

import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Sha256Test {


    @DisplayName("SHA256 암호화 테스트")
    @Test
    void sha256EncryptTest () throws NoSuchAlgorithmException {
        // given
        String text = "sha256testtext";
        Sha256 sha256 = new Sha256();


        // when
//        String encrypt2 = sha256.sha256Encrypt2(text);

        // then

    }
}
