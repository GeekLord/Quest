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
import android.widget.Toast;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O3a extends Fragment {

    RadioGroup O12;
    RadioGroup O13;
    EditText O14;
    EditText O15;
    EditText txtO12;
    Context ctx;
    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup group, int selected) {
            switch (group.getId()) {
                case R.id.rdgO12:
                    int i = O12.indexOfChild(O12.findViewById(selected));
                    if (i == 4) {
                        txtO12.setVisibility(View.VISIBLE);
                    } else {
                        txtO12.setVisibility(View.GONE);
                    }

                    Answers.setO12(O12.indexOfChild(O12.findViewById(O12.getCheckedRadioButtonId())) + "");

            }
            Answers.setO13(O13.indexOfChild(O13.findViewById(O13.getCheckedRadioButtonId())) + "");
        }
    };

    private void initViews(View v) {
        O14 = ((EditText) v.findViewById(R.id.txtO14));
        O15 = ((EditText) v.findViewById(R.id.txtO15));
        O12 = ((RadioGroup) v.findViewById(R.id.rdgO12));
        O13 = ((RadioGroup) v.findViewById(R.id.rdgO13));
        txtO12 = ((EditText) v.findViewById(R.id.rdgO12f));
    }

    private void listeners() {
        O12.setOnCheckedChangeListener(changeListener);
        O13.setOnCheckedChangeListener(changeListener);
        O14.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    int years = Integer.parseInt(O14.getText().toString().trim());
                    if (years > 18) {
                        Toast.makeText(ctx, "The maximum age for a child that can be recorded is 18", Toast.LENGTH_SHORT).show();
                        O14.setText("");
                    }
                } catch (NumberFormatException e) {

                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    int years = Integer.parseInt(O14.getText().toString().trim());
                    if (years > 18) {
                        Toast.makeText(ctx, "The maximum age for a child that can be recorded is 18", Toast.LENGTH_SHORT).show();
                        O14.setText("");
                    }
                } catch (NumberFormatException e) {

                }


            }
        });

    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) O12.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void savePageData() {
        Answers.setO14(O14.getText().toString().trim());
        Answers.setO15(O15.getText().toString().trim());
        if (O12.indexOfChild(O12.findViewById(O12.getCheckedRadioButtonId())) == 2) {
            Answers.setO12(txtO12.getText().toString());
        }
        Answers.setO13(O13.indexOfChild(O13.findViewById(O13.getCheckedRadioButtonId())) + "");
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
        View v = inflater.inflate(R.layout.fragment_o3a, container, false);
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
