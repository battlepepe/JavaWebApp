package Hashing;

import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

/**
 *
 * @author aforget24
 */
public class Hash256 {
    /**
     * Returns a hexadecimal encoded SHA-256 hash for the input String.
     * @param data */
    public static String get256Hash(String data){
        String result = null;
        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256"); 
            byte[] hash = digest.digest(data.getBytes());
            result = bytesToHex(hash);
        }
        catch(Exception ex)
        {
            
        }
        return result;
    }
    
    private static String bytesToHex(byte[] bytes){
        return DatatypeConverter.printBase64Binary(bytes);
    }
}


