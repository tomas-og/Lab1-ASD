package lab1_ASD;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class AESCypher extends AbstractCypher {

    public AESCypher() throws Throwable {
        super();
        cypher = Cipher.getInstance("AES");

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        super.setKey(keyGen.generateKey());
        super.setCypher(Cipher.getInstance("AES/ECB/PKCS5Padding"));
    }

}
