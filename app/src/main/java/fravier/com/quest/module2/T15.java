package fravier.com.quest.module2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class T15 extends Fragment {
    RadioGroup T92b;
    RadioGroup T92c;
    RadioGroup T92d;
    RadioGroup T92e;
    RadioGroup T92f;
    RadioGroup T92g;
    RadioGroup T92h;
    Context ctx;
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T92b = ((RadioGroup) paramView.findViewById(R.id.rdgT92b));
        T92c = ((RadioGroup) paramView.findViewById(R.id.rdgT92c));
        T92d = ((RadioGroup) paramView.findViewById(R.id.rdgT92d));
        T92e = ((RadioGroup) paramView.findViewById(R.id.rdgT92e));
        T92f = ((RadioGroup) paramView.findViewById(R.id.rdgT92f));
        T92g = ((RadioGroup) paramView.findViewById(R.id.rdgT92g));
        T92h = ((RadioGroup) paramView.findViewById(R.id.rdgT92h));
        lbl = ((TextView) paramView.findViewById(R.id.lblT92));
    }

    private void listeners() {

        T92b.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        T92c.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        T92d.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        T92e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        T92f.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        T92g.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        T92h.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t15, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }


    public void savePageData() {
        Answers.setT92b(T92b.indexOfChild(T92b.findViewById(T92b.getCheckedRadioButtonId())) + "");
        Answers.setT92c(T92c.indexOfChild(T92c.findViewById(T92c.getCheckedRadioButtonId())) + "");
        Answers.setT92d(T92d.indexOfChild(T92d.findViewById(T92d.getCheckedRadioButtonId())) + "");
        Answers.setT92e(T92e.indexOfChild(T92e.findViewById(T92e.getCheckedRadioButtonId())) + "");
        Answers.setT92f(T92f.indexOfChild(T92f.findViewById(T92f.getCheckedRadioButtonId())) + "");
        Answers.setT92g(T92g.indexOfChild(T92g.findViewById(T92g.getCheckedRadioButtonId())) + "");
        Answers.setT92h(T92h.indexOfChild(T92h.findViewById(T92h.getCheckedRadioButtonId())) + "");
    }
}

