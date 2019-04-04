package constantin.brindusoiu.a01_interfacez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;

        mostrarResultado();
    }

    public void incrementarContador(View vista){
        contador++;

        mostrarResultado();
    }

    public void decrementarContador(View vista){
        contador--;

        mostrarResultado();
    }

    public void reseteaContador(View vista){
        contador = 0;

        mostrarResultado();
    }

    public void  mostrarResultado(){
        TextView textoREsultado = (TextView) findViewById(R.id.contadorTexto);
        textoREsultado.setText("Contador: " + contador);
    }
}
