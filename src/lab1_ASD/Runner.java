package lab1_ASD;

public class Runner {

    void main() throws Throwable {
        var text = "Attack the castle wall at dawn!";
        
        var fact = CypherFactory.getInstance();
        Cypherable cypher = fact.getCypherable(Algorithm.DES);

        byte[] encrypted = cypher.encrypt(text.getBytes("UTF-8"));

        System.out.println(new String(encrypted));
        System.out.println(new String(cypher.decrypt(encrypted)));



    }
}
