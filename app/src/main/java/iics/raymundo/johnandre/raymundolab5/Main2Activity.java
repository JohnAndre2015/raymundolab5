package iics.raymundo.johnandre.raymundolab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity 2");
        setContentView(R.layout.activity_main2);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button3) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else {
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 14.622560, 121.000457"));
            chooser = Intent.createChooser(i, "Choose Map Application");
            startActivity(chooser);
        }
    }
}
