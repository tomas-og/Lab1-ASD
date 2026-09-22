package lab1_ASD;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

public class RSACypher {

    private Cipher cypher;
    private KeyPair keyRing;

    public RSACypher() throws Throwable {
        super();

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);

        keyRing = keyGen.generateKeyPair();

        cypher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    }

    public byte[] encrypt(byte[] plainText) throws Throwable {
        cypher.init(Cipher.ENCRYPT_MODE, keyRing.getPublic());
        return cypher.doFinal(plainText);
    }

    public byte[] decrypt(byte[] cypherText) throws Throwable {
        cypher.init(Cipher.DECRYPT_MODE, keyRing.getPrivate());
        return cypher.doFinal(cypherText);
    }
}