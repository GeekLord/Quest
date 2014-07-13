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
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O9a extends Fragment {
    CheckBox O25a;
    CheckBox O25b;
    CheckBox O25c;
    CheckBox O25d;
    CheckBox O25e;
    CheckBox O25f;
    CheckBox O25g;
    CheckBox O25h;
    CheckBox O25i;
    CheckBox O25j;
    CheckBox O25k;


    Context ctx;
    TextView lbl;
    EditText txtO25;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    public String getCheckedStuff25() {
        String str = "";
        if (O25a.isChecked()) {
            str = str + O25a.getText().toString().trim() + " ";
        }
        if (O25b.isChecked()) {
            str = str + O25b.getText().toString().trim() + " ";
        }
        if (O25c.isChecked()) {
            str = str + O25c.getText().toString().trim() + " ";
        }
        if (O25d.isChecked()) {
            str = str + O25d.getText().toString().trim() + " ";
        }
        if (O25e.isChecked()) {
            str = str + O25e.getText().toString().trim() + " ";
        }
        if (O25f.isChecked()) {
            str = str + O25f.getText().toString().trim() + " ";
        }
        if (O25g.isChecked()) {
            str = str + O25g.getText().toString().trim() + " ";
        }
        if (O25h.isChecked()) {
            str = str + O25h.getText().toString().trim() + " ";
        }
        if (O25i.isChecked()) {
            str = str + O25i.getText().toString().trim() + " ";
        }
        if (O25j.isChecked()) {
            str = str + O25j.getText().toString().trim() + " ";
        }
        if (O25k.isChecked()) {
            str = str + txtO25.getText().toString().trim() + " ";
            if (txtO25.getText().toString().trim().length() == 0) {
                OthersMap.setO25(2);
            } else {
                OthersMap.setO25(1);
            }
        }
        return str;
    }

    private void initViews(View paramView) {
        O25a = ((CheckBox) paramView.findViewById(R.id.rdgO25a));
        O25b = ((CheckBox) paramView.findViewById(R.id.rdgO25b));
        O25c = ((CheckBox) paramView.findViewById(R.id.rdgO25c));
        O25d = ((CheckBox) paramView.findViewById(R.id.rdgO25d));
        O25e = ((CheckBox) paramView.findViewById(R.id.rdgO25e));
        O25f = ((CheckBox) paramView.findViewById(R.id.rdgO25f));
        O25g = ((CheckBox) paramView.findViewById(R.id.rdgO25g));
        O25h = ((CheckBox) paramView.findViewById(R.id.rdgO25h));
        O25i = ((CheckBox) paramView.findViewById(R.id.rdgO25i));
        O25j = ((CheckBox) paramView.findViewById(R.id.rdgO25j));
        O25k = ((CheckBox) paramView.findViewById(R.id.rdgO25k));

        lbl = ((TextView) paramView.findViewById(R.id.lblO25));
        txtO25 = ((EditText) paramView.findViewById(R.id.rdgO25l));
    }

    private void listeners() {
        O25k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO25.setVisibility(View.VISIBLE);
                    OthersMap.setO25(1);
                    savePageData();
                    return;
                } else {
                    txtO25.setVisibility(View.GONE);
                    OthersMap.setO25(0);
                    savePageData();
                }

            }
        });
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
        Answers.setO25(getCheckedStuff25());
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
