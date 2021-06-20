// 19 06 2021 first java project basic calculator
package com.furkan.hesapmakinesi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numberInput1;
    EditText numberInput2;
    TextView result;
    int number1 = 0;
    int number2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         numberInput1 = findViewById(R.id.number1);
         numberInput2 = findViewById(R.id.number2);
         result = findViewById(R.id.txt);
         number1 = 0;
         number2 = 0;
    }

    public void Subtraction(View view){
        //i use try because when numberInput empty app closing :)
        try {
            number1 = Integer.parseInt(numberInput1.getText().toString());
            number2 = Integer.parseInt(numberInput2.getText().toString());
            int result = number1-number2;
            this.result.setText("Subtraction\n"+number1+" - "+number2+"\n"+result);
            numberInput1.setText("");
            numberInput2.setText("");
        }
        catch (Throwable x){
            result.setText("please number enter");
        }
    }
    public void collection(View view){

        try {
            number1 = Integer.parseInt(numberInput1.getText().toString());
            number2 = Integer.parseInt(numberInput2.getText().toString());
            int result = number1+number2;
            this.result.setText("collection\n"+number1+" + "+number2+"\n"+result);
            numberInput1.setText("");
            numberInput2.setText("");
        }
        catch (Throwable x){
            result.setText("please number enter");
        }
    }
    public void Multiplication(View view){
        try {
            number1 = Integer.parseInt(numberInput1.getText().toString());
            number2 = Integer.parseInt(numberInput2.getText().toString());
            int result = number1*number2;
            this.result.setText("Multiplication\n"+number1+" x "+number2+"\n"+result);
            numberInput1.setText("");
            numberInput2.setText("");
        }catch (Throwable x){
            result.setText("please number enter");
        }
    }
    public void division(View view){
       try {
           number1 = Integer.parseInt(numberInput1.getText().toString());
           number2 = Integer.parseInt(numberInput2.getText().toString());
           int result = number1/number2;
           this.result.setText("bolme\n"+number1+" / "+number2+"\n"+result);
           numberInput1.setText("");
           numberInput2.setText("");
       }
       catch (Throwable x){
           result.setText("please number enter");
       }
    }

}
