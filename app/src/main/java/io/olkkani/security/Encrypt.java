package io.olkkani.security;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encrypt {
    // 임의 salt 값 추가
    String salt = "j2l8zd0hbs7lc";

    public String sha256Encrypt(String s) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt.getBytes());
        md.update(s.getBytes());
        return String.format("%064x", new BigInteger(1, md.digest()));
    }

}
