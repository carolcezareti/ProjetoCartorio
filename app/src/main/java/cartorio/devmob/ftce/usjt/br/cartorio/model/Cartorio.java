package cartorio.devmob.ftce.usjt.br.cartorio.model;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by carol on 07/04/2018.
 */

public class Cartorio {
    private Date data_inicio;
    private Date data_termino;
    private Date previsao_inicio, previsao_termino  ;
    private String nome_servico, tipo_servico, senha;
    private Fila fila;

    public Cartorio(Date previsao_inicio, Date previsao_termino, String nome_servico, String tipo_servico, String senha, Date data_inicio, Date data_fim) {
        this.senha = senha;
        this.nome_servico = nome_servico;
        this.tipo_servico = tipo_servico;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.previsao_inicio = previsao_inicio;
        this.previsao_termino = previsao_termino;
    }

    public Cartorio(){}

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_termino() {
        return data_termino;
    }

    public void setData_termino(Date data_termino) {
        this.data_termino = data_termino;
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public Date getPrevisao_inicio() {
        return previsao_inicio;
    }

    public void setPrevisao_inicio(Date prevIA) {
        this.previsao_inicio = previsao_inicio;
    }

    public Date getPrevisao_termino() {
        return previsao_termino;
    }

    public void setPrevisao_termino(Date prevFA) {
        this.previsao_termino = previsao_termino;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getTipo_servico() {
        return tipo_servico;
    }

    public void setTipo_servico(String tipo_servico) {
        this.tipo_servico = tipo_servico;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cartorio{" +
                "data_inicio=" + data_inicio +
                ", data_fim=" + data_termino +
                ", previsao_inicio=" + previsao_inicio +
                ", previsao_termino=" + previsao_termino +
                ", nome_servico='" + nome_servico + '\'' +
                ", tipo_servico='" + tipo_servico + '\'' +
                ", senha='" + senha + '\'' +
                ", fila=" + fila +
                '}';
    }


}
