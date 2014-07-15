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
    CheckBox O69z;
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
        O69z = ((CheckBox) paramView.findViewById(R.id.rdgO69z));
        txtO69j = ((EditText) paramView.findViewById(R.id.rdgO69j));
        lbl = ((TextView) paramView.findViewById(R.id.lblO68));
    }

    private void listeners() {
        txtO67k.addTextChangedListener(new TextWatcher() {
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
        txtO68g.addTextChangedListener(new TextWatcher() {
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
        txtO69j.addTextChangedListener(new TextWatcher() {
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
        O67i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    O67a.setEnabled(false);
                    O67b.setEnabled(false);
                    O67c.setEnabled(false);
                    O67d.setEnabled(false);
                    O67e.setEnabled(false);
                    O67f.setEnabled(false);
                    O67g.setEnabled(false);
                    O67h.setEnabled(false);
                    O67j.setEnabled(false);


                    O67a.setChecked(false);
                    O67b.setChecked(false);
                    O67c.setChecked(false);
                    O67d.setChecked(false);
                    O67e.setChecked(false);
                    O67f.setChecked(false);
                    O67g.setChecked(false);
                    O67h.setChecked(false);
                    O67j.setChecked(false);

                    return;
                } else {
                    O67a.setEnabled(true);
                    O67b.setEnabled(true);
                    O67c.setEnabled(true);
                    O67d.setEnabled(true);
                    O67e.setEnabled(true);
                    O67f.setEnabled(true);
                    O67g.setEnabled(true);
                    O67h.setEnabled(true);
                    O67j.setEnabled(true);

                }

            }
        });
        O69h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    O69a.setEnabled(false);
                    O69b.setEnabled(false);
                    O69c.setEnabled(false);
                    O69d.setEnabled(false);
                    O69e.setEnabled(false);
                    O69f.setEnabled(false);
                    O69g.setEnabled(false);
                    O69i.setEnabled(false);
                    O69z.setEnabled(false);


                    O69a.setChecked(false);
                    O69b.setChecked(false);
                    O69c.setChecked(false);
                    O69d.setChecked(false);
                    O69e.setChecked(false);
                    O69f.setChecked(false);
                    O69g.setChecked(false);
                    O69i.setChecked(false);
                    O69z.setChecked(false);

                    return;
                } else {
                    O69a.setEnabled(true);
                    O69b.setEnabled(true);
                    O69c.setEnabled(true);
                    O69d.setEnabled(true);
                    O69e.setEnabled(true);
                    O69f.setEnabled(true);
                    O69g.setEnabled(true);
                    O69i.setEnabled(true);
                    O69z.setEnabled(true);

                }

            }
        });
        O68e.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    O68a.setEnabled(false);
                    O68b.setEnabled(false);
                    O68c.setEnabled(false);
                    O68d.setEnabled(false);

                    O68f.setEnabled(false);


                    O68a.setChecked(false);
                    O68b.setChecked(false);
                    O68c.setChecked(false);
                    O68d.setChecked(false);

                    O68f.setChecked(false);

                    return;
                } else {
                    O68a.setEnabled(true);
                    O68b.setEnabled(true);
                    O68c.setEnabled(true);
                    O68d.setEnabled(true);

                    O68f.setEnabled(true);

                }

            }
        });


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
            str = str + O67f.getText().toString().trim() + " ";
        }
        if (O67g.isChecked()) {
            str = str + O67g.getText().toString().trim() + " ";
        }
        if (O67h.isChecked()) {
            str = str + O67h.getText().toString().trim() + " ";
        }
        if (O67i.isChecked()) {
            str = str + O67i.getText().toString().trim() + " ";
        }
        if (O67j.isChecked()) {
            str = str + txtO67k.getText().toString().trim() + " ";
            if (txtO67k.getText().toString().trim().length() == 0) {
                OthersMap.setO67(2);
            } else {
                OthersMap.setO67(1);
            }
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
            if (txtO68g.getText().toString().trim().length() == 0) {
                OthersMap.setO68(2);
            } else {
                OthersMap.setO68(1);
            }
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
            str = str + O69f.getText().toString().trim() + " ";
        }
        if (O69g.isChecked()) {
            str = str + O69g.getText().toString().trim() + " ";
        }
        if (O69h.isChecked()) {
            str = str + O69h.getText().toString().trim() + " ";
        }
        if (O69z.isChecked()) {
            str = str + O69z.getText().toString().trim() + " ";
        }
        if (O69i.isChecked()) {

            str = str + txtO69j.getText().toString().trim() + " ";
            if (txtO69j.getText().toString().trim().length() == 0) {
                OthersMap.setO69(2);
            } else {
                OthersMap.setO69(1);
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
                    OthersMap.setO67(1);
                    savePageData();
                    return;
                } else {
                    txtO67k.setVisibility(View.GONE);
                    OthersMap.setO67(0);
                    savePageData();
                }

            }
        });
        O68f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO68g.setVisibility(View.VISIBLE);
                    OthersMap.setO68(1);
                    savePageData();
                    return;
                } else {
                    txtO68g.setVisibility(View.GONE);
                    OthersMap.setO68(0);
                    savePageData();
                }

            }
        });
        O69i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtO69j.setVisibility(View.VISIBLE);
                    OthersMap.setO69(1);
                    savePageData();
                    return;
                } else {
                    txtO69j.setVisibility(View.GONE);
                    OthersMap.setO69(0);
                    savePageData();
                }

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
