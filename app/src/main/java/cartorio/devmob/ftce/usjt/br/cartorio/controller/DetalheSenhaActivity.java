package cartorio.devmob.ftce.usjt.br.cartorio.controller;

import android.app.Activity;
import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import cartorio.devmob.ftce.usjt.br.cartorio.R;


public class DetalheSenhaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_senha);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.CARTORIO);

        TextView textView = findViewById(R.id.detalhe_senha);
        textView.setText(message);
    }


    public void MostrarPainelActivity(View view) {
    }
}
