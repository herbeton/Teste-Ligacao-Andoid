package herbeton.br.testecasaaula3_celular;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.content.Intent.*;


public class LigarActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligar);

        TextView textView = (TextView) findViewById(R.id.numero);

        Intent intent = getIntent();
        String numeroPassadoString = intent.getStringExtra("numero");

        textView.setText(numeroPassadoString);
        textView.setTextSize(30);


    }
    public void ligar(View view){
        TextView editText = (TextView) findViewById(R.id.numero);
        Intent intent2 = getIntent();
        String numeroString = "tel:" + intent2.getStringExtra("numero");


        Uri uri = Uri.parse(numeroString);
        Intent intentLigar = new Intent(ACTION_CALL, uri);
        startActivity(intentLigar);

        /*Intent intentLigar = new Intent(Intent.ACTION_CALL);
        intentLigar.setData(Uri.parse("tel:" + intent2.getStringExtra("numero")));
        startActivity(intentLigar);*/
    }
}
