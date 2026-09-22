package lab1_ASD;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

import javax.crypto.Cipher;

public class RSACypher extends AbstractCypher {

    private KeyPair keyRing;

    public RSACypher() throws Exception {
        super();

        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);

        keyRing = keyGen.generateKeyPair();

        this.setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding"));
    }

    public byte[] encrypt(byte[] plainText) throws Exception {
        super.setKey(keyRing.getPublic());
        return super.encrypt(plainText);
    }

    public byte[] decrypt(byte[] cypherText) throws Exception {
        super.setKey(keyRing.getPrivate());
        return super.decrypt(cypherText);
    }
}
