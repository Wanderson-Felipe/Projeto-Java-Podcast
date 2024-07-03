package br.com.senac.atividade3uc10.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Podcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    private String nomedoepisodio;
    private int numeroepisodio;
    private String duracao;
    private String url;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getNomedoepisodio() {
        return nomedoepisodio;
    }

    public void setNomedoepisodio(String nomedoepisodio) {
        this.nomedoepisodio = nomedoepisodio;
    }

    public int getNumeroepisodio() {
        return numeroepisodio;
    }

    public void setNumeroepisodio(int numerodoepisodio) {
        this.numeroepisodio = numerodoepisodio;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
