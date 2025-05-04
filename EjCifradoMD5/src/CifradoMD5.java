import java.security.MessageDigest;
public class CifradoMD5 {
    public static String cifrarMD5(String texto) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(texto.getBytes());
        byte[] digest = md.digest();
        StringBuilder resultado = new StringBuilder();
        for (byte b : digest) resultado.append(String.format("%02x", b));
        return resultado.toString();
    }
    public static void main(String[] args) throws Exception {
        System.out.println("MD5: " + cifrarMD5("Hola Mundo"));
    }
}
