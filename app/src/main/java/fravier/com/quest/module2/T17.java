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
    EditText T99x, T99y, T99z;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T95 = ((RadioGroup) paramView.findViewById(R.id.rdgT95));
        T96 = ((RadioGroup) paramView.findViewById(R.id.rdgT96));
        T97 = ((RadioGroup) paramView.findViewById(R.id.rdgT97));
        T98 = ((RadioGroup) paramView.findViewById(R.id.rdgT98));
        T99 = ((RadioGroup) paramView.findViewById(R.id.rdgT99));
        txtT95 = ((EditText) paramView.findViewById(R.id.rdgT95i));
        txtT96 = ((EditText) paramView.findViewById(R.id.rdgT96g));
        txtT97 = ((EditText) paramView.findViewById(R.id.rdgT97h));
        txtT98 = ((EditText) paramView.findViewById(R.id.rdgT98f));
        lbl = ((TextView) paramView.findViewById(R.id.lblT95));
        T99x = (EditText) paramView.findViewById(R.id.T99x);
        T99y = (EditText) paramView.findViewById(R.id.T99y);
        T99z = (EditText) paramView.findViewById(R.id.T99z);

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
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t17, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();
        T95.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T95.indexOfChild(T95.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 7) {
                    txtT95.setVisibility(View.VISIBLE);
                    return;
                }
                txtT95.setVisibility(View.GONE);
                Answers.setT95(T95.indexOfChild(T95.findViewById(T95.getCheckedRadioButtonId())) + "");
            }
        });
        T96.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T96.indexOfChild(T96.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 5) {
                    txtT96.setVisibility(View.VISIBLE);
                    return;
                }
                txtT96.setVisibility(View.GONE);
                Answers.setT96(T96.indexOfChild(T96.findViewById(T96.getCheckedRadioButtonId())) + "");
            }
        });
        T97.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T97.indexOfChild(T97.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 6) {
                    txtT97.setVisibility(View.VISIBLE);
                    return;
                }
                txtT97.setVisibility(View.GONE);
                Answers.setT97(T97.indexOfChild(T97.findViewById(T97.getCheckedRadioButtonId())) + "");
            }
        });
        T98.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T98.indexOfChild(T98.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 4) {
                    txtT98.setVisibility(View.VISIBLE);
                    return;
                }
                txtT98.setVisibility(View.GONE);
                Answers.setT98(T98.indexOfChild(T98.findViewById(T98.getCheckedRadioButtonId())) + "");
            }
        });
        T99.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T99.indexOfChild(T99.findViewById(paramAnonymousInt));
                if (i == 1) {
                    T99x.setVisibility(View.VISIBLE);
                } else {
                    T99x.setVisibility(View.INVISIBLE);
                }
                if (i == 2) {
                    T99y.setVisibility(View.VISIBLE);
                } else {
                    T99y.setVisibility(View.INVISIBLE);
                }
                if (i == 3) {
                    T99z.setVisibility(View.VISIBLE);
                } else {
                    T99z.setVisibility(View.INVISIBLE);
                }
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