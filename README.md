# Classe utilitária para coletar dados de um arquivo RDF+XML 
Classe que gera um objeto ArqCart com dados de um arquivo XML. Esta classe é bem específica para os arquivos semelhantes aos que estão neste projeto.
<br> 113571_20190617_Protocolo_Encerra_signed.xml
<br> 113571_20190617_Protocolo_Abertura_signed.xml

# com.dgcloud.xmlparser.parser.Parser
Classe que lê o arquivo e retorna um objeto ArqCart.
<br> O método inicial é **parse()**, deve ser informado o path do arquivo a ser transformado.
<br> O método que gera o objeto com os dados é **getArqCart()**.
<br>

# com.dgcloud.xmlparser.model.ArqCart
Classe com os dados do XML.

# Build
Para gerar o build com as dependências, o camando abaixo deve ser executado.
<br>
<br> mvn clean compile assembly:single
<br>
<br>Será gerado um pacote JAR na pasta target.
