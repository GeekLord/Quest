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
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O10 extends Fragment {
    RadioGroup O28;
    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
            switch (paramAnonymousRadioGroup.getId()) {
                case R.id.rdgO28:
                    Answers.setO28(O28.indexOfChild(O28.findViewById(O28.getCheckedRadioButtonId())) + "");

                    break;
            }
        }
    };
    Context ctx;
    TextView lbl;
    CheckBox rdgO27a;
    CheckBox rdgO27b;
    CheckBox rdgO27c;
    CheckBox rdgO27d;
    CheckBox rdgO27e;
    CheckBox rdgO27f;
    CheckBox rdgO27g;
    EditText rdgO27h;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        O28 = ((RadioGroup) paramView.findViewById(R.id.rdgO28));
        rdgO27a = ((CheckBox) paramView.findViewById(R.id.rdgO27a));
        rdgO27b = ((CheckBox) paramView.findViewById(R.id.rdgO27b));
        rdgO27c = ((CheckBox) paramView.findViewById(R.id.rdgO27c));
        rdgO27d = ((CheckBox) paramView.findViewById(R.id.rdgO27d));
        rdgO27e = ((CheckBox) paramView.findViewById(R.id.rdgO27e));
        rdgO27f = ((CheckBox) paramView.findViewById(R.id.rdgO27f));
        rdgO27g = ((CheckBox) paramView.findViewById(R.id.rdgO27g));
        rdgO27h = ((EditText) paramView.findViewById(R.id.rdgO27h));
        rdgO27h.setVisibility(View.GONE);
        lbl = ((TextView) paramView.findViewById(R.id.lblO28));
    }

    private void listeners() {
        O28.setOnCheckedChangeListener(changeListener);
        rdgO27g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    rdgO27h.setVisibility(View.VISIBLE);
                    OthersMap.setO27(1);
                    savePageData();

                } else {
                    rdgO27h.setVisibility(View.GONE);
                    OthersMap.setO27(0);
                    savePageData();
                }

            }
        });
        rdgO27h.addTextChangedListener(new TextWatcher() {
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
        Answers.setO27(getCheckedStuff());
        Answers.setO28(O28.indexOfChild(O28.findViewById(O28.getCheckedRadioButtonId())) + "");
    }

    public String getCheckedStuff() {
        String str = "";
        if (rdgO27a.isChecked()) {
            str = str + rdgO27a.getText().toString().trim() + " ";
        }
        if (rdgO27b.isChecked()) {
            str = str + rdgO27b.getText().toString().trim() + " ";
        }
        if (rdgO27c.isChecked()) {
            str = str + rdgO27c.getText().toString().trim() + " ";
        }
        if (rdgO27d.isChecked()) {
            str = str + rdgO27d.getText().toString().trim() + " ";
        }
        if (rdgO27e.isChecked()) {
            str = str + rdgO27e.getText().toString().trim() + " ";
        }
        if (rdgO27f.isChecked()) {
            str = str + rdgO27f.getText().toString().trim() + " ";
        }
        if (rdgO27g.isChecked()) {
            rdgO27h.setVisibility(View.VISIBLE);
            str = str + rdgO27h.getText().toString().trim() + " ";
            if (rdgO27h.getText().toString().trim().length() == 0) {
                OthersMap.setO27(2);
            } else {
                OthersMap.setO27(1);
            }
        }

        // rdgO27h.setVisibility(View.GONE);
        return str;
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
        View v = inflater.inflate(R.layout.fragment_o10, container, false);
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