package fisei.uta.ec.apppractica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   // private editTextValor valor1;
    private EditText editTextValor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextValor = findViewById(R.id.editTextValor);


    }

    public void enviarDatos(View view){
        Bundle bundle = new Bundle();
        bundle.putString("datos",editTextValor.getText().toString());
        Intent intent = new Intent(this, Segunda.class);
        intent.putExtras(bundle);
      //
       // String valor1 = bundle.getString("valor1");

        startActivity(intent);

    }

}