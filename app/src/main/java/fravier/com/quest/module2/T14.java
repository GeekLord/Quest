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


public class T14 extends Fragment {
    RadioGroup T91;
    RadioGroup T92a;
    Context ctx;
    TextView lbl;
    EditText txtT91;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T91 = ((RadioGroup) paramView.findViewById(R.id.rdgT91));
        T92a = ((RadioGroup) paramView.findViewById(R.id.rdgT92a));
        txtT91 = ((EditText) paramView.findViewById(R.id.rdgT91i));
        lbl = ((TextView) paramView.findViewById(R.id.lblT91));
    }

    private void listeners() {
        T91.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T91.indexOfChild(T91.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 8) {
                    txtT91.setVisibility(View.VISIBLE);
                    return;
                }
                txtT91.setVisibility(View.GONE);
                Answers.setT91(T91.indexOfChild(T91.findViewById(T91.getCheckedRadioButtonId())) + "");
            }
        });
        T92a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t14, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();

        super.onResume();
    }

    public void savePageData() {
        if (T91.indexOfChild(T91.findViewById(T91.getCheckedRadioButtonId())) == 8) {
            Answers.setT91(txtT91.getText().toString());
        }
        Answers.setT92a(T92a.indexOfChild(T92a.findViewById(T92a.getCheckedRadioButtonId())) + "");
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }
}
