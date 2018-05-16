package cartorio.devmob.ftce.usjt.br.cartorio.model;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by carol on 15/04/2018.
 */

public class Fila {
    private int id;
    private String nome;
    private String sigla;

    public Fila(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public Fila() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
