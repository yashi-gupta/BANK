package kiitapp.com.investmentintender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CompareLoan extends AppCompatActivity
{
     EditText et1, et2, et3, et4, et5, et6;
    Button b1;
    TextView tv12, tv13, tv14,tv15, tv16, tv17, tv18,tv19,tv20,tv21;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_loan);
        et1 = (EditText)findViewById(R.id.editText1);
        et2 = (EditText)findViewById(R.id.editText2);
        et3 = (EditText)findViewById(R.id.editText3);
        et4 = (EditText)findViewById(R.id.editText4);
        et5 = (EditText)findViewById(R.id.editText5);
        et6 = (EditText)findViewById(R.id.editText6);
        b1 =(Button)findViewById(R.id.button1);
        tv12 = (TextView)findViewById(R.id.textView12);
        tv13 = (TextView)findViewById(R.id.textView13);
        tv14 = (TextView)findViewById(R.id.textView14);
        tv15 = (TextView)findViewById(R.id.textView15);
        tv16 = (TextView)findViewById(R.id.textView16);
        tv17 = (TextView)findViewById(R.id.textView17);
        tv18 = (TextView)findViewById(R.id.textView18);
        tv19 = (TextView)findViewById(R.id.textView19);
        tv20 = (TextView)findViewById(R.id.textView20);
        tv21 = (TextView)findViewById(R.id.textView21);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tv12.setText("EMI (Monthly Payment)");



                double t1,t2, i2, i1, R2 , R1,P2, P1,emi2,  emi1;
                int N1, N2;
                int ar1, ar2;

                P1 = Double.parseDouble(et1.getText().toString());
                P2 = Double.parseDouble(et2.getText().toString());
                R1 = Double.parseDouble(et3.getText().toString());
                R2 = Double.parseDouble(et4.getText().toString());
                N1 = Integer.parseInt(et5.getText().toString());
                N2 = Integer.parseInt(et6.getText().toString());




                emi1 =  (P1 * R1/12) * ( Math.pow((1+R1/12),N1)) / Math.pow((1+R1/12),N1);
                i1 = (emi1 *N1)- P1;
                t1 = P1 +i1;
                ar1 = (int)P1/(int)t1;

                emi2 =  (P2 * R2/12) * ( Math.pow((1+R2/12),N2)) / Math.pow((1+R2/12),N2);
                i2 = (emi2 *N2)- P2;
                t2 = P2 +i2;
                ar2 = (int)P2/(int)t2;

                tv13.setText(""+emi1);
                tv14.setText(""+emi2);
                tv15.setText("Total Interest Payable");
                tv16.setText(""+i1);
                tv17.setText(""+i2);
                tv18.setText("Total Payment");
                tv19.setText(""+t1);
                tv20.setText(""+t2);


                if(i1<i2) {
                    tv21.setText("Loan 1 is more Economical.");

                }
                else
                    tv21.setText("Loan 2 is more Economical.");






            }
        });





    }



}
