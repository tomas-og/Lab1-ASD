package lab1_ASD;

public class Runner {

    void main() throws Exception {
        var text = "Attack the castle wall at dawn!";

        RSACypher cypher = new RSACypher();
        var encrypted = cypher.encrypt(text.getBytes("UTF-8"));

        System.out.println(new String(encrypted));
        System.out.println(new String(cypher.decrypt(encrypted)));
    }
}