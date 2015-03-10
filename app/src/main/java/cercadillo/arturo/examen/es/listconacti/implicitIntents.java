package cercadillo.arturo.examen.es.listconacti;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class implicitIntents extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
    }
    public void onClickWebBrowser(View v)
    {
        startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.centroafuera.es/")));
    }

    public void onClickShowDial(View v)
    {
        startActivity(new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+914295151")));
    }

    public void onClickShowMap(View v)
    {
        startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q=40.414422,-3.700933")));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.implicit_intents, menu);
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
