package controle;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

import sun.security.provider.MD5;

public class Criptografia {

    public static String criptografar(String str) {
    	   	
        if (str != null) {
            try {
                MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
                byte messageDigest[] = algorithm.digest(str.getBytes("UTF-8"));

                StringBuilder hexString = new StringBuilder();

                for (byte b : messageDigest) {
                    hexString.append(String.format("%02X", 0xFF & b));
                }
                System.out.println("TESTE CRYP: "+hexString.toString());
                return hexString.toString();

            } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
                Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
