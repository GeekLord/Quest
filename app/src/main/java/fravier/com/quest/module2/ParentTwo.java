package fravier.com.quest.module2;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
import android.widget.Toast;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.Logic;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.QuestViewPager;
import fravier.com.quest.Dashboard;
import fravier.com.quest.R;

public class ParentTwo extends ActionBarActivity {
    SectionsPageAdapter pageAdapter;
    QuestViewPager viewPager;

    Button next;
    Button prev;

    public static void customDialog(String title, String message, Context ctx,
                                    int MessageType) {
    }

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
        prev.setVisibility(View.INVISIBLE);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                nextIntents();
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
                prevIntents();
            }
        });


        viewPager.setOnPageChangeListener(new QuestViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int arg0) {


            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {


            }


            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });

    }

    public void nextIntents() {
        Logic localLogic = new Logic(getApplication());
        int i = this.viewPager.getCurrentItem();
        if (i == 0) {
            prev.setVisibility(View.VISIBLE);
        }
        if (i == 18) {
            next.setVisibility(View.INVISIBLE);
        }
        if (i == 2) {//fraction
            String answersplit[] = Answers.getT40a().split("of");
            boolean a = answersplit[0].trim().isEmpty();
            boolean b = answersplit[1].trim().isEmpty();
            boolean c = a ^ b;
            if (c) {
                Toast.makeText(getApplication(), "Kindly answer complete question 4.0a", Toast.LENGTH_SHORT).show();
            } else {
                viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 10) {//others
            String str6 = Answers.getT54();
            if (OthersMap.getT52() == 2) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (OthersMap.getT54() == 1 && str6.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else {
                viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 14) {//others
            String str6 = Answers.getT91();
            if (OthersMap.getT91() == 1 && str6.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else {
                viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 16) {//others
            String str1 = Answers.getT93a();
            String str2 = Answers.getT93b();
            String str3 = Answers.getT93c();
            String str4 = Answers.getT94();
            if (OthersMap.getT93a() == 1 && str1.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (OthersMap.getT93b() == 1 && str2.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (OthersMap.getT93c() == 1 && str3.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (OthersMap.getT94() == 1 && str4.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else {
                viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 17) {//others
            String str1 = Answers.getT95();
            String str2 = Answers.getT96();
            String str3 = Answers.getT97();
            String str4 = Answers.getT98();
            String str5 = Answers.getT99();
            if (OthersMap.getT95() == 1 && str1.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (OthersMap.getT96() == 1 && str2.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (OthersMap.getT97() == 1 && str3.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (OthersMap.getT98() == 1 && str4.equals("")) {

                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

            } else if (str5.contains("Acres") && str5.trim().length() == 5) {
                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();
            } else if (str5.contains("Hectares") && str5.trim().length() == 8) {
                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();
            } else if (str5.contains("Feet") && str5.trim().length() == 4) {
                Toast.makeText(ParentTwo.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();
            } else {
                viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 4) {
            if (Answers.getT49().equals("-1")) {
                Toast.makeText(getApplication(), "Kindly answer question 4.9 ", Toast.LENGTH_SHORT).show();
            } else {
                viewPager.setCurrentItem(localLogic.ALU("T49", Answers.getT49(), i));
            }
        } else if (i == 6) {
            if (Answers.getT413().equals("-1")) {
                Toast.makeText(getApplication(), "Kindly answer question 4.13 ", Toast.LENGTH_SHORT).show();
            } else {
                viewPager.setCurrentItem(localLogic.ALU("T413", Answers.getT413(), i));
            }
        } else if (i == 9) {
            if (Answers.getT51().equals("-1")) {
                Toast.makeText(getApplication(), "Kindly answer question 5.1 ", Toast.LENGTH_SHORT).show();
            } else {
                viewPager.setCurrentItem(localLogic.ALU("T51", Answers.getT51(), i));
            }


        } else if (i == 11) {
            if (Answers.getT71().equals("-1")) {
                Toast.makeText(getApplication(), "Kindly answer question 7.1 ", Toast.LENGTH_SHORT).show();
            } else {
                viewPager.setCurrentItem(localLogic.ALU("T71", Answers.getT71(), i));
            }
        } else {
            viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);

        }

    }

    public void prevIntents() {
        int i = this.viewPager.getCurrentItem();
        if (i == 19) {
            next.setVisibility(View.VISIBLE);
        }
        if (i == 1) {
            prev.setVisibility(View.INVISIBLE);
        }
        if (i == 6) {
            String str6 = Answers.getT49();
            if ((str6.equals("1")) || (str6.equals("2"))) {
                viewPager.setCurrentItem(4);
            } else {
                viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 7) {
            String str6 = Answers.getT413();
            if (str6.equals("0")) {
                viewPager.setCurrentItem(6);
            } else {
                viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 8) {
            String str6 = Answers.getT413();
            if ((str6.equals("1"))) {
                viewPager.setCurrentItem(6);
            } else {
                viewPager.setCurrentItem(7);
            }
        } else if (i == 11) {
            String str6 = Answers.getT51();
            if ((str6.equals("1"))) {
                viewPager.setCurrentItem(9);
            } else {
                viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
            }
        } else if (i == 14) {
            String str6 = Answers.getT71();
            if ((str6.equals("1"))) {
                viewPager.setCurrentItem(11);
            } else {
                viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
            }
        } else {
            viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
        }
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

            AlertDialog.Builder adb = new AlertDialog.Builder(ParentTwo.this);


            adb.setMessage("Kindly note that if you exit the form before saving, you will loose all your form data. Would you still like to go to HOME");
            adb.setCancelable(true);
            adb.setTitle("Are you sure you would like to exit ?");
            //adb.setIcon(dble);
            adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface arg0, int arg1) {
                    arg0.cancel();
                }

            });
            adb.setPositiveButton("Home", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(getApplication(), Dashboard.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                    finish();
                }
            });

            adb.show();


            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override

    public void onBackPressed() {
        if (viewPager.getCurrentItem() != 0) {
            prevIntents();
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
