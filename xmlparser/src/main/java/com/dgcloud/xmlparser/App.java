package com.dgcloud.xmlparser;

import com.dgcloud.xmlparser.model.ArqCart;
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
            p.parse("D:\\Projeto_FREEELANCER\\xmlParser\\113571_20190617_Protocolo_Abertura_signed.xml");            
            //System.out.println(p.getFieldData("NamedIndividual","nome"));
            ArqCart ar = p.getArqCart();
            System.out.println("Criador Serventia " + ar.getCriadorServentia());
        }catch (Exception e) {
            System.err.println("Erro " + e.getMessage());
        }
    }
}
