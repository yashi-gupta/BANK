package kiitapp.com.investmentintender;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class EmiResult extends AppCompatActivity
{
    TextView tv1, tv2 , tv3, tv4, tv5, tv6, tv9;
    ProgressBar pb1, pb2;
    ProgressDialog pd1, pd2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi_result);

        tv3 = (TextView)findViewById(R.id.textView3);
        tv2 = (TextView)findViewById(R.id.textView2);
        tv9 = (TextView)findViewById(R.id.textView9);
        tv6 = (TextView)findViewById(R.id.textView6);
        pb1 = (ProgressBar)findViewById(R.id.progressBar);

        pb2 = (ProgressBar)findViewById(R.id.progressBar2);
        pd1 = new ProgressDialog(this);
        pd2 = new ProgressDialog(this);



        Intent box = getIntent();
        Bundle b = box.getExtras();
        String u = b.getString("U");
        String v = b.getString("V");
        String w = b.getString("W");
        tv3.setText(u);

        double t,i, R, P,  emi;
        int N;
        R = (Double.parseDouble(v));
        P = (Double.parseDouble(u));
        N = (Integer.parseInt(w));

        pb1.setProgress((int)R);
        int ar;




        emi =  (P * R/12) * ( Math.pow((1+R/12),N)) / Math.pow((1+R/12),N);
        i = (emi *N)- P;
        t = P +i;
        ar = ((int)P/(int)t)*100;
        pb2.setProgress(ar);

        String r =""+ emi;
        String s = ""+i;
        String y = ""+t;
        tv9.setText(r);
        tv2.setText(s);
        tv6.setText(y);
    }
}
