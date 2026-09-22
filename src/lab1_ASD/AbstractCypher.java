package lab1_ASD;

import javax.crypto.Cipher;
import java.security.Key;

public abstract class AbstractCypher {

    protected Cipher cypher;
    private Key key;

    public AbstractCypher() {
        super();
    }

    public byte[] encrypt(byte[] plaintext) throws Exception {
        cypher.init(Cipher.ENCRYPT_MODE, key);
        return cypher.doFinal(plaintext);
    }

    public byte[] decrypt(byte[] ciphertext) throws Exception {
        cypher.init(Cipher.DECRYPT_MODE, key);
        return cypher.doFinal(ciphertext);
    }

    public Cipher getCypher() {
        return cypher;
    }

    public void setCypher(Cipher cypher) {
        this.cypher = cypher;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
