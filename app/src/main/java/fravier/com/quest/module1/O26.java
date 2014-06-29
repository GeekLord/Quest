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


public class O26 extends Fragment {
    CheckBox O67a;
    CheckBox O67b;
    CheckBox O67c;
    CheckBox O67d;
    CheckBox O67e;
    CheckBox O67f;
    CheckBox O67g;
    CheckBox O67h;
    CheckBox O67i;
    CheckBox O67j;
    CheckBox O68a;
    CheckBox O68b;
    CheckBox O68c;
    CheckBox O68d;
    CheckBox O68e;
    CheckBox O68f;
    CheckBox O69a;
    CheckBox O69b;
    CheckBox O69c;
    CheckBox O69d;
    CheckBox O69e;
    CheckBox O69f;
    CheckBox O69g;
    CheckBox O69h;
    CheckBox O69i;
    Context ctx;
    TextView lbl;
    EditText txtO67k;
    EditText txtO68g;
    EditText txtO69j;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        O67a = ((CheckBox) paramView.findViewById(R.id.rdgO67a));
        O67b = ((CheckBox) paramView.findViewById(R.id.rdgO67b));
        O67c = ((CheckBox) paramView.findViewById(R.id.rdgO67c));
        O67d = ((CheckBox) paramView.findViewById(R.id.rdgO67d));
        O67e = ((CheckBox) paramView.findViewById(R.id.rdgO67e));
        O67f = ((CheckBox) paramView.findViewById(R.id.rdgO67f));
        O67g = ((CheckBox) paramView.findViewById(R.id.rdgO67g));
        O67h = ((CheckBox) paramView.findViewById(R.id.rdgO67h));
        O67i = ((CheckBox) paramView.findViewById(R.id.rdgO67i));
        O67j = ((CheckBox) paramView.findViewById(R.id.rdgO67j));
        txtO67k = ((EditText) paramView.findViewById(R.id.rdgO67k));
        O68a = ((CheckBox) paramView.findViewById(R.id.rdgO68a));
        O68b = ((CheckBox) paramView.findViewById(R.id.rdgO68b));
        O68c = ((CheckBox) paramView.findViewById(R.id.rdgO68c));
        O68d = ((CheckBox) paramView.findViewById(R.id.rdgO68d));
        O68e = ((CheckBox) paramView.findViewById(R.id.rdgO68e));
        O68f = ((CheckBox) paramView.findViewById(R.id.rdgO68f));
        txtO68g = ((EditText) paramView.findViewById(R.id.rdgO68g));
        O69a = ((CheckBox) paramView.findViewById(R.id.rdgO69a));
        O69b = ((CheckBox) paramView.findViewById(R.id.rdgO69b));
        O69c = ((CheckBox) paramView.findViewById(R.id.rdgO69c));
        O69d = ((CheckBox) paramView.findViewById(R.id.rdgO69d));
        O69e = ((CheckBox) paramView.findViewById(R.id.rdgO69e));
        O69f = ((CheckBox) paramView.findViewById(R.id.rdgO69f));
        O69g = ((CheckBox) paramView.findViewById(R.id.rdgO69g));
        O69h = ((CheckBox) paramView.findViewById(R.id.rdgO69h));
        O69i = ((CheckBox) paramView.findViewById(R.id.rdgO69i));
        txtO69j = ((EditText) paramView.findViewById(R.id.rdgO69j));
        lbl = ((TextView) paramView.findViewById(R.id.lblO68));
    }

    private void listeners() {
    }

    public String getCheckedStuff67() {
        String str = "";
        if (O67a.isChecked()) {
            str = str + O67a.getText().toString().trim() + " ";
        }
        if (O67b.isChecked()) {
            str = str + O67b.getText().toString().trim() + " ";
        }
        if (O67c.isChecked()) {
            str = str + O67c.getText().toString().trim() + " ";
        }
        if (O67d.isChecked()) {
            str = str + O67d.getText().toString().trim() + " ";
        }
        if (O67e.isChecked()) {
            str = str + O67e.getText().toString().trim() + " ";
        }
        if (O67f.isChecked()) {
            str = str + O67e.getText().toString().trim() + " ";
        }
        if (O67g.isChecked()) {
            str = str + O67e.getText().toString().trim() + " ";
        }
        if (O67h.isChecked()) {
            str = str + O67e.getText().toString().trim() + " ";
        }
        if (O67i.isChecked()) {
            str = str + O67e.getText().toString().trim() + " ";
        }
        if (O67j.isChecked()) {
            str = str + txtO67k.getText().toString().trim() + " ";
        }
        return str;
    }

    public String getCheckedStuff68() {
        String str = "";
        if (O68a.isChecked()) {
            str = str + O68a.getText().toString().trim() + " ";
        }
        if (O68b.isChecked()) {
            str = str + O68b.getText().toString().trim() + " ";
        }
        if (O68c.isChecked()) {
            str = str + O68c.getText().toString().trim() + " ";
        }
        if (O68d.isChecked()) {
            str = str + O68d.getText().toString().trim() + " ";
        }
        if (O68e.isChecked()) {
            str = str + O68d.getText().toString().trim() + " ";
        }
        if (O68f.isChecked()) {

            str = str + txtO68g.getText().toString().trim() + " ";
        }

        return str;
    }

    public String getCheckedStuff69() {
        String str = "";
        if (O69a.isChecked()) {
            str = str + O69a.getText().toString().trim() + " ";
        }
        if (O69b.isChecked()) {
            str = str + O69b.getText().toString().trim() + " ";
        }
        if (O69c.isChecked()) {
            str = str + O69c.getText().toString().trim() + " ";
        }
        if (O69d.isChecked()) {
            str = str + O69d.getText().toString().trim() + " ";
        }
        if (O69e.isChecked()) {
            str = str + O69e.getText().toString().trim() + " ";
        }
        if (O69f.isChecked()) {
            str = str + O69e.getText().toString().trim() + " ";
        }
        if (O69g.isChecked()) {
            str = str + O69e.getText().toString().trim() + " ";
        }
        if (O69h.isChecked()) {
            str = str + O69e.getText().toString().trim() + " ";
        }
        if (O69i.isChecked()) {

            str = str + txtO69j.getText().toString().trim() + " ";
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o26, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();
        O67j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO67k.setVisibility(View.VISIBLE);
                    return;
                }
                txtO67k.setVisibility(View.GONE);
            }
        });
        O68f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO68g.setVisibility(View.VISIBLE);
                    return;
                }
                txtO68g.setVisibility(View.GONE);
            }
        });
        O69i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO69j.setVisibility(View.VISIBLE);
                    return;
                }
                txtO69j.setVisibility(View.GONE);
            }
        });
        super.onResume();
    }

    public void savePageData() {
        Answers.setO67(getCheckedStuff67());
        Answers.setO68(getCheckedStuff68());
        Answers.setO69(getCheckedStuff69());
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }
}
