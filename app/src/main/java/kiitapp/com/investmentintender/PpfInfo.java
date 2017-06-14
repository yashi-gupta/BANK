package kiitapp.com.investmentintender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PpfInfo extends AppCompatActivity {
TextView tv1, tv2, tv3, tv4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppf_info);
        tv4 =(TextView)findViewById(R.id.textView4);
        tv4.setText("PPF (Public Provident Fund) is a saving-cum-tax saving scheme in India (started in 1968 by National Saving Institute of the Ministry of Finance) by Central Government. The goal is to mobilize small savings by offering an investment with reasonable returns combined with income tax benefits." +
                "Some Facts about PPF - "+
                "Interest rate : 8.1%\n" +
                "Duration of scheme : 15 years\n" +
                "Minimum deposit amount (per year) :  500\n" +
                "Maximum deposit amount (per year) :  1,50,000\n" +
                "Number of installments every year : 1 (Min) to 12 (Max)\n" +
                "Number of accounts one can open : Only One\n" +
                "Lock-in period : 15 years (partial withdrawals can be made from the sixth year)\n" +
                "Extension of PPF Account : After the maturity period (15 years), it can be extended for a period of 5 years\n" +
                "Tax savings (contribution) : under section 80C (upto 1.5 L)\n" +
                "Tax savings (interest earned and final amount) : fully exempted from wealth tax");

    }
}
