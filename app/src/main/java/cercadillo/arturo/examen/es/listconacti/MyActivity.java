package cercadillo.arturo.examen.es.listconacti;


import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MyActivity extends ListActivity {
    String practicas[] = {"actividad1","actividad2", "actividad3", "ciclo_de_vida","Pulsame","implicitIntents"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,practicas);
        setListAdapter(adaptador);
    }
    protected void onListItemClick(ListView lista, View vista, int posicion, long id){
        super.onListItemClick(lista,vista,posicion, id);
            String nombrePractica=practicas[posicion];
            try{
                Class<?> clase = Class.forName("cercadillo.arturo.examen.es.listconacti."+nombrePractica);
                Intent intent = new Intent(this,clase);
                startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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
