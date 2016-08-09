package com.spring.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class Cifrador
{
    public Cifrador()
    {
    }
     /**
     * Metodo que incripta una palabra
     * @param passPhrase palabra secreta para encriptar
     * @param str palabra que se desea encriptar
     * @return String con la palabra encriptada
     */
    public String encriptar(String passPhrase, String str)
    {
        Cipher ecipher = null;
        Cipher dcipher = null;
        try
        {
            java.security.spec.KeySpec keySpec = new PBEKeySpec(passPhrase.toCharArray(), SALT_BYTES, ITERATION_COUNT);
            SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
            ecipher = Cipher.getInstance(key.getAlgorithm());
            dcipher = Cipher.getInstance(key.getAlgorithm());
            java.security.spec.AlgorithmParameterSpec paramSpec = new PBEParameterSpec(SALT_BYTES, ITERATION_COUNT);
            ecipher.init(1, key, paramSpec);
            dcipher.init(2, key, paramSpec);
        }
        catch(NoSuchPaddingException e)
        {
            e.printStackTrace();
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch(InvalidKeyException e)
        {
            e.printStackTrace();
        }
        catch(InvalidKeySpecException e)
        {
            e.printStackTrace();
        }
        catch(InvalidAlgorithmParameterException e)
        {
            e.printStackTrace();
        }
        try
        {
            byte utf8[] = str.getBytes("UTF8");
            byte enc[] = ecipher.doFinal(utf8);
            return (new BASE64Encoder()).encode(enc);
        }
        catch(BadPaddingException e) { }
        catch(IllegalBlockSizeException e) { }
        catch(UnsupportedEncodingException e) { }
        return null;
    }

     /**
     * Metodo que desencripta una palabra
     * @param passPhrase palabra secreta para encriptar
     * @param str palabra que se desea encriptar
     * @return String con la palabra desencriptada
     */
    public String desencriptar(String passPhrase, String str)
    {
        Cipher ecipher = null;
        Cipher dcipher = null;
        try
        {
            java.security.spec.KeySpec keySpec = new PBEKeySpec(passPhrase.toCharArray(), SALT_BYTES, ITERATION_COUNT);
            SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);
            ecipher = Cipher.getInstance(key.getAlgorithm());
            dcipher = Cipher.getInstance(key.getAlgorithm());
            java.security.spec.AlgorithmParameterSpec paramSpec = new PBEParameterSpec(SALT_BYTES, ITERATION_COUNT);
            ecipher.init(1, key, paramSpec);
            dcipher.init(2, key, paramSpec);
        }
        catch(NoSuchPaddingException e)
        {
            e.printStackTrace();
        }
        catch(NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        catch(InvalidKeyException e)
        {
            e.printStackTrace();
        }
        catch(InvalidKeySpecException e)
        {
            e.printStackTrace();
        }
        catch(InvalidAlgorithmParameterException e)
        {
            e.printStackTrace();
        }
        try
        {
            byte dec[] = (new BASE64Decoder()).decodeBuffer(str);
            byte utf8[] = dcipher.doFinal(dec);
            return new String(utf8, "UTF8");
        }
        catch(BadPaddingException e)
        {
            e.printStackTrace();
        }
        catch(IllegalBlockSizeException e)
        {
            e.printStackTrace();
        }
        catch(UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    private static byte SALT_BYTES[] = {
        -6, 61, -35, 36, 81, -123, -53, -85
    };
    private static int ITERATION_COUNT = 512;

}
