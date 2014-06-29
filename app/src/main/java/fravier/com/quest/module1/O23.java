package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O23 extends Fragment {
    CheckBox O61a;
    CheckBox O61b;
    CheckBox O61c;
    CheckBox O61d;
    CheckBox O61e;
    CheckBox O61f;
    CheckBox O61g;
    CheckBox O61h;
    CheckBox O61i;
    CheckBox O61j;
    CheckBox O61k;
    EditText O62;
    EditText O63;
    EditText O64;
    Context ctx;
    TextView lbl;
    EditText txtO61l;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        O61a = ((CheckBox) paramView.findViewById(R.id.rdgO61a));
        O61b = ((CheckBox) paramView.findViewById(R.id.rdgO61b));
        O61c = ((CheckBox) paramView.findViewById(R.id.rdgO61c));
        O61d = ((CheckBox) paramView.findViewById(R.id.rdgO61d));
        O61e = ((CheckBox) paramView.findViewById(R.id.rdgO61e));
        O61f = ((CheckBox) paramView.findViewById(R.id.rdgO61f));
        O61g = ((CheckBox) paramView.findViewById(R.id.rdgO61g));
        O61h = ((CheckBox) paramView.findViewById(R.id.rdgO61h));
        O61i = ((CheckBox) paramView.findViewById(R.id.rdgO61i));
        O61j = ((CheckBox) paramView.findViewById(R.id.rdgO61j));
        O61k = ((CheckBox) paramView.findViewById(R.id.rdgO61k));
        txtO61l = ((EditText) paramView.findViewById(R.id.rdgO61l));
        lbl = ((TextView) paramView.findViewById(R.id.lblO61a));
        O62 = ((EditText) paramView.findViewById(R.id.txtO62));
        O63 = ((EditText) paramView.findViewById(R.id.txtO63));
        O64 = ((EditText) paramView.findViewById(R.id.txtO64));
    }

    private void listeners() {
        O61k.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO61l.setVisibility(View.VISIBLE);
                    return;
                } else {
                    txtO61l.setVisibility(View.GONE);
                }

            }
        });
    }

    public String getCheckedStuff() {
        String str = "";
        if (O61a.isChecked()) {
            str = str + O61a.getText().toString().trim() + " ";
        }
        if (O61b.isChecked()) {
            str = str + O61b.getText().toString().trim() + " ";
        }
        if (O61c.isChecked()) {
            str = str + O61c.getText().toString().trim() + " ";
        }
        if (O61d.isChecked()) {
            str = str + O61d.getText().toString().trim() + " ";
        }
        if (O61e.isChecked()) {
            str = str + O61e.getText().toString().trim() + " ";
        }
        if (O61f.isChecked()) {
            str = str + O61f.getText().toString().trim() + " ";
        }
        if (O61g.isChecked()) {
            str = str + O61g.getText().toString().trim() + " ";
        }
        if (O61h.isChecked()) {
            str = str + O61h.getText().toString().trim() + " ";
        }
        if (O61i.isChecked()) {
            str = str + O61i.getText().toString().trim() + " ";
        }
        if (O61j.isChecked()) {
            str = str + O61j.getText().toString().trim() + " ";
        }
        if (O61k.isChecked()) {
            txtO61l.setVisibility(View.VISIBLE);
            str = str + txtO61l.getText().toString().trim() + " ";
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o23, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }


    public void savePageData() {
        Answers.setO61(getCheckedStuff());
        Answers.setO62(O62.getText().toString().trim());
        Answers.setO63(O63.getText().toString().trim());
        Answers.setO64(O64.getText().toString().trim());
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);

        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }
}