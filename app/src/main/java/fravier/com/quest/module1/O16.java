package fravier.com.quest.module1;

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


public class O16 extends Fragment {
    RadioGroup O49;
    Context ctx;

    private void initviews(View paramView) {
        O49 = ((RadioGroup) paramView.findViewById(R.id.rdgO49));
    }

    private void listeners() {
        O49.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o16, paramViewGroup, false);
        initviews(localView);
        listeners();
        savePageData();
        return localView;
    }


    public void savePageData() {
        Answers.setO49(O49.indexOfChild(O49.findViewById(O49.getCheckedRadioButtonId())) + "");
    }
}

