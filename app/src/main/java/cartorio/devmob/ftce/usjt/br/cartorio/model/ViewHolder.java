package cartorio.devmob.ftce.usjt.br.cartorio.model;

import android.widget.TextView;

import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by carol on 15/04/2018.
 */

public class ViewHolder {
    private String servico, nome_servico, tipo_servico, senha;
    private DateTimeFormatter cadastro;
    private Date previsao_inicio, previsao_termino;

    public Date getPrevisao_inicio() {
        return previsao_inicio;
    }

    public void setPrevisao_inicio(Date previsao_inicio) {
        this.previsao_inicio = previsao_inicio;
    }

    public Date getPrevisao_termino() {
        return previsao_termino;
    }

    public void setPrevisao_termino(Date previsao_termino) {
        this.previsao_termino = previsao_termino;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
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

    public DateTimeFormatter getCadastro() {
        return cadastro;
    }

    public void setCadastro(DateTimeFormatter cadastro) {
        this.cadastro = cadastro;
    }


}
