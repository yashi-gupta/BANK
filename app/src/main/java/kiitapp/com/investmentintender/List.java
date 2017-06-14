package kiitapp.com.investmentintender;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class List extends ListActivity {
    String name[] = {"EMI Calculator", "Compare Loan", "PPF Calculator", "Income Tax Calculator", "Income Tax Scheme", "About Us", "Share this App", "Rate this App"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayAdapter adpt = null;

    }

}
