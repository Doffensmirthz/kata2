package software.ulpgc.kata2;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String s = "España";
        byte[] bytes = s.getBytes(StandardCharsets.ISO_8859_1);
        //System.out.println("longitud de la string =" + s.length());
        //System.out.println("longitud del array =" + bytes.length);
    }
}
