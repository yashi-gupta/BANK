package kiitapp.com.investmentintender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EMI extends AppCompatActivity
{
    EditText et1, et2, et3;
Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);

        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent box = new Intent(EMI.this,EmiResult.class);
                box.putExtra("U", et1.getText().toString());
                box.putExtra("V", et2.getText().toString());
                box.putExtra("W", et3.getText().toString());
                startActivity(box);



            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(null);
                et2.setText(null);
                et3.setText(null);

            }
        });
    }
}
