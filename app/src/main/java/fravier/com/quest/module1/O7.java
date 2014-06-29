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


public class O7 extends Fragment {
    RadioGroup O22;
    Context ctx;
    TextView lbl;

    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
            switch (paramAnonymousRadioGroup.getId()) {
                case R.id.rdgO22:
                    Answers.setO22(O22.indexOfChild(O22.findViewById(O22.getCheckedRadioButtonId())) + "");
                    break;
            }

        }
    };


    private void initViews(View paramView) {
        O22 = ((RadioGroup) paramView.findViewById(R.id.rdgO22));
        lbl = ((TextView) paramView.findViewById(R.id.lblO22));
    }

    private void listeners() {
        O22.setOnCheckedChangeListener(changeListener);
    }

    private void savePageData() {
        Answers.setO22(O22.indexOfChild(O22.findViewById(O22.getCheckedRadioButtonId())) + "");
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
        View v = inflater.inflate(R.layout.fragment_o7, container, false);
        initViews(v);
        listeners();
        fonting();
        savePageData();
        return v;
    }

    public void onResume() {
        savePageData();
        super.onResume();
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {
        }
    }

}
