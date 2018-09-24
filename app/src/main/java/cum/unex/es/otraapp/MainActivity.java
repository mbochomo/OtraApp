package cum.unex.es.otraapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnBotonSimple = (Button)findViewById(R.id.btnaceptar);
        btnBotonSimple.setOnClickListener(
                new View.OnClickListener() {
            public void onClick(View arg0) {
                EditText tx = (EditText) findViewById(R.id.cuadro);
                Intent intent = new Intent(MainActivity.this, ActividadSegunda.class);
                //Crear información a pasar
                Bundle b = new Bundle();
                b.putString("NOMBRE", tx.getText().toString());
                //Información del intent
                intent.putExtras(b);
                //Iniciar nueva actividad
                String a = "a";
                startActivity(intent);
            }
        });
    }
}
