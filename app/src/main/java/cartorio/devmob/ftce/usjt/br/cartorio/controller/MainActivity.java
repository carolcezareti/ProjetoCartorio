package cartorio.devmob.ftce.usjt.br.cartorio.controller;

import android.app.Activity;
import android.content.Context;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

import cartorio.devmob.ftce.usjt.br.cartorio.R;


public class MainActivity extends Activity {
    public static final String CARTORIO = "br.usjt.deswebmob.cartorio.cartorio";
    private EditText txtSenha;
    Context contexto;
    Spinner servicos;
    Spinner tipoatendimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSenha = (EditText) findViewById(R.id.gerar_senha);
        contexto = this;
        new DownloadJsonGerarSenha().execute("http://10.71.254.246:8080/projeto_cartorio");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contexto = this;
        servicos = (Spinner) findViewById(R.id.spinServicos);
        tipoatendimento = (Spinner) findViewById(R.id.spinTipoAtendimento);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.tipo_servicos, android.R.layout.simple_spinner_item);
        servicos.setAdapter(adapter);

        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.tipo_atendimento, android.R.layout.simple_spinner_item);
        tipoatendimento.setAdapter(adapter1);

        Button gerar_Senha = (Button) findViewById(R.id.gerar_senha);
        gerar_Senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String itemS = servicos.getSelectedItem().toString();
                Intent intent = new Intent(MainActivity.this, DetalheSenhaActivity.class);

            }
        });
    }

    public void DetalheSenhaActivity(View view) {
        String tipoAtendimento = tipoatendimento.toString();
        String txtServico = servicos.toString();

    }

    public void gerarSenha(String fila, String servico) {

}

    private class DownloadJsonGerarSenha extends AsyncTask<String, Void, ArrayList<Senha>> {
        public void execute(String s, String s1) {
        }

        @Override
        protected ArrayList<Senha> doInBackground(String... strings) {
            return null;
        }
    }
}






