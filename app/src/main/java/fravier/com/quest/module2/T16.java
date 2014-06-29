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


public class T16 extends Fragment {
    RadioGroup T93a;
    RadioGroup T93b;
    RadioGroup T93c;
    RadioGroup T94;

    EditText txtT93a, txtT93b, txtT93c, txtT94;
    Context ctx;
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T93a = ((RadioGroup) paramView.findViewById(R.id.rdgT93a));
        T93b = ((RadioGroup) paramView.findViewById(R.id.rdgT93b));
        T93c = ((RadioGroup) paramView.findViewById(R.id.rdgT93c));
        T94 = ((RadioGroup) paramView.findViewById(R.id.rdgT94));
        lbl = ((TextView) paramView.findViewById(R.id.lblT93));

        txtT93a = (EditText) paramView.findViewById(R.id.txtT93ab);
        txtT93b = (EditText) paramView.findViewById(R.id.txtT93bb);
        txtT93c = (EditText) paramView.findViewById(R.id.txtT93cb);
        txtT94 = (EditText) paramView.findViewById(R.id.rdgT94i);

    }

    private void listeners() {
        T93a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T93a.indexOfChild(T93a.findViewById(paramAnonymousInt));
                if (i == 1) {
                    txtT93a.setVisibility(View.VISIBLE);
                } else {
                    txtT93a.setVisibility(View.GONE);
                }

                savePageData();

            }
        });
        T93b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T93b.indexOfChild(T93b.findViewById(paramAnonymousInt));
                if (i == 1) {
                    txtT93b.setVisibility(View.VISIBLE);
                } else {
                    txtT93b.setVisibility(View.GONE);
                }

                savePageData();

            }
        });
        T93c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T93c.indexOfChild(T93c.findViewById(paramAnonymousInt));
                if (i == 1) {
                    txtT93c.setVisibility(View.VISIBLE);
                } else {
                    txtT93c.setVisibility(View.GONE);
                }

                savePageData();

            }
        });
        T94.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T94.indexOfChild(T94.findViewById(paramAnonymousInt));
                if (i == 7) {
                    txtT94.setVisibility(View.VISIBLE);
                } else {
                    txtT94.setVisibility(View.GONE);
                }

                savePageData();

            }
        });

    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t16, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void savePageData() {

        if (T93a.indexOfChild(T93a.findViewById(T93a.getCheckedRadioButtonId())) == 1) {
            Answers.setT93a(txtT93a.getText().toString());
        } else {
            Answers.setT93a(T93a.indexOfChild(T93a.findViewById(T93a.getCheckedRadioButtonId())) + "");
        }


        if (T93b.indexOfChild(T93b.findViewById(T93b.getCheckedRadioButtonId())) == 1) {
            Answers.setT93b(txtT93b.getText().toString());
        } else {
            Answers.setT93b(T93b.indexOfChild(T93b.findViewById(T93b.getCheckedRadioButtonId())) + "");
        }

        if (T93c.indexOfChild(T93c.findViewById(T93c.getCheckedRadioButtonId())) == 1) {
            Answers.setT93c(txtT93c.getText().toString());
        } else {
            Answers.setT93c(T93c.indexOfChild(T93c.findViewById(T93c.getCheckedRadioButtonId())) + "");
        }

        if (T94.indexOfChild(T94.findViewById(T94.getCheckedRadioButtonId())) == 7) {
            Answers.setT94(txtT94.getText().toString());
        } else {
            Answers.setT94(T94.indexOfChild(T94.findViewById(T94.getCheckedRadioButtonId())) + "");
        }


    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();
        } catch (NullPointerException e) {
        }
    }
}
