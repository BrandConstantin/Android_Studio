package constantin.brindusoiu.eatinggoodrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcercaDe extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
        Button boton=(Button)findViewById(R.id.botonVolverAcercaDe);
        boton.setOnClickListener(this);
    }
    public void onClick(View v){
        abrirActividadPrincipal();
    }
    public void abrirActividadPrincipal(){
        Intent intentAbrir= new Intent(this, MainActivity.class);
        startActivity(intentAbrir);
    }
}
