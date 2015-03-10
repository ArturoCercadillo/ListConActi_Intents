package cercadillo.arturo.examen.es.listconacti;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class actividad3_b extends Activity {
    Button boton;
    Intent i;
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad3_b);

        i=getIntent();
        String nombre = i.getStringExtra("nombre");
        int num1 = i.getIntExtra("num1",0);
        Bundle b = i.getExtras();
        String nombre2 = b.getString("nombre2");
        int num2 = b.getInt("num2");
        texto=(TextView) findViewById(R.id.textViewAct3_b);
        texto.setText(nombre+"  "+num1+"  "+nombre2+"  "+num2);

        boton=(Button)findViewById(R.id.button3);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("num3",45);
                intent.setData(Uri.parse("45"));
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.actividad6, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
