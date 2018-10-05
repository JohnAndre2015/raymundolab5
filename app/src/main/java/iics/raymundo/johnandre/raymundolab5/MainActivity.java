package iics.raymundo.johnandre.raymundolab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity 1");
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.button2) {
            i = new Intent(this, Main2Activity.class);
            startActivity(i);
        } else {
            i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo: 14.633625, 121.019377"));
            chooser = Intent.createChooser(i, "Choose Map Application");
            startActivity(chooser);
        }
    }


}
