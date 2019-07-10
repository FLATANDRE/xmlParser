package com.dgcloud.xmlparser.parser;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.*;
import org.dom4j.io.*;


public class Parser {

    Element root;
    Document document;

    public void parse(String path) throws DocumentException {
        File inputFile = new File(path);
        SAXReader reader = new SAXReader();
        this.document = reader.read(inputFile);
        this.root = this.document.getRootElement();
    }

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


    public String getFieldValue(String node, String child) {
        final String valores = "";
        List<Node> list = this.document.selectNodes("//" + node + "/" + child);
        list.stream().forEach((item) -> {
            valores.concat(item.getName() + " - attr " + item.getText() + " - value " + item.getStringValue() + "\n");
        });
        return valores.toString();
    }

}