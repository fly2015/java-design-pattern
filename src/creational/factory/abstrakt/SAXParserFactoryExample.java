/*
 * SAXParserFactoryExample.java
 *
 * Copyright by Hien Ng
 * Da Nang, VN
 * All rights reserved.
 */
package creational.factory.abstrakt;

import java.io.StringReader;
import java.util.jar.Attributes;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SAXParserFactoryExample
{
    public static void main(String[] args)
    {
        // ============================================= 
        // Abstract Factory Interface:: javax.xml.parsers.SAXParserFactory
        
        // ============================================= 
        // Concrete Factory Classes:
        // Different XML parsers, such as Xerces and Crimson, provide their own implementations of the SAXParserFactory interface, like 
        // com.sun.org.apache.xerces.internal.jaxp.SAXParserFactoryImpl
        
        // ============================================= 
        // Abstract Products:
        // org.xml.sax.SAXParser
        
        String xmlContent = "<note><to>Tove</to><from>Jani</from></note>";

        try
        {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler()
            {
                boolean toElement = false;
                boolean fromElement = false;

                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
                {
                    if (qName.equalsIgnoreCase("to"))
                    {
                        toElement = true;
                    }
                    else if (qName.equalsIgnoreCase("from"))
                    {
                        fromElement = true;
                    }
                }


                public void characters(char[] ch, int start, int length) throws SAXException
                {
                    if (toElement)
                    {
                        System.out.println("To: " + new String(ch, start, length));
                        toElement = false;
                    }
                    else if (fromElement)
                    {
                        System.out.println("From: " + new String(ch, start, length));
                        fromElement = false;
                    }
                }
            };

            parser.parse(new InputSource(new StringReader(xmlContent)), handler);
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