package sg.edu.np.mad.practical3;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    final String TAG = "List Activity";

    TextView Username;
    ImageView alert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        alert = findViewById(R.id.alertMsg);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Profile")
                        .setMessage("MADness")
                        .setPositiveButton("View", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(ListActivity.this, MainActivity.class));
                                Random random = new Random();
                                int ranNum = random.nextInt(100000);
                                Intent i = new Intent(ListActivity.this, MainActivity.class);
                                i.putExtra("number", String.valueOf(ranNum));
                                startActivity(i);

                            }
                        })
                        .setNegativeButton("Close", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(ListActivity.this, MainActivity.class);
                                startActivity(i);
                            }
                        })
                        .show();
            }
        });



    }
}
