package android.example.com.miniproyecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    

    TextView tvDatos;
    TextView tvDatos1;
    TextView tvDatos2;
    TextView tvDatos3;
    TextView tvDatos4;
    TextView tvDatos5;
  


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String d1 = null;
        String d2 = null;
        String d3 = null;
        String d4 = null;
        String d5 = null;
        String d6 = null;
        String d7 = null;
        String d8 = null;
        String d9 = null;
        Bundle extras = getIntent().getExtras();
        assert extras != null;

        if (extras != null) {

            d1 = extras.getString("dato01");
            d2 = extras.getString("dato02");
            d3 = extras.getString("dato03");
            d4 = extras.getString("dato04");
            d5 = extras.getString("dato05");
            d6 = extras.getString("dato06");
            d7 = extras.getString("dato07");
            d8 = extras.getString("dato08");
            d9 = extras.getString("dato09");
            if (d1 != null) {
                tvDatos = (TextView) findViewById(R.id.tvDatos1);
                tvDatos1 = (TextView) findViewById(R.id.tvDatos2);
                tvDatos3 = (TextView) findViewById(R.id.tvDatos3);
                tvDatos4 = (TextView) findViewById(R.id.tvDatos4);
                tvDatos5 = (TextView) findViewById(R.id.tvDatos5);


                if (tvDatos != null) {
                    tvDatos.setText(d1);
                }



            }
            if (d2 != null) {
                tvDatos1 = (TextView) findViewById(R.id.tvDatos2);
                tvDatos1.setText(d2);
            }
            if (d3 != null) {
                tvDatos2 = (TextView) findViewById(R.id.tvDatos3);
                tvDatos2.setText(d3);
            }
            if (d4 != null) {
                tvDatos3 = (TextView) findViewById(R.id.tvDatos4);
                tvDatos3.setText(d4);
            }
            if (d5 != null) {
                tvDatos4 = (TextView) findViewById(R.id.tvDatos5);
                tvDatos4.setText(d5);
            }
            if (d6 != null) {
                tvDatos1 = (TextView) findViewById(R.id.tvDatos1);
                tvDatos1.setText(d6);
            }
            if (d7 != null) {
                tvDatos2 = (TextView) findViewById(R.id.tvDatos2);
                tvDatos2.setText(d7);
            }
            if (d8 != null) {
                tvDatos3 = (TextView) findViewById(R.id.tvDatos3);
                tvDatos3.setText(d8);
            }
            if (d9 != null) {
                tvDatos4 = (TextView) findViewById(R.id.tvDatos4);
                tvDatos4.setText(d9);
            }


        }


    }

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);

    }


}
