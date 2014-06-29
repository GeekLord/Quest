package fravier.com.quest.module2;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
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

public class ParentTwo extends ActionBarActivity {
    SectionsPageAdapter pageAdapter;
    QuestViewPager viewPager;

    Button next;
    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_two);
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

    @Override

    public void onBackPressed() {
        if (viewPager.getCurrentItem() != 0) {
            viewPager.setCurrentItem(-1 + viewPager.getCurrentItem());
            return;
        }
        super.onBackPressed();
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
            View rootView = inflater.inflate(R.layout.activity_parent_two,
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
                    mFragment = new T1();
                    mFragment.setArguments(null);
                    return mFragment;
                case 1:
                    mFragment = new T2a();
                    mFragment.setArguments(null);
                    return mFragment;
                case 2:
                    mFragment = new T2();
                    mFragment.setArguments(null);
                    return mFragment;
                case 3:
                    mFragment = new T3();
                    mFragment.setArguments(null);
                    return mFragment;
                case 4:
                    mFragment = new T4();
                    mFragment.setArguments(null);
                    return mFragment;
                case 5:
                    mFragment = new T5();
                    mFragment.setArguments(null);
                    return mFragment;
                case 6:
                    mFragment = new T6();
                    mFragment.setArguments(null);
                    return mFragment;
                case 7:
                    mFragment = new T7();
                    mFragment.setArguments(null);
                    return mFragment;
                case 8:
                    mFragment = new T8();
                    mFragment.setArguments(null);
                    return mFragment;
                case 9:
                    mFragment = new T9();
                    mFragment.setArguments(null);
                    return mFragment;
                case 10:
                    mFragment = new T10();
                    mFragment.setArguments(null);
                    return mFragment;
                case 11:
                    mFragment = new T11();
                    mFragment.setArguments(null);
                    return mFragment;
                case 12:
                    mFragment = new T12();
                    mFragment.setArguments(null);
                    return mFragment;
                case 13:
                    mFragment = new T13();
                    mFragment.setArguments(null);
                    return mFragment;
                case 14:
                    mFragment = new T14();
                    mFragment.setArguments(null);
                    return mFragment;
                case 15:
                    mFragment = new T15();
                    mFragment.setArguments(null);
                    return mFragment;
                case 16:
                    mFragment = new T16();
                    mFragment.setArguments(null);
                    return mFragment;
                case 17:
                    mFragment = new T17();
                    mFragment.setArguments(null);
                    return mFragment;
                case 18:
                    mFragment = new T18();
                    mFragment.setArguments(null);
                    return mFragment;
                case 19:
                    mFragment = new Finish2();
                    mFragment.setArguments(null);
                    return mFragment;

            }
            return null;

        }

        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return 20;
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
