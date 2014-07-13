package fravier.com.quest.module2;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class T1 extends Fragment {
    public EditText T02;
    public EditText T03;
    public EditText T04;
    public EditText T05;
    public EditText T06;
    public EditText T07;
    public TextView T07_day;
    public TextView T07_time;

    TableRow viewB, viewC, viewD;
    RadioGroup T3a, T3c, T3d;
    EditText T3b;
    EditText T3dd;
    Context ctx;
    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        private void updateDate() {
            SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
            T07_day.setText(localSimpleDateFormat.format(myCalendar.getTime()));
        }

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {
            // TODO Auto-generated method stub
            myCalendar.set(Calendar.YEAR, year);
            myCalendar.set(Calendar.MONTH, monthOfYear);
            myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateDate();
        }
    };
    TextView lbl;
    Calendar myCalendar = Calendar.getInstance();
    TimePickerDialog.OnTimeSetListener time = new TimePickerDialog.OnTimeSetListener() {
        private void updateTime() {
            SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
            T07_time.setText(localSimpleDateFormat.format(myCalendar.getTime()));
        }

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myCalendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            myCalendar.set(Calendar.MINUTE, minute);
            updateTime();
        }

    };

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO1d));
        T02 = ((EditText) paramView.findViewById(R.id.txtT02));
        T03 = ((EditText) paramView.findViewById(R.id.txtT03));
        T04 = ((EditText) paramView.findViewById(R.id.txtT04));
        T05 = ((EditText) paramView.findViewById(R.id.txtT05));
        T06 = ((EditText) paramView.findViewById(R.id.txtT06));
        T07 = ((EditText) paramView.findViewById(R.id.txtT07));
        T07_day = ((TextView) paramView.findViewById(R.id.txtT_date));
        T07_time = ((TextView) paramView.findViewById(R.id.txtT_time));
        SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("HH:mm", Locale.US);
        T07_time.setText(localSimpleDateFormat1.format(myCalendar.getTime()));
        SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        T07_day.setText(localSimpleDateFormat2.format(myCalendar.getTime()));


        viewB = (TableRow) paramView.findViewById(R.id.viewB);
        viewC = (TableRow) paramView.findViewById(R.id.viewC);
        viewD = (TableRow) paramView.findViewById(R.id.viewD);

        T3a = (RadioGroup) paramView.findViewById(R.id.rdgO3a);
        T3c = (RadioGroup) paramView.findViewById(R.id.rdgO3c);
        T3d = (RadioGroup) paramView.findViewById(R.id.rdgO3d);

        T3b = (EditText) paramView.findViewById(R.id.txtO3b);
        T3dd = (EditText) paramView.findViewById(R.id.rdgO3dd);


    }

    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_t1, container, false);
        initViews(v);
        listeners();
        Fonting.setTypeFaceForViewGroup((ViewGroup) this.lbl.getRootView(), this.ctx, Fonting.KEY_REGULAR);
        savePageData();
        return v;
    }

    private void listeners() {
        T3a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int x = T3a.indexOfChild(T3a.findViewById(checkedId));
                if (x == 0) {
                    viewB.setVisibility(View.VISIBLE);
                    viewC.setVisibility(View.VISIBLE);
                    viewD.setVisibility(View.GONE);

                } else {
                    viewB.setVisibility(View.GONE);
                    viewC.setVisibility(View.GONE);
                    viewD.setVisibility(View.GONE);
                }
                savePageData();
            }
        });
        T3c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int x = T3c.indexOfChild(T3c.findViewById(checkedId));
                if (x == 0) {
                    viewD.setVisibility(View.GONE);

                } else {
                    viewD.setVisibility(View.VISIBLE);
                }
                savePageData();
            }
        });
        T3d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int x = T3d.indexOfChild(T3d.findViewById(checkedId));
                if (x == 2) {
                    T3dd.setVisibility(View.VISIBLE);
                    OthersMap.setT3(1);

                } else {
                    T3dd.setVisibility(View.GONE);
                    OthersMap.setT3(0);
                }
                savePageData();
            }
        });


        T07_day.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                new DatePickerDialog(ctx, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        T07_time.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                new TimePickerDialog(ctx, time, myCalendar.get(Calendar.HOUR_OF_DAY), myCalendar.get(Calendar.MINUTE), true).show();
            }
        });
        T3dd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                savePageData();
            }

            @Override
            public void afterTextChanged(Editable s) {
                savePageData();
            }
        });
    }


    public void savePageData() {
        Answers.setT02(this.T02.getText().toString().trim());
        Answers.setT03(this.T03.getText().toString().trim());
        Answers.setT04(this.T04.getText().toString().trim());
        Answers.setT05(this.T05.getText().toString().trim());
        Answers.setT06(this.T06.getText().toString().trim());
        Answers.setT07(this.T07.getText().toString().trim());
        Answers.setT07_day(this.T07_day.getText().toString().trim());
        Answers.setT07_time(this.T07_time.getText().toString().trim());

        //
        Answers.setT03a(T3a.indexOfChild(T3a.findViewById(T3a.getCheckedRadioButtonId())) + "");
        Answers.setT03c(T3c.indexOfChild(T3c.findViewById(T3c.getCheckedRadioButtonId())) + "");
        if (T3d.indexOfChild(T3d.findViewById(T3d.getCheckedRadioButtonId())) == 2) {
            Answers.setT03d(T3dd.getText().toString());
        } else {
            Answers.setT03d(T3d.indexOfChild(T3d.findViewById(T3d.getCheckedRadioButtonId())) + "");

        }
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }
}


