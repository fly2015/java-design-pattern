/*
 * KeyPairGeneratorExample.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package creational.factory.abstrakt;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class KeyPairGeneratorExample
{
    public static void main(String[] args) throws NoSuchAlgorithmException
    {
        // ============================================= 
        // Abstract Factory Interface:: KeyPairGenerator
        
        // ============================================= 
        // Concrete Factory Classes:
        // Different cryptographic algorithms and providers (e.g., RSA, DSA, EC) provide their own implementations of the KeyPairGenerator interface.
        
        // ============================================= 
        // Abstract Products:
        // java.security.KeyPair
        // java.security.PublicKey
        // java.security.PrivateKey
        
        KeyPairGenerator keyPairGeneratorRSA = KeyPairGenerator.getInstance("RSA");
        KeyPairGenerator keyPairGeneratorDSA = KeyPairGenerator.getInstance("DSA"); 
        
        
        KeyPair genKeyPairRSA = keyPairGeneratorRSA.genKeyPair();
        PrivateKey privateRSA = genKeyPairRSA.getPrivate();
        PublicKey publicRSA = genKeyPairRSA.getPublic();
        
        System.out.println("Generated Public Key RSA: " + publicRSA);
        System.out.println("Generated Private Key RSA: " + privateRSA);
        
        KeyPair genKeyPairDSA = keyPairGeneratorDSA.genKeyPair();
        PrivateKey privateDSA = genKeyPairDSA.getPrivate();
        PublicKey publicpDSA = genKeyPairDSA.getPublic();
        
        System.out.println("Generated Public Key DSA: " + publicpDSA);
        System.out.println("Generated Private Key DSA: " + privateDSA);
    }
}



/*
 * Changes:
 * $Log: $
 */