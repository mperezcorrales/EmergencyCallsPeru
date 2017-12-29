package pe.quickapps.emergencycallsperu.MainModule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import pe.quickapps.emergencycallsperu.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAIN ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Primer Log");
    }
}
