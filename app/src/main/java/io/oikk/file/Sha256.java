package io.oikk.file;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256 {

    String salt = "j2l8zd0hbs7lc";

    public String sha256Encrypt2(String s) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt.getBytes());
        md.update(s.getBytes());
        return String.format("%064x", new BigInteger(1, md.digest()));
    }

}
