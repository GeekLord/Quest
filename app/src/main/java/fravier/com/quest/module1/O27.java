package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O27 extends Fragment {
    RadioGroup O53;
    RadioGroup O54;
    Context ctx;
    TextView lbl;
    EditText others;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        O53 = ((RadioGroup) paramView.findViewById(R.id.rdgO53));
        O54 = ((RadioGroup) paramView.findViewById(R.id.rdgO54));
        lbl = ((TextView) paramView.findViewById(R.id.lblO53));
        others = (EditText) paramView.findViewById(R.id.rdgO54g);
    }

    private void listeners() {
        O53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                savePageData();
            }
        });
        others.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                savePageData();
            }

            @Override
            public void afterTextChanged(Editable s) {
                savePageData();
            }
        });
        O54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = O54.indexOfChild(O54.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 5) {
                    others.setVisibility(View.VISIBLE);
                    OthersMap.setO54(1);
                    savePageData();
                    return;
                } else {
                    others.setVisibility(View.GONE);
                    OthersMap.setO54(0);
                    savePageData();
                }


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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o27, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }


    public void savePageData() {
        Answers.setO53(O53.indexOfChild(O53.findViewById(O53.getCheckedRadioButtonId())) + "");
        if (O54.indexOfChild(O54.findViewById(O54.getCheckedRadioButtonId())) == 5) {
            Answers.setO54(others.getText().toString());
        } else {
            Answers.setO54(O54.indexOfChild(O54.findViewById(O54.getCheckedRadioButtonId())) + "");

        }
    }
}
