package com.furkan.stroringdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText; //yazi yazma yeri
    TextView textView; //yazi gosterge yeri
    SharedPreferences sp; //kaydetme icin degisken
    int age = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         sp = this.getPreferences(Context.MODE_PRIVATE);  //kaydetme turu zorunlu
        age = sp.getInt("age",0);   //cagirma keyi age yoksa 0
        editText = findViewById(R.id.editTextNumber);  //bulma yazialani id = editTextNumber
        textView = findViewById(R.id.textView);         //aynisi
        if(age==0){
            // bos cunku default value 0 oldugu icin bos gozukmesi icin ve 0 yas olamaz
            textView.setText("Your age : ");
        }
        else{
            textView.setText("Your age :"+age);
        }

    }
    public void save(View view){            //button onclick methodu
    if(editText.length()!=0){           //eger yaziyeri bosdegilse
     age =Integer.parseInt(editText.getText().toString());  //age e deger atamasi yazialanindaki yazisi yaziya cevirip sonra sayiya cevirme
    textView.setText("Your age :"+age);    //yaziyi degistirme
    sp.edit().putInt("age",age).apply();   //apply onemli :)  *(Uygulama Demek)
    editText.setText("");
    }
    else{
        textView.setText("Empty !!!");
    }

    }
}