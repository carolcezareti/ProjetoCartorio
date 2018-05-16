package cartorio.devmob.ftce.usjt.br.cartorio.controller;

import java.time.format.DateTimeFormatter;

import cartorio.devmob.ftce.usjt.br.cartorio.model.Fila;

/**
 * Created by carol on 06/05/2018.
 */

public class Senha {
    private int id;
    private int numero;
    private String codigo;
    private DateTimeFormatter data_abertura;
    private DateTimeFormatter data_fechamento;
    private Fila fila;

    public Senha(int id, int numero, String codigo, DateTimeFormatter data_abertura, DateTimeFormatter data_fechamento, Fila fila) {
        this.id = id;
        this.numero = numero;
        this.codigo = codigo;
        this.data_abertura = data_abertura;
        this.data_fechamento = data_fechamento;
        this.fila = fila;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public DateTimeFormatter getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(DateTimeFormatter data_abertura) {
        this.data_abertura = data_abertura;
    }

    public DateTimeFormatter getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(DateTimeFormatter data_fechamento) {
        this.data_fechamento = data_fechamento;
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "id=" + id +
                ", numero=" + numero +
                ", codigo='" + codigo + '\'' +
                ", data_abertura=" + data_abertura +
                ", data_fechamento=" + data_fechamento +
                ", fila=" + fila +
                '}';
    }
}
