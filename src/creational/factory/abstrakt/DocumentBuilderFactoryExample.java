/*
 * DocumentBuilderFactoryExample.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package creational.factory.abstrakt;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class DocumentBuilderFactoryExample
{
    // ============================================= 
    // Abstract Factory Interface:: javax.xml.parsers.DocumentBuilderFactory
    
    // ============================================= 
    // Concrete Factory Classes:
    // com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl (for Xerces XML parser)
    // com.sun.org.apache.crimson.jaxp.DocumentBuilderFactoryImpl (for Crimson XML parser)
    
    // ============================================= 
    // Abstract Products:
    // org.w3c.dom.Document
    // org.w3c.dom.Element
    
    public static void main(String[] args)
    {
        String xmlContent = "<?xml version=\"1.0\"?><note><to>Tove</to><from>Jani</from></note>";
        try
        {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(new ByteArrayInputStream(xmlContent.getBytes()));

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}



/*
 * Changes:
 * $Log: $
 */