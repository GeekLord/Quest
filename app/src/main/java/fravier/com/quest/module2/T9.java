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


public class T9 extends Fragment {
    RadioGroup T51;
    Context ctx;
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T51 = ((RadioGroup) paramView.findViewById(R.id.rdgT51));
        lbl = ((TextView) paramView.findViewById(R.id.lblT51));
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t9, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();
        T51.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        super.onResume();
    }

    public void savePageData() {
        Answers.setT51(T51.indexOfChild(T51.findViewById(T51.getCheckedRadioButtonId())) + "");
    }
}

