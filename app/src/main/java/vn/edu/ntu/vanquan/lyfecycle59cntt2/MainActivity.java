package vn.edu.ntu.vanquan.lyfecycle59cntt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","on create");
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf = new SimpleDateFormat("hh:mm:ss");
        String strDate = spf.format(new Date());
        txtTG.setText(strDate);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","on strar");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","on resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","on stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","on resstar");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","on pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","on destroy");
    }
}
