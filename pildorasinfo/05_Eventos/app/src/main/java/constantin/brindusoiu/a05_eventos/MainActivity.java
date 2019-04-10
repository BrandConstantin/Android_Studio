package constantin.brindusoiu.a05_eventos;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int contador;

    TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoResultado = (TextView) findViewById(R.id.contadorTexto);

        contador = 0;

        //cuando se pulsa ok se resetea el texto
        EventoTeclado teclado = new EventoTeclado();
        EditText num_resetea = (EditText) findViewById(R.id.editTextNumber);
        num_resetea.setOnEditorActionListener(teclado);
    }

    //cuando se pulsa el ok en teclado para ocultarlo y resetear el contador
    class EventoTeclado implements TextView.OnEditorActionListener{

        @Override
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if(actionId == EditorInfo.IME_ACTION_DONE){
                reseteaContador(null);
            }
            return false;
        }
    }

    public void incrementarContador(View vista){
        contador++;

        textoResultado.setText("" + contador);
    }

    public void decrementarContador(View vista){
        contador--;

        if(contador < 0){
            CheckBox negativo = (CheckBox) findViewById(R.id.negativos);
            if(!negativo.isChecked()){
                contador = 0;
            }
        }
        textoResultado.setText("" + contador);
    }

    public void reseteaContador(View vista){
        EditText numeroReseteado = (EditText) findViewById(R.id.editTextNumber);

        try {
            contador = Integer.parseInt(numeroReseteado.getText().toString());
        }catch (Exception e){
            contador = 0;
        }

        numeroReseteado.setText("");
        textoResultado.setText("" + contador);

        //almacenar el teclado
        InputMethodManager miTeclado = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        //oculatar el teclado cuando utilizamos editText
        miTeclado.hideSoftInputFromWindow(numeroReseteado.getWindowToken(), 0);
    }

    /*public void  mostrarResultado(){
        TextView textoREsultado = (TextView) findViewById(R.id.contadorTexto);
        textoREsultado.setText("" + contador);
    }*/
}
