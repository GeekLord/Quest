package fravier.com.quest;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import fravier.com.quest.R;

public class Dashboard extends ActionBarActivity {
    public ImageButton dash1,dash2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#012345")));
        dash1=(ImageButton)findViewById(R.id.btnModuleOne);
        dash2=(ImageButton)findViewById(R.id.btnModuleTwo);

        dash1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Intent m1=new Intent(Dashboard.this,ParentOne.class);
//                startActivity(m1);

            }
        });
        dash2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Intent m1=new Intent(Dashboard.this,ParentTwo.class);
//                startActivity(m1);

            }
        });

//		if (savedInstanceState == null) {
//			getSupportFragmentManager().beginTransaction()
//					.add(R.id.container, new PlaceholderFragment()).commit();
//		}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.dashboard, menu);
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