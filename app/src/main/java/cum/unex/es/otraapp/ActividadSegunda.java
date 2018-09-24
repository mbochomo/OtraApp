package cum.unex.es.otraapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
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
        final Button btnBotonSimple = (Button)findViewById(R.id.boton);
        btnBotonSimple.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View arg0) {
                        Intent intent = new Intent(ActividadSegunda.this, Main2Activity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}
