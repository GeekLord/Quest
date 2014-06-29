package fravier.com.quest.module1;

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


public class O8 extends Fragment {
    Context ctx;
    TextView lbl;
    RadioGroup O23;
    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
            switch (paramAnonymousRadioGroup.getId()) {
                case R.id.rdgO23:
                    Answers.setO23(O23.indexOfChild(O23.findViewById(O23.getCheckedRadioButtonId())) + "");

            }
        }
    };

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        O23 = ((RadioGroup) paramView.findViewById(R.id.rdgO23));
        lbl = ((TextView) paramView.findViewById(R.id.lblO23));
    }

    private void listeners() {
        O23.setOnCheckedChangeListener(changeListener);
    }

    private void savePageData() {
        Answers.setO23(O23.indexOfChild(O23.findViewById(O23.getCheckedRadioButtonId())) + "");
    }

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_o8, container, false);
        initViews(v);
        fonting();
        listeners();
        savePageData();
        return v;
    }

    public void setUserVisibleHint(boolean paramBoolean) {

        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();
        } catch (NullPointerException e) {
        }
    }


}
