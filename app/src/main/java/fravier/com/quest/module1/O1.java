package fravier.com.quest.module1;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import fravier.com.fravier.com.results.Answers;
import fravier.com.quest.R;


public class O1 extends Fragment {
    public RadioGroup O01;
    public EditText O02;
    public EditText O03;
    public EditText O04;
    public EditText O05;
    public EditText O06;
    public EditText O07;
    public TextView O07_day;
    public TextView O07_time;
    Context ctx;

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        private void updateDate() {
            SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
            O07_day.setText(localSimpleDateFormat.format(myCalendar.getTime()));
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
            O07_time.setText(localSimpleDateFormat.format(myCalendar.getTime()));
        }

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myCalendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            myCalendar.set(Calendar.MINUTE, minute);
            updateTime();
        }

    };

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO1));
        O01 = ((RadioGroup) paramView.findViewById(R.id.rdgO1));
        O02 = ((EditText) paramView.findViewById(R.id.txtO02));
        O03 = ((EditText) paramView.findViewById(R.id.txtO03));
        O04 = ((EditText) paramView.findViewById(R.id.txtO04));
        O05 = ((EditText) paramView.findViewById(R.id.txtO05));
        O06 = ((EditText) paramView.findViewById(R.id.txtO06));
        O07 = ((EditText) paramView.findViewById(R.id.txtO07));
        O07_day = ((TextView) paramView.findViewById(R.id.txtO1_date));
        O07_time = ((TextView) paramView.findViewById(R.id.txtO1_time));
        SimpleDateFormat localSimpleDateFormat1 = new SimpleDateFormat("HH:mm", Locale.US);
        O07_time.setText(localSimpleDateFormat1.format(myCalendar.getTime()));
        SimpleDateFormat localSimpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy", Locale.US);
        O07_day.setText(localSimpleDateFormat2.format(myCalendar.getTime()));
    }

    private void listeners() {
        O01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Answers.setO01(O01.indexOfChild(O01.findViewById(O01.getCheckedRadioButtonId())) + "");

            }
        });

        O07_day.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                new DatePickerDialog(ctx, date, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        O07_time.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                new TimePickerDialog(ctx, time, myCalendar.get(Calendar.HOUR_OF_DAY), myCalendar.get(Calendar.MINUTE), true).show();
            }
        });
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
        View v = inflater.inflate(R.layout.fragment_o1, container, false);

        initViews(v);
        listeners();
        // Fonting.setTypeFaceForViewGroup((ViewGroup)this.lbl.getRootView(), this.ctx, Fonting.KEY_REGULAR);
        savePageData();

        return v;
    }

    public void savePageData() {
        Answers.setO01(O01.indexOfChild(O01.findViewById(O01.getCheckedRadioButtonId())) + "");
        Answers.setO02(O02.getText().toString().trim());
        Answers.setO03(O03.getText().toString().trim());
        Answers.setO04(O04.getText().toString().trim());
        Answers.setO05(O05.getText().toString().trim());
        Answers.setO06(O06.getText().toString().trim());
        Answers.setO07(O07.getText().toString().trim());
        Answers.setO07_day(O07_day.getText().toString().trim());
        Answers.setO07_time(O07_time.getText().toString().trim());
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        if (!paramBoolean) {
        }
        try {
            savePageData();
            return;
        } catch (NullPointerException e) {
        }
    }


}
