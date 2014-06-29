package fravier.com.quest.module1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import fravier.com.global.QuestViewPager;
import fravier.com.quest.Dashboard;
import fravier.com.quest.R;

public class ParentOne extends ActionBarActivity {
    SectionsPageAdapter pageAdapter;
    QuestViewPager viewPager;
    PagerTitleStrip pagerTabStrip;
    Button next;
    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_one);
        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#012345")));

        pageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        viewPager = (QuestViewPager) findViewById(R.id.pager);
        viewPager.setAdapter(pageAdapter);
        viewPager.setPagingEnabled(false);
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

//        pagerTabStrip = (PagerTitleStrip) findViewById(R.id.pager_title_strip);
//        pagerTabStrip.setNonPrimaryAlpha((float) 0.1);
//        pagerTabStrip.setTextSpacing(40);

        next = (Button) findViewById(R.id.cmdNext);
        prev = (Button) findViewById(R.id.cmdPrev);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            }
        });


        viewPager.setOnPageChangeListener(new QuestViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {
                // System.out.println(arg0);
                // if (arg0 == 2) {
                // viewPager.setCurrentItem(10);
                // }

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {


            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.parent_one, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_home) {
            Intent intent = new Intent(getApplication(), Dashboard.class);
            startActivity(intent);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_parent_one,
                    container, false);
            return rootView;
        }
    }

    public class SectionsPageAdapter extends FragmentPagerAdapter {
        public SectionsPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment mFragment;
            switch (position) {
                case 0:
                    mFragment = new O1();
                    mFragment.setArguments(null);
                    return mFragment;
                case 1:

                    mFragment = new O2();
                    mFragment.setArguments(null);
                    return mFragment;
                case 2:

                    mFragment = new O3a();
                    mFragment.setArguments(null);
                    return mFragment;
                case 3:

                    mFragment = new O3();
                    mFragment.setArguments(null);
                    return mFragment;
                case 4:
                    mFragment = new O4();
                    mFragment.setArguments(null);
                    return mFragment;
                case 5:
                    mFragment = new O5();
                    mFragment.setArguments(null);
                    return mFragment;
                case 6:
                    mFragment = new O6();
                    mFragment.setArguments(null);
                    return mFragment;
                case 7:
                    mFragment = new O7();
                    mFragment.setArguments(null);
                    return mFragment;
                case 8:
                    mFragment = new O8();
                    mFragment.setArguments(null);
                    return mFragment;
                case 9:
                    mFragment = new O9();
                    mFragment.setArguments(null);
                    return mFragment;
                case 10:
                    mFragment = new O9a();
                    mFragment.setArguments(null);
                    return mFragment;
                case 11:
                    mFragment = new O9b();
                    mFragment.setArguments(null);
                    return mFragment;
                case 12:
                    mFragment = new O10();
                    mFragment.setArguments(null);
                    return mFragment;
                case 13:
                    mFragment = new O11a();
                    mFragment.setArguments(null);
                    return mFragment;
                case 14:
                    mFragment = new O11();
                    mFragment.setArguments(null);
                    return mFragment;
                case 15:
                    mFragment = new O12();
                    mFragment.setArguments(null);
                    return mFragment;
                case 16:
                    mFragment = new O12a();
                    mFragment.setArguments(null);
                    return mFragment;
                case 17:
                    mFragment = new O13a();
                    mFragment.setArguments(null);
                    return mFragment;
                case 18:
                    mFragment = new O13();
                    mFragment.setArguments(null);
                    return mFragment;
                case 19:
                    mFragment = new O14();
                    mFragment.setArguments(null);
                    return mFragment;
                case 20:
                    mFragment = new O15();
                    mFragment.setArguments(null);
                    return mFragment;
                case 21:
                    mFragment = new O16();
                    mFragment.setArguments(null);
                    return mFragment;
                case 22:
                    mFragment = new O17();
                    mFragment.setArguments(null);
                    return mFragment;
                case 23:
                    mFragment = new O18();
                    mFragment.setArguments(null);
                    return mFragment;
                case 24:
                    mFragment = new O19();
                    mFragment.setArguments(null);
                    return mFragment;
                case 25:
                    mFragment = new O20();
                    mFragment.setArguments(null);
                    return mFragment;
                case 26:
                    mFragment = new O21();
                    mFragment.setArguments(null);
                    return mFragment;
                case 27:
                    mFragment = new O22();
                    mFragment.setArguments(null);
                    return mFragment;
                case 28:
                    mFragment = new O23();
                    mFragment.setArguments(null);
                    return mFragment;
                case 29:
                    mFragment = new O24();
                    mFragment.setArguments(null);
                    return mFragment;
                case 30:
                    mFragment = new O25();
                    mFragment.setArguments(null);
                    return mFragment;
                case 31:
                    mFragment = new O26();
                    mFragment.setArguments(null);
                    return mFragment;
                case 32:
                    mFragment = new O27();
                    mFragment.setArguments(null);
                    return mFragment;
                case 33:
                    mFragment = new O28();
                    mFragment.setArguments(null);
                    return mFragment;
                case 34:
                    mFragment = new Finish1();
                    mFragment.setArguments(null);
                    return mFragment;

            }
            return null;
        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 35;
        }

        public CharSequence getPageTitle(int position) {
            switch (position) {

                case 0:
                    return "";

            }
            return null;
        }

    }

}
