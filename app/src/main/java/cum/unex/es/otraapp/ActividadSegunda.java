package cum.unex.es.otraapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ActividadSegunda extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segundapantalla);

        TextView tx = (TextView) findViewById(R.id.textView2);
        //Recuperamos la información pasada en el intent
        Bundle bu = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        tx.setText("Hola, "+bu.getString("NOMBRE"));

    }
}
