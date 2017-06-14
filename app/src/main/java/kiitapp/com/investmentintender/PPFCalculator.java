package kiitapp.com.investmentintender;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PPFCalculator extends AppCompatActivity
{
    Button b1, b2 , b3;
    EditText et1, et2, et3;
    double si;
    double p, r ,t;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppfcalculator);
        b1 =(Button)findViewById(R.id.button1);
        b2 =(Button)findViewById(R.id.button2);
        b3 =(Button)findViewById(R.id.button3);

        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p = Double.parseDouble(et1.getText().toString());
                r = Double.parseDouble(et2.getText().toString());
                t = Double.parseDouble(et3.getText().toString());

                si = (p*r*t*12)/100;

            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                et1.setText("");
                et2.setText("");
                et3.setText("");

            }
        });


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PPFCalculator.this,PpfInfo.class);
                startActivity(i);
            }
        });

    }
}
