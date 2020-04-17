package com.example.proyecto001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText campo1, campo2;
    TextView etiResultado;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.et1);
        campo2 = findViewById(R.id.et2);
        etiResultado = findViewById(R.id.etiResul);
    }

    public void onClick(View view) {

        num1 = Integer.parseInt(campo1.getText().toString());
        num2 = Integer.parseInt(campo2.getText().toString());

        switch (view.getId()) {

            case R.id.btnS:
                sumar();
                break;
            case R.id.btnR:
                restar();
                break;
            case R.id.btnM:
                multiplicar();
                break;
            case R.id.btnD:
                dividir();
                break;
        }

    }

    private void sumar() {
        int suma = num1 + num2;
        etiResultado.setText("El resulado de la suma es : " + suma);
        Toast.makeText(this,"El valor de la operacion es  = " + suma ,Toast.LENGTH_LONG).show();
       
    }

    private void restar() {
        int resta = num1 - num2;
        etiResultado.setText("El resultado de la resta es : " + resta);
        Toast.makeText(this,"El valor de la operacion es = " + resta ,Toast.LENGTH_LONG).show();
    }

    private void multiplicar() {
        int multiplicacion = num1 * num2;
        etiResultado.setText("El resultado de la multiplicacion es : " + multiplicacion);
        Toast.makeText(this,"El valor de la operacion es = " + multiplicacion,Toast.LENGTH_LONG).show();
    }

    private void dividir() {
        if (num2 > 0) {

            int dividir = num1 / num2;
            etiResultado.setText("El resultado de la division es : " + dividir);
        } else {
            etiResultado.setText("El valor 2 debe ser mayor a cero para efectuar la division");
            Toast.makeText(this,"El valor 2 debe ser mayor a cero",Toast.LENGTH_LONG).show();
        }

    }


}
