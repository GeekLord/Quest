package fravier.com.quest.module1;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.widget.Toast;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.Logic;
import fravier.com.fravier.com.results.OthersMap;
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

    public void nextIntents() {
        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        Logic localLogic = new Logic(getApplication());
        int i = viewPager.getCurrentItem();
        if (i == 0) {
            prev.setVisibility(View.VISIBLE);
        }
        if (i == 33) {
            next.setVisibility(View.INVISIBLE);
        } else if (i != 0) {
            prev.setVisibility(View.VISIBLE);
        }
        //the page navigations

        if (Answers.getXx() == 0) {
            // int x=(Integer.parseInt(Answers.getO02())+3)%2;
            //Toast.makeText(getApplication(),"Using zero "+Answers.getXx()+"::",Toast.LENGTH_SHORT).show();
            if (i == 1) {
                if (Answers.getO11().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 1.1 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O11", Answers.getO11(), i));
                }
            } else if (i == 3) {
                if (Answers.getO19().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 1.9 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O19", Answers.getO19(), i));
                }
            } else if (i == 5) {//others
                String str6 = Answers.getO111();
                if (OthersMap.getO111() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 10) {//others
                String str6 = Answers.getO25();
                if (OthersMap.getO25() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 12) {//others
                String str6 = Answers.getO27();
                if (OthersMap.getO27() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 27) {//others
                String str6 = Answers.getO52();
                if (OthersMap.getO52() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 28) {//others
                // String str6 = Answers.getO27();
                if (OthersMap.getO61() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 30) {//others
                // String str6 = Answers.getO27();
                if (OthersMap.getO66() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 31) {//others

                if (OthersMap.getO67() == 2 || OthersMap.getO68() == 2 || OthersMap.getO69() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 32) {//others

                String str6 = Answers.getO54();
                if (OthersMap.getO54() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 6) {
                if (Answers.getO21().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 2.1 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O21", Answers.getO21(), i));
                }
            } else if (i == 7) {
                if (Answers.getO22().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 2.2 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O22", Answers.getO22(), i));
                }
            } else if (i == 9) {
                if (Answers.getO24().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 2.4 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O24", Answers.getO24(), i));
                }
            } else if (i == 18) {//fraction split
                String answersplit[] = Answers.getO40a().split("of");
                boolean a = answersplit[0].trim().isEmpty();
                boolean b = answersplit[1].trim().isEmpty();
                boolean c = a ^ b;
                if (c) {
                    Toast.makeText(getApplication(), "Kindly answer complete question 4.0a", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O49", Answers.getO49(), i));
                }
            } else if (i == 21) {
                if (Answers.getO49().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 4.9 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O49", Answers.getO49(), i));
                }
            } else if (i == 22) {//aversion coz in 22
                if (Answers.getO49().equals("0")) {
                    viewPager.setCurrentItem(26);
                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 23) {
                if (Answers.getO413().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 4.13 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O413", Answers.getO413(), i));
                }
            } else if (i == 24) {//skip page 25(no 4.15)
                if (Answers.getO413().trim().equals("0")) {
                    viewPager.setCurrentItem(26);
                }
            } else if (i == 26) {
                if (Answers.getO51().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 5.1 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O51", Answers.getO51(), i));
                }
            } else if (i == 29) {
                if (Answers.getO65().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 6.5 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O65", Answers.getO65(), i));
                }//diversion here
            } else {//till here
                viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);

            }
        } else if (Answers.getXx() == 1) {
            // Toast.makeText(getApplication(), "Using One " + Answers.getXx(), Toast.LENGTH_SHORT).show();

            if (i == 1) {
                if (Answers.getO11().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 1.1 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O11", Answers.getO11(), i));
                }
            } else if (i == 3) {
                if (Answers.getO19().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 1.9 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O19", Answers.getO19(), i));
                }
            } else if (i == 5) {//others
                String str6 = Answers.getO111();
                if (OthersMap.getO111() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 10) {//others
                String str6 = Answers.getO25();
                if (OthersMap.getO25() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 12) {//others
                String str6 = Answers.getO27();
                if (OthersMap.getO27() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 27) {//others
                String str6 = Answers.getO52();
                if (OthersMap.getO52() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 28) {//others
                // String str6 = Answers.getO27();
                if (OthersMap.getO61() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 30) {//others
                // String str6 = Answers.getO27();
                if (OthersMap.getO66() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 31) {//others

                if (OthersMap.getO67() == 2 || OthersMap.getO68() == 2 || OthersMap.getO69() == 2) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 32) {//others

                String str6 = Answers.getO54();
                if (OthersMap.getO54() == 1 && str6.equals("")) {

                    Toast.makeText(ParentOne.this, "Kindly specify your answer", Toast.LENGTH_SHORT).show();

                } else {
                    viewPager.setCurrentItem(21);
                }
            } else if (i == 6) {
                if (Answers.getO21().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 2.1 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O21", Answers.getO21(), i));
                }
            } else if (i == 7) {
                if (Answers.getO22().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 2.2 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O22", Answers.getO22(), i));
                }
            } else if (i == 9) {
                if (Answers.getO24().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 2.4 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O24", Answers.getO24(), i));
                }
            } else if (i == 18) {//fraction split
                String answersplit[] = Answers.getO40a().split("of");
                boolean a = answersplit[0].trim().isEmpty();
                boolean b = answersplit[1].trim().isEmpty();
                boolean c = a ^ b;
                if (c) {
                    Toast.makeText(getApplication(), "Kindly answer complete question 4.0a", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O49", Answers.getO49(), i));
                }
            } else if (i == 21) {
                if (Answers.getO49().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 4.9 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O49", Answers.getO49(), i));
                }
            } else if (i == 22) {
                if (Answers.getO49().equals("0")) {
                    viewPager.setCurrentItem(33);
                } else {
                    viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 23) {
                if (Answers.getO413().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 4.13 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O413", Answers.getO413(), i));
                }
            } else if (i == 26) {
                if (Answers.getO51().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 5.1 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O51", Answers.getO51(), i));
                }
            } else if (i == 29) {
                if (Answers.getO65().trim().equals("-1")) {
                    Toast.makeText(getApplication(), "Kindly answer question 6.5 ", Toast.LENGTH_SHORT).show();
                } else {
                    viewPager.setCurrentItem(localLogic.ALU("O65", Answers.getO65(), i));
                }//diversion here
            } else if (i == 20) {
                viewPager.setCurrentItem(26);
            } else if (i == 24) {//skip page 25(no 4.15)
                if (Answers.getO413().trim().equals("0")) {
                    viewPager.setCurrentItem(33);
                }
            } else if (i == 25) {

                viewPager.setCurrentItem(33);
            } else {//till here
                viewPager.setCurrentItem(1 + viewPager.getCurrentItem(), true);

            }
        }
    }


    public void prevIntents() {
        int i = viewPager.getCurrentItem();
        if (i != 34) {
            next.setVisibility(View.VISIBLE);
        }
        if (i == 1) {
            prev.setVisibility(View.INVISIBLE);
        }
        if (i != 0) {
            prev.setVisibility(View.VISIBLE);
        }
        if (Answers.getXx() == 0) {

            if (i == 3) {
                if (Answers.getO11().equals("0")) {
                    viewPager.setCurrentItem(2);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            }


            if (i == 5) {
                String str6 = Answers.getO19();
                if ((str6.equals("0"))) {
                    viewPager.setCurrentItem(3);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 12) {
                String str4 = Answers.getO21();
                String str5 = Answers.getO22();
                //Answers.getO26();
                if (str4.equals("1")) {
                    viewPager.setCurrentItem(6);
                } else if (str5.equals("2")) {
                    viewPager.setCurrentItem(7);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 9) {
                if (Answers.getO22().equals("1")) {
                    viewPager.setCurrentItem(7);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 11) {
                String str3 = Answers.getO24();
                if ((str3.equals("0")) || (str3.equals("2"))) {
                    viewPager.setCurrentItem(9);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 23) {
                String str2 = Answers.getO49();
                if ((str2.equals("1")) || (str2.equals("2"))) {
                    viewPager.setCurrentItem(21);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 24) {

                viewPager.setCurrentItem(23);

            } else if (i == 25) {
                if (Answers.getO413().equals("0")) {
                    viewPager.setCurrentItem(23);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 26) {
                if (Answers.getO49().equals("0")) {
                    viewPager.setCurrentItem(22);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 28) {
                if (Answers.getO51().equals("1")) {
                    viewPager.setCurrentItem(26);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 31) {
                String str1 = Answers.getO65();
                if ((str1.equals("1")) || (str1.equals("2"))) {
                    viewPager.setCurrentItem(29);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else {
                viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
            }
        } else if (Answers.getXx() == 1) {
            // Toast.makeText(getApplication(),"shoing "+i,Toast.LENGTH_SHORT).show();
            if (i == 3) {
                if (Answers.getO11().equals("0")) {
                    viewPager.setCurrentItem(2);
                }
            }


            if (i == 5) {
                String str6 = Answers.getO19();
                if ((str6.equals("0"))) {
                    viewPager.setCurrentItem(3);
                }
            } else if (i == 12) {
                String str4 = Answers.getO21();
                String str5 = Answers.getO22();
                //Answers.getO26();
                if (str4.equals("1")) {
                    viewPager.setCurrentItem(6);
                } else if (str5.equals("2")) {
                    viewPager.setCurrentItem(7);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 9) {
                if (Answers.getO22().equals("1")) {
                    viewPager.setCurrentItem(7);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 11) {
                String str3 = Answers.getO24();
                if ((str3.equals("0")) || (str3.equals("2"))) {
                    viewPager.setCurrentItem(9);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 23) {
                String str2 = Answers.getO49();
                if ((str2.equals("1")) || (str2.equals("2"))) {
                    viewPager.setCurrentItem(21);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 24) {//the 4.13 saga

                viewPager.setCurrentItem(23);

            } else if (i == 25) {
                if (Answers.getO413().equals("1")) {
                    viewPager.setCurrentItem(23);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 28) {
                if (Answers.getO51().equals("1")) {
                    viewPager.setCurrentItem(26);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 31) {
                String str1 = Answers.getO65();
                if ((str1.equals("1")) || (str1.equals("2"))) {
                    viewPager.setCurrentItem(29);
                } else {
                    viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
                }
            } else if (i == 26) {
                viewPager.setCurrentItem(20);
                // Toast.makeText(getApplication(),"am here"+i,Toast.LENGTH_SHORT).show();
            } else if (i == 21) {
                viewPager.setCurrentItem(32);

            } else if (i == 33) {//the 4.13 saga
                if (Answers.getO413().equals("0")) {
                    viewPager.setCurrentItem(24);
                } else if (Answers.getO49().equals("0")) {
                    viewPager.setCurrentItem(22);
                } else {
                    viewPager.setCurrentItem(25);
                }


            } else {
                viewPager.setCurrentItem(-1 + viewPager.getCurrentItem(), true);
            }
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
            AlertDialog.Builder adb = new AlertDialog.Builder(ParentOne.this);


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
            // viewPager.setCurrentItem(-1 + viewPager.getCurrentItem());
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
                    mFragment = new O12a();
                    mFragment.setArguments(null);
                    return mFragment;
                case 16:
                    mFragment = new O12();
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
