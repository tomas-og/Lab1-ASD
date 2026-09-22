package lab1_ASD;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class DESCypher extends AbstractCypher {

    public DESCypher() throws Throwable{
        super();

        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        keyGen.init(56);
        super.setKey(getKey());
        super.setCypher(Cipher.getInstance("DES/ECB/PKCS5Padding"));
    }
}
