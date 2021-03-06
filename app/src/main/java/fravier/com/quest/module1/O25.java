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


public class O25 extends Fragment {
    CheckBox O66a;
    CheckBox O66b;
    CheckBox O66c;
    CheckBox O66d;
    CheckBox O66e;
    CheckBox O66f;
    Context ctx;
    TextView lbl;
    EditText txtO66g;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        O66a = ((CheckBox) paramView.findViewById(R.id.rdgO66a));
        O66b = ((CheckBox) paramView.findViewById(R.id.rdgO66b));
        O66c = ((CheckBox) paramView.findViewById(R.id.rdgO66c));
        O66d = ((CheckBox) paramView.findViewById(R.id.rdgO66d));
        O66e = ((CheckBox) paramView.findViewById(R.id.rdgO66e));
        O66f = ((CheckBox) paramView.findViewById(R.id.rdgO66f));
        txtO66g = ((EditText) paramView.findViewById(R.id.rdgO66g));
        lbl = ((TextView) paramView.findViewById(R.id.lblO66));
    }

    private void listeners() {
        O66f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO66g.setVisibility(View.VISIBLE);
                    OthersMap.setO66(1);
                    savePageData();
                    return;
                } else {
                    txtO66g.setVisibility(View.GONE);
                    OthersMap.setO66(0);
                    savePageData();
                }

            }
        });
        O66e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    O66a.setEnabled(false);
                    O66b.setEnabled(false);
                    O66c.setEnabled(false);
                    O66d.setEnabled(false);

                    O66f.setEnabled(false);

                    O66a.setChecked(false);
                    O66b.setChecked(false);
                    O66c.setChecked(false);
                    O66d.setChecked(false);

                    O66f.setChecked(false);

                    return;
                } else {
                    O66a.setEnabled(true);
                    O66b.setEnabled(true);
                    O66c.setEnabled(true);
                    O66d.setEnabled(true);

                    O66f.setEnabled(true);

                }

            }
        });

        txtO66g.addTextChangedListener(new TextWatcher() {
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

    public String getCheckedStuff() {
        String str = "";
        if (O66a.isChecked()) {
            str = str + "1 ";
        }
        if (O66b.isChecked()) {
            str = str + "2 ";
        }
        if (O66c.isChecked()) {
            str = str + "3 ";
        }
        if (O66d.isChecked()) {
            str = str + "4 ";
        }
        if (O66e.isChecked()) {
            str = str + "5 ";
        }
        if (O66f.isChecked()) {

            str = str + txtO66g.getText().toString().trim() + " ";
            if (txtO66g.getText().toString().trim().length() == 0) {
                OthersMap.setO66(2);
            } else {
                OthersMap.setO66(1);
            }
        }
        return str;
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o25, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }


    public void savePageData() {
        Answers.setO66(getCheckedStuff());
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        System.out.println("this is the on visible hint" + paramBoolean);
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();
        } catch (NullPointerException e) {

        }
    }
}
