//package name requied!!

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;  
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.gosterge);

        new CountDownTimer(10*1000, 1000) {   //suresi ve gerisayim araligi milisaniye  
            @Override
            public void onTick(long millisUntilFinished) {   //milisaniyelik gosterge
                textView.setText("Kalan: "+millisUntilFinished/1000);
            }

            @Override
            public void onFinish() {
                            textView.setText("Bitti");
            }
        }.start();
    }
}