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


public class O9b extends Fragment {
    RadioGroup O26;
    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
            switch (paramAnonymousRadioGroup.getId()) {
                case R.id.rdgO26:
                    Answers.setO26(O26.indexOfChild(O26.findViewById(O26.getCheckedRadioButtonId())) + "");

                    break;
            }
        }
    };
    Context ctx;
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        O26 = ((RadioGroup) paramView.findViewById(R.id.rdgO26));
        lbl = ((TextView) paramView.findViewById(R.id.lblO26));
    }

    private void listeners() {
        O26.setOnCheckedChangeListener(changeListener);
    }

    private void savePageData() {
        Answers.setO26(O26.indexOfChild(O26.findViewById(O26.getCheckedRadioButtonId())) + "");
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
        View v = inflater.inflate(R.layout.fragment_o9b, container, false);
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
