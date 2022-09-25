package com.farina.testebotao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewTreeViewModelKt;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        TextView texto = findViewById(R.id.acTextView);
        texto.setText("https://www.youtube.com/c/AlexandreCabo");
        //texto.setOnClickListener();
    }

    public void linkCode(View view){
        TextView codeLink = findViewById(R.id.textCode);
        codeLink.setText("https://github.com/sfarinas/testebotao/tree/master");
    }

    public void alterarTexto2(View view){
        TextView texto2 = findViewById(R.id.afcTextView2);
        texto2.setText("http://autofacilconsultoria.com");
    }

    public void jogar(View view){
        TextView jogoTexto = findViewById(R.id.numeroSorteText);
        int numero = new Random().nextInt(11);
        jogoTexto.setText("Numero selecionado é : " + numero);
    }



}