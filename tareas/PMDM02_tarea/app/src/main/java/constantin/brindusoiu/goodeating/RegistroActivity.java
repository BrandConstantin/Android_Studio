package constantin.brindusoiu.goodeating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class RegistroActivity extends AppCompatActivity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button boton1=(Button)findViewById(R.id.boton1);
        boton1.setOnClickListener(this);

    }

    public void onClick(View view){

        Intent data = new Intent();
        data.putExtra("retorno", "Venimos al Inicio");
        setResult(RESULT_OK, data);
        finish();

    }

}
