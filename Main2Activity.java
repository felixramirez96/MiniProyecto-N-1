package android.example.com.miniproyecto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {




    String condon = "Condon Durex";
    String lubrix = "Lubricante Durex";
    String lovecuff = "Esposas de Juguete";
    String lovepaddle = "Paleta de Cuero";
    String  pelota = "Pelota Tapa Bocas";
    String candle = "Vela Aromatica";
    String kamma1 = "Libro de Kamma Sutra 1";
    String kamma2 = "Libro de Kamma Sutra 2";
    String kamma3 = "Libro de Kamma Sutra 3";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    /**
     * Displays a toast message for the food order
     * and starts the OrderActivity activity.
     * @param message Message to display.
     */
    public void showFoodOrder(String message) {
        displayToast(message);
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
    /**
     * Shows a message that the comdom image was clicked.
     */

    public void showlubrixOrder(View view) {
        showFoodOrder(getString(R.string.lubrix_order_message));
    }
    public void showlovecuffOrder(View view) {
        showFoodOrder(getString(R.string.lovecuff_order_message));
    }
    public void showlovepaddleOrder(View view) {
        showFoodOrder(getString(R.string.lovepaddle_order_message));
    }
    public void showpelotaOrder(View view) {
        showFoodOrder(getString(R.string.pelota_order_message));
    }
    public void showcandleOrder(View view) {
        showFoodOrder(getString(R.string.candle_order_message));
    }
    public void showkamma1Order(View view) {
        showFoodOrder(getString(R.string.kamma1_order_message));
    }
    public void showkamma2Order(View view) {
        showFoodOrder(getString(R.string.kamma2_order_message));
    }
    public void showkamma3Order(View view) {
        showFoodOrder(getString(R.string.kamma3_order_message));
    }

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public void launchFirstActivity(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato01",condon);
        startActivity (i);

    }

    public void launchFirstActivity1(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato02",lubrix);
        startActivity (i);
    }

    public void launchFirstActivity2(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato03",lovecuff);
        startActivity (i);
    }

    public void launchFirstActivity3(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato04",lovepaddle);
        startActivity (i);
    }

    public void launchFirstActivity4(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato05",pelota);
        startActivity (i);
    }

    public void launchFirstActivity5(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato06",candle);
        startActivity (i);
    }

    public void launchFirstActivity6(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato07",kamma1);
        startActivity (i);
    }

    public void launchFirstActivity7(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato08",kamma2);
        startActivity (i);
    }

    public void launchFirstActivity8(View view) {
        Log.d (LOG_TAG, "Button clicked!");
        showFoodOrder(getString(R.string.condom_order_message));

        Intent i = new Intent(Main2Activity.this, MainActivity.class);
        i.putExtra("dato09",kamma3);
        startActivity (i);
    }
}
