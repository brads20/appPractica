package fisei.uta.ec.apppractica;

import androidx.appcompat.app.AppCompatActivity;

//import android.content.Intent;
import android.os.Bundle;
//import android.text.Editable;
import android.widget.EditText;

public class Segunda extends AppCompatActivity {
     EditText editTextValor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        Bundle bundle =  getIntent().getExtras();
        String valorPrimero = bundle.getString("datos");
        editTextValor2.setText(valorPrimero);

    }
}