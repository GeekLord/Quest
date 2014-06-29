package fravier.com.quest.module2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class T17 extends Fragment {
    RadioGroup T95;
    RadioGroup T96;
    RadioGroup T97;
    RadioGroup T98;
    RadioGroup T99;
    Context ctx;
    TextView lbl;
    EditText txtT95;
    EditText txtT96;
    EditText txtT97;
    EditText txtT98;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) this.lbl.getRootView(), this.ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        this.T95 = ((RadioGroup) paramView.findViewById(R.id.rdgT95));
        this.T96 = ((RadioGroup) paramView.findViewById(R.id.rdgT96));
        this.T97 = ((RadioGroup) paramView.findViewById(R.id.rdgT97));
        this.T98 = ((RadioGroup) paramView.findViewById(R.id.rdgT98));
        this.T99 = ((RadioGroup) paramView.findViewById(R.id.rdgT99));
        this.txtT95 = ((EditText) paramView.findViewById(R.id.rdgT95i));
        this.txtT96 = ((EditText) paramView.findViewById(R.id.rdgT96g));
        this.txtT97 = ((EditText) paramView.findViewById(R.id.rdgT97h));
        this.txtT98 = ((EditText) paramView.findViewById(R.id.rdgT98f));
        this.lbl = ((TextView) paramView.findViewById(R.id.lblT95));
    }

    private void listeners() {
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        this.ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t17, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();
        this.T95.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T17.this.T95.indexOfChild(T17.this.T95.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 7) {
                    T17.this.txtT95.setVisibility(View.VISIBLE);
                    return;
                }
                T17.this.txtT95.setVisibility(View.GONE);
                Answers.setT95(T17.this.T95.indexOfChild(T17.this.T95.findViewById(T17.this.T95.getCheckedRadioButtonId())) + "");
            }
        });
        this.T96.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T17.this.T96.indexOfChild(T17.this.T96.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 5) {
                    T17.this.txtT96.setVisibility(View.VISIBLE);
                    return;
                }
                T17.this.txtT96.setVisibility(View.GONE);
                Answers.setT96(T17.this.T96.indexOfChild(T17.this.T96.findViewById(T17.this.T96.getCheckedRadioButtonId())) + "");
            }
        });
        this.T97.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T17.this.T97.indexOfChild(T17.this.T97.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 6) {
                    T17.this.txtT97.setVisibility(View.VISIBLE);
                    return;
                }
                T17.this.txtT97.setVisibility(View.GONE);
                Answers.setT97(T17.this.T97.indexOfChild(T17.this.T97.findViewById(T17.this.T97.getCheckedRadioButtonId())) + "");
            }
        });
        this.T98.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T17.this.T98.indexOfChild(T17.this.T98.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 4) {
                    T17.this.txtT98.setVisibility(View.VISIBLE);
                    return;
                }
                T17.this.txtT98.setVisibility(View.GONE);
                Answers.setT98(T17.this.T98.indexOfChild(T17.this.T98.findViewById(T17.this.T98.getCheckedRadioButtonId())) + "");
            }
        });
        this.T99.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                T17.this.savePageData();
            }
        });
        super.onResume();
    }

    public void savePageData() {
        if (this.T95.indexOfChild(this.T95.findViewById(this.T95.getCheckedRadioButtonId())) == 7) {
            Answers.setT95(this.txtT95.getText().toString());
        }
        if (this.T96.indexOfChild(this.T96.findViewById(this.T96.getCheckedRadioButtonId())) == 5) {
            Answers.setT96(this.txtT96.getText().toString());
        }
        if (this.T97.indexOfChild(this.T97.findViewById(this.T97.getCheckedRadioButtonId())) == 6) {
            Answers.setT97(this.txtT97.getText().toString());
        }
        if (this.T98.indexOfChild(this.T98.findViewById(this.T98.getCheckedRadioButtonId())) == 4) {
            Answers.setT98(this.txtT98.getText().toString());
        }
        Answers.setT99(this.T99.indexOfChild(this.T99.findViewById(this.T99.getCheckedRadioButtonId())) + "");
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }
}