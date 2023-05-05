package sg.edu.np.mad.week2T01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create!");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG, "On Start!!");

        Button buttonA = findViewById(R.id.button1);
        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Button A Clicked");
                User user = new User(1, 2);
            }
        });
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v(TAG, "On Pause!!");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v(TAG, "Destroy!!");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v(TAG, "On Stop!!");
    }
}