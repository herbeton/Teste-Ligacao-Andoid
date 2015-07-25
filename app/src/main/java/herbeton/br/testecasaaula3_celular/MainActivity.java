package herbeton.br.testecasaaula3_celular;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import org.xml.sax.Parser;

import java.net.URI;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void enviarNUmero(View view){
        EditText editText = (EditText) findViewById(R.id.numero);
        String numeroString = editText.getText().toString();

        Intent intent = new Intent(this, LigarActivity.class);
        intent.putExtra("numero",numeroString);
        startActivity(intent);
    }
}
