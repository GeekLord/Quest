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
import fravier.com.global.Fonting;
import fravier.com.quest.R;

public class O2 extends Fragment {
    Context ctx;
    RadioGroup O11;

    private void initviews(View paramView) {
        O11 = ((RadioGroup) paramView.findViewById(R.id.rdgO11));
    }

    private void listeners() {
        O11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int selected) {
                savePageData();
            }
        });
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) O11.getRootView(), ctx, Fonting.KEY_REGULAR);
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

        View v = inflater.inflate(R.layout.fragment_o2, container, false);
        initviews(v);
        listeners();
        fonting();
        savePageData();

        return v;
    }

    public void savePageData() {
        Answers.setO11(O11.indexOfChild(O11.findViewById(O11.getCheckedRadioButtonId())) + "");
    }

}
