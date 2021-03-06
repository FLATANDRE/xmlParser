package com.dgcloud.xmlparser.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe modelo com os dados do documento
 */
public class ArqCart {

    private String criadorServentia;
    private String tipoDeMeio;
    private String status;
    private String idioma;
    private String formatoArquivo;
    private String criadorOficial;
    private String dataCriacao;
    private String destinacaoPrevista;
    private String prazoDeGuarda;
    private String dataEliminado;
    private List<String> indentificadorProtocolo;
    private List<String> identificadorMatricula;
    private String indentificadorDocProducao;
    private String preposto;
    private String criadorPreposto;
    private String criadorInteressado;
    private String classe;
    private String numeroDocumento;
    private String titulo;
    private String procedencia;
    private List<String> relacao;

    public String getCriadorServentia() {
        return criadorServentia;
    }

    public void setCriadorServentia(String criadorServentia) {
        this.criadorServentia = criadorServentia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getFormatoArquivo() {
        return formatoArquivo;
    }

    public void setFormatoArquivo(String formatoArquivo) {
        this.formatoArquivo = formatoArquivo;
    }

    public String getCriadorOficial() {
        return criadorOficial;
    }

    public void setCriadorOficial(String criadorOficial) {
        this.criadorOficial = criadorOficial;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDestinacaoPrevista() {
        return destinacaoPrevista;
    }

    public void setDestinacaoPrevista(String destinacaoPrevista) {
        this.destinacaoPrevista = destinacaoPrevista;
    }

    public String getPrazoDeGuarda() {
        return prazoDeGuarda;
    }

    public void setPrazoDeGuarda(String prazoDeGuarda) {
        this.prazoDeGuarda = prazoDeGuarda;
    }

    public String getDataEliminado() {
        return dataEliminado;
    }

    public void setDataEliminado(String dataEliminado) {
        this.dataEliminado = dataEliminado;
    }

    public List<String> getIndentificadorProtocolo() {
        return indentificadorProtocolo;
    }

    public void addIndentificadorProtocolo(String indentificadorProtocolo) {
        if (this.indentificadorProtocolo == null) {
        	this.indentificadorProtocolo = new ArrayList<String>();
        }
        
        this.indentificadorProtocolo.add(indentificadorProtocolo);
    }

    public List<String> getIdentificadorMatricula() {
        return identificadorMatricula;
    }

    public void addIdentificadorMatricula(String identificadorMatricula) {
    	if (this.identificadorMatricula == null) {
    		this.identificadorMatricula = new ArrayList<String>();
    	}
    	
    	this.identificadorMatricula.add(identificadorMatricula);
    }

    public String getIndentificadorDocProducao() {
        return indentificadorDocProducao;
    }

    public void setIndentificadorDocProducao(String indentificadorDocProducao) {
        this.indentificadorDocProducao = indentificadorDocProducao;
    }

    public String getPreposto() {
        return preposto;
    }

    public void setPreposto(String preposto) {
        this.preposto = preposto;
    }

    public String getCriadorPreposto() {
        return criadorPreposto;
    }

    public void setCriadorPreposto(String criadorPreposto) {
        this.criadorPreposto = criadorPreposto;
    }

    public String getCriadorInteressado() {
        return criadorInteressado;
    }

    public void setCriadorInteressado(String criadorInteressado) {
        this.criadorInteressado = criadorInteressado;
    }

    public String getTipoDeMeio() {
        return tipoDeMeio;
    }

    public void setTipoDeMeio(String tipoDeMeio) {
        this.tipoDeMeio = tipoDeMeio;
    }

    public String getClasse() {
		return classe;
	}
    
    public void setClasse(String classe) {
		this.classe = classe;
	}
    
    public String getNumeroDocumento() {
		return numeroDocumento;
	}

    public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
    
    public String getTitulo() {
		return titulo;
	}
    
    public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
        
    public String getProcedencia() {
		return procedencia;
	}

    public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
    
    public List<String> getRelacao() {
		return relacao;
	}

    public void addRelacao(String relacao) {
    	if (this.relacao == null) {
    		this.relacao = new ArrayList<String>();
    	}
    	
    	this.relacao.add(relacao);
    }
}