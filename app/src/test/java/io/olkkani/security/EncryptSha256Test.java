package io.olkkani.security;

import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EncryptSha256Test {


    @DisplayName("SHA256 암호화 테스트")
    @Test
    void encryptTest () throws NoSuchAlgorithmException {
        // given
        String text = "sha256testtext";
        Encrypt sha256 = new Encrypt();

        // when
        String encrypt = sha256.sha256Encrypt(text);
        System.out.println(encrypt);
        // then

    }
}
