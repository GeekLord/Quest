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


public class O9a extends Fragment {
    RadioGroup O25;
    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
            switch (paramAnonymousRadioGroup.getId()) {
                case R.id.rdgO25:

                    int i = O25.indexOfChild(O25.findViewById(paramAnonymousInt));
                    System.out.println(i);
                    if (i == 10) {
                        txtO25.setVisibility(View.VISIBLE);
                        OthersMap.setO25(1);
                        savePageData();
                        return;
                    } else {
                        txtO25.setVisibility(View.GONE);
                        OthersMap.setO25(0);
                        savePageData();
                    }
                    break;
            }
            // Answers.setO25(O25.indexOfChild(O25.findViewById(O25.getCheckedRadioButtonId())) + "");
        }
    };
    Context ctx;
    TextView lbl;
    EditText txtO25;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        O25 = ((RadioGroup) paramView.findViewById(R.id.rdgO25));
        lbl = ((TextView) paramView.findViewById(R.id.lblO25));
        txtO25 = ((EditText) paramView.findViewById(R.id.rdgO25l));
    }

    private void listeners() {
        O25.setOnCheckedChangeListener(changeListener);
        txtO25.addTextChangedListener(new TextWatcher() {
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
    }

    private void savePageData() {
        if (O25.indexOfChild(O25.findViewById(O25.getCheckedRadioButtonId())) == 10) {
            Answers.setO25(txtO25.getText().toString());
        }
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
        View v = inflater.inflate(R.layout.fragment_o9a, container, false);
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
