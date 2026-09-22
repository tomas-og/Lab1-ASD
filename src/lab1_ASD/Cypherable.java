package lab1_ASD;

public interface Cypherable {

	byte[] encrypt(byte[] plaintext) throws Exception;

	byte[] decrypt(byte[] ciphertext) throws Exception;

}