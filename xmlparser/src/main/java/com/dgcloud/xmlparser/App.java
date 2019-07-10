package com.dgcloud.xmlparser;

import com.dgcloud.xmlparser.parser.Parser;

/**
 * Test App
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Parser p = new Parser();
            p.parse("F:\\Projetos_FREELANCER\\xml_parser\\113571_20190617_Protocolo_Abertura_signed.xml");            
            System.out.println(p.getFieldData("Description","label"));
        }catch (Exception e) {
            System.err.println("Erro " + e.getMessage());
        }
    }
}
