package constantin.brindusoiu.goodeating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class AyudaActivity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        Button boton2=(Button)findViewById(R.id.boton5);
        boton2.setOnClickListener(this);

    }

    public void onClick(View view){

        Intent data = new Intent();
        data.putExtra("retorno", "Venimos al Inicio");
        setResult(RESULT_OK, data);
        finish();

    }

}
