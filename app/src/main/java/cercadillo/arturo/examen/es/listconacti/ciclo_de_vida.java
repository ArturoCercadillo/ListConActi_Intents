package cercadillo.arturo.examen.es.listconacti;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class ciclo_de_vida extends Activity {

    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);
        Log.i(TAG, "onCreate");
    }

    @Override
    public void onRestart()
    {
        Log.i(TAG,"onRestart");
        super.onRestart();
    }

    @Override
    public void onResume()
    {
        Log.i(TAG,"onResume");
        super.onResume();
    }

    @Override
    public void onPause()
    {
        Log.i(TAG,"onPause");
        super.onPause();
    }

    @Override
    public void onStop()
    {
        Log.i(TAG,"onStop");
        super.onStop();
    }

    @Override
    public void onDestroy()
    {
        Log.i(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.ciclo_de_vida, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}