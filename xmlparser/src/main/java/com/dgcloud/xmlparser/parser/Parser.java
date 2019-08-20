package com.dgcloud.xmlparser.parser;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.dgcloud.xmlparser.model.ArqCart;

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
                    valores += child.getQualifiedName() + " - " + child.getText() + "\n";
            }
        }

        return valores;
    }

    public ArqCart getArqCart() {
        ArqCart arqCart = new ArqCart();

        for (Iterator<Element> it = this.root.elementIterator(); it.hasNext();) {
            Element foo = it.next();
            
            for (Iterator<Element> it2 = foo.elementIterator(); it2.hasNext();) {
                Element child = it2.next();

                if (child.getQualifiedName().equals("documento-eletronico:meio-armazenamento")) {
                    String valor = child.attributeValue("resource");
                    valor = valor.substring(valor.lastIndexOf("/")+1, valor.length());
                    arqCart.setTipoDeMeio(valor);
                }

                if (child.getQualifiedName().equals("documento-eletronico:status-documento")) {
                    String valor = child.attributeValue("resource");
                    valor = valor.substring(valor.lastIndexOf("/")+1, valor.length());
                    arqCart.setStatus(valor);
                }

                if (child.getQualifiedName().equals("documento-eletronico:nome")) {
                    arqCart.setCriadorServentia(child.getText());
                }

                if (child.getQualifiedName().equals("documento-eletronico:idioma")) {
                    arqCart.setIdioma(child.getText());
                }

                if (child.getQualifiedName().equals("documento-eletronico:formato-arquivo")) {
                    arqCart.setFormatoArquivo(child.getText());
                }

                if (child.getQualifiedName().equals("documento-eletronico:criador-responsavel")) {
                    arqCart.setCriadorOficial(child.getText());
                }

                if (child.getQualifiedName().equals("documento-eletronico:data-producao")) {
                    arqCart.setDataCriacao(child.getText());
                }

                if (child.getQualifiedName().equals("documento-eletronico:destinacao-prevista")) {
                    arqCart.setDestinacaoPrevista(child.getText());
                }

                if (child.getQualifiedName().equals("documento-eletronico:prazo-guarda")) {
                    arqCart.setPrazoDeGuarda(child.getText());
                }
                
                if (child.getQualifiedName().equals("documento-eletronico:classe")) {
                    arqCart.setClasse(child.getText());
                }
                
                if (child.getQualifiedName().equals("documento-eletronico:numero-documento")) {
                    arqCart.setNumeroDocumento(child.getText());
                }
                
                if (child.getQualifiedName().equals("documento-eletronico:procedencia")) {
                    arqCart.setProcedencia(child.getText());
                }
                
                if (child.getQualifiedName().equals("documento-eletronico:identificador-protocolo")) {
                    String text = child.getText();
                    if (text != null) {
                    	text = text.replace("-", "_");
	                    
                    	arqCart.addIndentificadorProtocolo(text);
                    }
                }
                
                if (child.getQualifiedName().equals("documento-eletronico:identificador-matricula")) {
                    arqCart.addIdentificadorMatricula(child.getText());
                }
                
                if (child.getQualifiedName().equals("documento-eletronico:titulo")) {
                    arqCart.setTitulo(child.getText());
                }
                
                if (child.getQualifiedName().equals("documento-eletronico:relacao")) {
                	arqCart.addRelacao(child.getText());
                }
            }
        }

        return arqCart;
    }

}