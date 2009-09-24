/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sabre.hd.easysr.xml;

import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.*;

/**
 *
 * @author SG0894301
 */
public class XmlTemplateReader {

    private String templatePath;
    private Element element;


    public XmlTemplateReader (){
    }
    public XmlTemplateReader (String xmlTemplatePath){
        this.templatePath = xmlTemplatePath;
    }
    public String getFieldValue (String fieldName){
          try {
      // BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      // System.out.print("Enter XML File name: ");
       String xmlFile = this.templatePath;
       File file = new File(this.templatePath);
       if(file.exists()){
         // Create a factory
         DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
         // Use the factory to create a builder
         DocumentBuilder builder = factory.newDocumentBuilder();
         Document doc = builder.parse(xmlFile);
         // Get a list of all elements in the document, which have fieldName as an element name
         NodeList list = doc.getElementsByTagName(fieldName);
         this.element = (Element)list.item(0);
      //   System.out.println(element.getTextContent());
    //     return element.getTextContent();
       }
       else{
         System.out.print("File not found!");
       }
     }
     catch (Exception e) {
       System.exit(1);
     }
          return element.getTextContent();
    }
}