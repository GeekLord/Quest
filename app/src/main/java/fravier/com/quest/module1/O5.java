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

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O5 extends Fragment {
    Context ctx;
    EditText txtO111;
    RadioGroup O111;
    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
            switch (paramAnonymousRadioGroup.getId()) {
                case R.id.rdgO111:
                    int i = O111.indexOfChild(O111.findViewById(paramAnonymousInt));
                    System.out.println(i);
                    if (i == 17) {
                        txtO111.setVisibility(View.VISIBLE);
                        OthersMap.setO111(1);
                        savePageData();

                    } else {
                        txtO111.setVisibility(View.GONE);
                        OthersMap.setO111(0);
                        savePageData();
                    }

                    // Answers.setO111(O111.indexOfChild(O111.findViewById(O111.getCheckedRadioButtonId())) + "");
            }
        }


    };


    private void initViews(View paramView) {
        O111 = ((RadioGroup) paramView.findViewById(R.id.rdgO111));
        txtO111 = ((EditText) paramView.findViewById(R.id.rdgO111o));
    }

    private void listeners() {
        O111.setOnCheckedChangeListener(changeListener);
        txtO111.addTextChangedListener(new TextWatcher() {
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
        Answers.setO111(O111.indexOfChild(O111.findViewById(O111.getCheckedRadioButtonId())) + "");
        if (O111.indexOfChild(O111.findViewById(O111.getCheckedRadioButtonId())) == 17) {
            Answers.setO111(txtO111.getText().toString());
        }
    }


    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) O111.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_o5, container, false);
        initViews(v);
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
