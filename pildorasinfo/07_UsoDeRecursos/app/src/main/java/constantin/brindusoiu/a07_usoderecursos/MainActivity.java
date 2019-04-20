package constantin.brindusoiu.a07_usoderecursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* insertar imágen a través de java, se necesita ejecutar el emulador para verse la imágen

    ImageView img = (ImageView) findViewById(R.id.imagenX);
    img.setImaageResource(R.drawable.icono_rocas);
    */
}
