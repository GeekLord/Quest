package fravier.com.quest.module1;

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


public class O22 extends Fragment {
    RadioGroup O52;
    Context ctx;
    TextView lbl;
    EditText txtO52;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        O52 = ((RadioGroup) paramView.findViewById(R.id.rdgO52));
        lbl = ((TextView) paramView.findViewById(R.id.lblO52a));
        txtO52 = ((EditText) paramView.findViewById(R.id.rdgO52d));
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o22, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();
        O52.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = O52.indexOfChild(O52.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 2) {
                    txtO52.setVisibility(View.VISIBLE);
                    return;
                }
                txtO52.setVisibility(View.INVISIBLE);
                Answers.setO52(O52.indexOfChild(O52.findViewById(O52.getCheckedRadioButtonId())) + "");
            }
        });
        super.onResume();
    }

    public void savePageData() {
        if (O52.indexOfChild(O52.findViewById(O52.getCheckedRadioButtonId())) == 2) {
            Answers.setO52(txtO52.getText().toString());
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

