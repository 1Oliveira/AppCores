package com.pjct.checkboxes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ConstraintLayout papai;
    Button btnSorteio;
    View viewCores;
    int verde;
    int azul;
    int vermelho;
    int alpha;
    TextView tvAlpha, tvRed, tvGreen, tvBlue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();

        btnSorteio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                criarCor();
                preencherTexto();
            }
        });


    }
    public void inicializarComponentes(){
        btnSorteio = findViewById(R.id.btnSorteio);
        viewCores = findViewById(R.id.viewCores);
        papai = findViewById(R.id.papai);
        tvAlpha = findViewById(R.id.tvAlpha);
        tvRed = findViewById(R.id.tvRed);
        tvGreen = findViewById(R.id.tvGreen);
        tvBlue = findViewById(R.id.tvBlue);

    }
    public void sorteiaCores(){
        Random random = new Random();
        verde = random.nextInt(255);
        vermelho = random.nextInt(255);
        azul = random.nextInt(255);
        alpha = random.nextInt(100);

    }
    public void criarCor(){
        sorteiaCores();
        int color = Color.rgb(vermelho, verde, azul);
        viewCores.setBackgroundColor(color);
        int colorPai = Color.rgb(verde, vermelho, azul);
        papai.setBackgroundColor(colorPai);
    }
    public void preencherTexto(){
    tvAlpha.setText("Valor do Alpha = " + alpha);
    tvRed.setText("Valor do Vermelho = " + vermelho);
    tvGreen.setText("Valor do Verde = " + verde);
    tvBlue.setText("Valor do Azul = " + azul );
    }
}
