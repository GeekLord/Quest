package fravier.com.quest.module2;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class T18 extends Fragment {
    RadioGroup T121;
    RadioGroup T122;
    TextView T12_time_end;
    Context ctx;
    TextView lbl;
    Calendar myCalendar = Calendar.getInstance();
    TimePickerDialog.OnTimeSetListener time = new TimePickerDialog.OnTimeSetListener() {
        private void updateTime() {
            SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
            T12_time_end.setText(localSimpleDateFormat.format(myCalendar.getTime()));
        }

        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            myCalendar.set(Calendar.HOUR_OF_DAY, hourOfDay);
            myCalendar.set(Calendar.MINUTE, minute);
            updateTime();
        }

    };

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T121 = ((RadioGroup) paramView.findViewById(R.id.rdgT121));
        T122 = ((RadioGroup) paramView.findViewById(R.id.rdgT122));
        lbl = ((TextView) paramView.findViewById(R.id.lblT121));
        T12_time_end = ((TextView) paramView.findViewById(R.id.T12_time_end));
        SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("HH:mm", Locale.US);
        T12_time_end.setText(localSimpleDateFormat.format(myCalendar.getTime()));
    }

    private void listeners() {

        T12_time_end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                new TimePickerDialog(ctx, time, myCalendar.get(Calendar.HOUR_OF_DAY), myCalendar.get(Calendar.MINUTE), true).show();
            }
        });
        T121.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        T122.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
    }

    public void savePageData() {
        Answers.setT121(T121.indexOfChild(T121.findViewById(T121.getCheckedRadioButtonId())) + "");
        Answers.setT122(T122.indexOfChild(T122.findViewById(T122.getCheckedRadioButtonId())) + "");
        Answers.setT12_time_end(T12_time_end.getText().toString().trim());
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
        View v = inflater.inflate(R.layout.fragment_t18, container, false);
        initviews(v);
        fonting();
        listeners();
        savePageData();
        return v;
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
