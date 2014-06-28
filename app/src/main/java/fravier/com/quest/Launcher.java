package fravier.com.quest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;


public class Launcher extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_launcher);

        Thread splashscreen = new Thread() {// the thread to run the halal
            // splash screen
            @Override
            public void run() {
                try {
                    sleep(2000); // the splash screen should run for 2 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intentDashboard = new Intent(Launcher.this,
                            Dashboard.class);

                    startActivity(intentDashboard);
                    finish();
                }

            }
        };
        splashscreen.start();

        // if (savedInstanceState == null) {
        // getSupportFragmentManager().beginTransaction()
        // .add(R.id.container, new PlaceholderFragment()).commit();
        // }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.launcher, menu);
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

