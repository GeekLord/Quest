package fravier.com.quest.module2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

import fravier.com.fravier.com.results.Answers;
import fravier.com.quest.R;


public class T4 extends Fragment {
    RadioGroup T49;
    Context ctx;

    private void initviews(View paramView) {
        T49 = ((RadioGroup) paramView.findViewById(R.id.rdgT49));
    }

    private void listeners() {
        T49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t4, paramViewGroup, false);
        initviews(localView);
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();

        super.onResume();
    }

    public void savePageData() {
        Answers.setT49(T49.indexOfChild(T49.findViewById(T49.getCheckedRadioButtonId())) + "");
    }
}

