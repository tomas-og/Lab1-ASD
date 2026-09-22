package lab1_ASD;

public class VernamCypher extends AbstractCypher {

    private String key;

    public void setKey(String key) {
        this.key = key;
    }

    public byte[] encrypt(byte[] plaintext) {
        byte[] result = new byte[plaintext.length];

        for (int i = 0; i < plaintext.length; i++) {
            result[i] = (byte) (plaintext[i] ^ key.charAt(i % key.length()));
        }

        return result;
    }

    public byte[] decrypt(byte[] ciphertext) {
        return encrypt(ciphertext);
    }
}