package com.dgcloud.xmlparser.parser;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.*;
import org.dom4j.io.*;


public class Parser {

    Element root;
    Document document;

    /**
     * Realiza o setup inicial do arquivo de XML
     * 
     * @param path caminho do arquivo XML
     * @throws DocumentException
     */
    public void parse(String path) throws DocumentException {
        File inputFile = new File(path);
        SAXReader reader = new SAXReader();
        this.document = reader.read(inputFile);
        this.root = this.document.getRootElement();
    }


    /**
     * Recupera o valor de um determinado campo em determinado nó(s)
     * 
     * @param elementName nome do nó
     * @param field nome do campo
     * @return O valor do campo
     */
    public String getFieldData(String elementName, String field) {
        String valores = "";
        
        for (Iterator<Element> it = this.root.elementIterator(elementName); it.hasNext();) {
            Element foo = it.next();
            //valores += foo.getName() + "\n";
            //valores += "\t Childs \n";

            for (Iterator<Element> it2 = foo.elementIterator(); it2.hasNext();) {
                Element child = it2.next();

                if (child.getName().equals(field))
                    valores += child.getName() + " - " + child.getText() + "\n";
            }
        }

        return valores;
    }


    

}