package com.arias.calculadora_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Añadimos los atributos de los tipos de controles introducidos
    public ImageView btnSumar;
    public ImageView btnRestar;
    public ImageView btnMultiplicar;
    public ImageView btnDividir;
    public ImageView btnC;
    public ImageView btnDel;
    public ImageView btnIgual;
    public ImageView btnPunto;

    public ImageView btn0;
    public ImageView btn1;
    public ImageView btn2;
    public ImageView btn3;
    public ImageView btn4;
    public ImageView btn5;
    public ImageView btn6;
    public ImageView btn7;
    public ImageView btn8;
    public ImageView btn9;

    public TextView tvResultado;

    //explicacion de porque se declaran asi los float: https://imgur.com/a/Mvm8rs7
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operacion = "";
    float dato = 0.0f;
    float resultado=0.0f;
    int contadorOperadores=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asignar a cada variable definida el control que se ha diseñado anteriormente:
        btnSumar = (ImageView) findViewById(R.id.ivMas);
        btnRestar = (ImageView) findViewById(R.id.ivMenos);
        btnMultiplicar = (ImageView) findViewById(R.id.ivPor);
        btnDividir = (ImageView) findViewById(R.id.ivDiv);
        btnC = (ImageView) findViewById(R.id.ivC);
        btnDel = (ImageView) findViewById(R.id.ivDel);
        btnIgual = (ImageView) findViewById(R.id.ivIgual);
        btnPunto = (ImageView) findViewById(R.id.ivPunto);
        btn0 = (ImageView) findViewById(R.id.iv0);
        btn7 = (ImageView) findViewById(R.id.iv7);
        btn8 = (ImageView) findViewById(R.id.iv8);
        btn9 = (ImageView) findViewById(R.id.iv9);
        btn4 = (ImageView) findViewById(R.id.iv4);
        btn5 = (ImageView) findViewById(R.id.iv5);
        btn6 = (ImageView) findViewById(R.id.iv6);
        btn1 = (ImageView) findViewById(R.id.iv1);
        btn2 = (ImageView) findViewById(R.id.iv2);
        btn3 = (ImageView) findViewById(R.id.iv3);

        tvResultado=(TextView) findViewById(R.id.tvResultado);

        //metodo que resuelve supuestamente el crasheo de la aplicacion
        tvResultado.setText("0");
        /*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("1");
                }else{
                    tvResultado.setText(tvResultado.getText() + "1");
                }

            }
        });
        */

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //comprobamos lo que hay almacenado en tvResultado
                dato=Float.parseFloat(tvResultado.getText().toString());
                /*Si en el resultado no hay nigun numero o hay un 0 se pone el que se haya clickado. Si ya
                hay un numero, se añade el de la tecla pulsada.
                 */
                if (dato==0.0f){
                    tvResultado.setText("2");
                }else{
                    tvResultado.setText(tvResultado.getText() + "2");
                }


            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("3");
                }else{
                    tvResultado.setText(tvResultado.getText() + "3");
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("4");
                }else{
                    tvResultado.setText(tvResultado.getText() + "4");
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("5");
                }else{
                    tvResultado.setText(tvResultado.getText() + "5");
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("6");
                }else{
                    tvResultado.setText(tvResultado.getText() + "6");
                }

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("7");
                }else{
                    tvResultado.setText(tvResultado.getText() + "7");
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("8");
                }else{
                    tvResultado.setText(tvResultado.getText() + "8");
                }

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("9");
                }else{
                    tvResultado.setText(tvResultado.getText() + "9");
                }

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /* se añade el metodo toString() porque el metodo getText() devuelve un char secuence, no un String
                    (https://imgur.com/a/1bD07lp)  */
                dato=Float.parseFloat(tvResultado.getText().toString());
                if (dato==0.0f){
                    tvResultado.setText("0");
                }else{
                    tvResultado.setText(tvResultado.getText() + "0");
                }

            }
        });
    }

    public void limpiarResultado(View view) {
        tvResultado.setText("0");
        dato=0.0f;
        operacion="";
    }

    public void borrarNumero(View view) {
        //se declara una variable String para poder utilizar despues el metodo substring(). API rb.gy/xwtaue
        String cadena=(tvResultado.getText().toString());
        if (cadena.equals("0")){
            tvResultado.setText("0");
        }else{
            cadena=cadena.substring(0, cadena.length() -1 );
            tvResultado.setText(cadena);
        }
    }

    public void pulsarUno(View view) {

        dato=Float.parseFloat(tvResultado.getText().toString());
        if (dato==0.0f){
            tvResultado.setText("1");
        }else{
            tvResultado.setText(tvResultado.getText() + "1");
        }

    }
    public void operacionDividir(View view){
        if(contadorOperadores==0){
            numero1=Float.parseFloat(tvResultado.getText().toString());
            /*se resetea el tvResultado para que se almacene solo a partir de ahora la parte que va
            despues del operando*/
            tvResultado.setText("0");
            operacion="/";
        }else{
            numero1=numero1+Float.parseFloat(tvResultado.getText().toString());
            tvResultado.setText("0");
            /*se almacena de nuevo el operador por si se pulsa uno diferente al primero*/
            operacion="/";
        }
        contadorOperadores++;
    }
    public void operacionSumar(View view){
        if(contadorOperadores==0){
            numero1=Float.parseFloat(tvResultado.getText().toString());
            /*se resetea el tvResultado para que se almacene solo a partir de ahora la parte que va
            despues del operando*/
            tvResultado.setText("0");
            operacion="+";
        }else{
            numero1=numero1+Float.parseFloat(tvResultado.getText().toString());
            tvResultado.setText("0");
            /*se almacena de nuevo el operador por si se pulsa uno diferente al primero*/
            operacion="+";
        }
        contadorOperadores++;

    }
    public void operacionMultiplicar(View view){
        if(contadorOperadores==0){
            numero1=Float.parseFloat(tvResultado.getText().toString());
            /*se resetea el tvResultado para que se almacene solo a partir de ahora la parte que va
            despues del operando*/
            tvResultado.setText("0");
            operacion="*";
        }else{
            numero1=numero1+Float.parseFloat(tvResultado.getText().toString());
            tvResultado.setText("0");
            /*se almacena de nuevo el operador por si se pulsa uno diferente al primero*/
            operacion="*";
        }
        contadorOperadores++;
    }
    public void operacionRestar(View view){
        if(contadorOperadores==0){
            numero1=Float.parseFloat(tvResultado.getText().toString());
            /*se resetea el tvResultado para que se almacene solo a partir de ahora la parte que va
            despues del operando*/
            tvResultado.setText("0");
            operacion="-";
        }else{
            numero1=numero1+Float.parseFloat(tvResultado.getText().toString());
            tvResultado.setText("0");
            /*se almacena de nuevo el operador por si se pulsa uno diferente al primero*/
            operacion="-";
        }
        contadorOperadores++;
    }
    public void operacionIgual(View view){
        contadorOperadores=0;
        numero2=Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
        switch (operacion){
            case "/":
                resultado=numero1/numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
            case "*":
                resultado=numero1*numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
            case "+":
                resultado=numero1+numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
            case "-":
                resultado=numero1-numero2;
                tvResultado.setText(String.valueOf(resultado));
                break;
        }
    }
}