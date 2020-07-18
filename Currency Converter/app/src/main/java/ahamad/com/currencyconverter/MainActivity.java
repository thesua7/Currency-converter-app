package ahamad.com.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText T;
    private Button C;
    private TextView S;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T = (EditText) findViewById(R.id.taka);
        C =  (Button) findViewById(R.id.Convert);
        S = (TextView) findViewById(R.id.toShow);


        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double tempTaka = Double.parseDouble(T.getText().toString());

                double Result = tempTaka*0.012;

                S.setText(String.valueOf(Result)+"$");




            }
        });





    }
}