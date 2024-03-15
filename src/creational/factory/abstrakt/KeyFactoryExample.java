/*
 * KeyFactoryExample.java
 *
 * Copyright by Hien Ng
 * Da Nang, VN
 * All rights reserved.
 */
package creational.factory.abstrakt;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class KeyFactoryExample
{
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException
    {
        // ============================================= 
        // Abstract Factory Interface:: KeyFactory
        
        // ============================================= 
        // Concrete Factory Classes:
        // Different cryptographic algorithms and providers (e.g., RSA, DSA, EC) provide their own implementations of the KeyFactory interface.
        
        // ============================================= 
        // Abstract Products:
        // java.security.PublicKey
        // java.security.PrivateKey
        
        // ======================================== RSA
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        
        PublicKey publicKey = keyPair.getPublic();
        
        System.out.println("Original Public Key RSA: " + publicKey);
        byte[] publicKeyBytes = publicKey.getEncoded();
        
        KeyFactory instanceRSA = KeyFactory.getInstance("RSA");
        X509EncodedKeySpec x509KeySpec = new X509EncodedKeySpec(publicKeyBytes);
        PublicKey generatePublicRSA = instanceRSA.generatePublic(x509KeySpec);
        System.out.println("Regenerated Public Key RSA: " + generatePublicRSA);
        
        
        //========================================== DSA 
        
        keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPair = keyPairGenerator.generateKeyPair();
        publicKey = keyPair.getPublic();
        System.out.println("Original Public Key DSA: " + publicKey);
         publicKeyBytes = publicKey.getEncoded();
        
        KeyFactory instanceDSA = KeyFactory.getInstance("DSA");
        x509KeySpec = new X509EncodedKeySpec(publicKeyBytes);
        PublicKey generatePublicDSA = instanceDSA.generatePublic(x509KeySpec);
        System.out.println("Regenerated Public Key DSA: " + generatePublicDSA);
       
        
        
    }
}



/*
 * Changes:
 * $Log: $
 */