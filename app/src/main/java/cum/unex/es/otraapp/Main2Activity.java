package cum.unex.es.otraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView texto = (TextView) findViewById(R.id.textView3);
        Bundle bu = this.getIntent().getExtras();
        texto.setText(bu.getString("movimiento"));
    }
}
