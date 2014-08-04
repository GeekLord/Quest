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
import android.widget.Toast;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
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
                    OthersMap.setO61(1);
                    savePageData();
                    return;
                } else {
                    txtO61l.setVisibility(View.GONE);
                    OthersMap.setO61(0);
                    savePageData();
                }

            }
        });
        O61i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    O61a.setEnabled(false);
                    O61b.setEnabled(false);
                    O61c.setEnabled(false);
                    O61d.setEnabled(false);
                    O61e.setEnabled(false);
                    O61f.setEnabled(false);
                    O61g.setEnabled(false);
                    O61h.setEnabled(false);
                    O61j.setEnabled(false);
                    O61k.setEnabled(false);

                    O61a.setChecked(false);
                    O61b.setChecked(false);
                    O61c.setChecked(false);
                    O61d.setChecked(false);
                    O61e.setChecked(false);
                    O61f.setChecked(false);
                    O61g.setChecked(false);
                    O61h.setChecked(false);
                    O61j.setChecked(false);
                    O61k.setChecked(false);
                    return;
                } else {
                    O61a.setEnabled(true);
                    O61b.setEnabled(true);
                    O61c.setEnabled(true);
                    O61d.setEnabled(true);
                    O61e.setEnabled(true);
                    O61f.setEnabled(true);
                    O61g.setEnabled(true);
                    O61h.setEnabled(true);
                    O61j.setEnabled(true);
                    O61k.setEnabled(true);
                }

            }
        });
        O61j.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    O61a.setEnabled(false);
                    O61b.setEnabled(false);
                    O61c.setEnabled(false);
                    O61d.setEnabled(false);
                    O61e.setEnabled(false);
                    O61f.setEnabled(false);
                    O61g.setEnabled(false);
                    O61h.setEnabled(false);
                    O61i.setEnabled(false);
                    O61k.setEnabled(false);

                    O61a.setChecked(false);
                    O61b.setChecked(false);
                    O61c.setChecked(false);
                    O61d.setChecked(false);
                    O61e.setChecked(false);
                    O61f.setChecked(false);
                    O61g.setChecked(false);
                    O61h.setChecked(false);
                    O61i.setChecked(false);
                    O61k.setChecked(false);
                    return;
                } else {
                    O61a.setEnabled(true);
                    O61b.setEnabled(true);
                    O61c.setEnabled(true);
                    O61d.setEnabled(true);
                    O61e.setEnabled(true);
                    O61f.setEnabled(true);
                    O61g.setEnabled(true);
                    O61h.setEnabled(true);
                    O61i.setEnabled(true);
                    O61k.setEnabled(true);
                }

            }
        });

        txtO61l.addTextChangedListener(new TextWatcher() {
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
        O64.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    int days = Integer.parseInt(O64.getText().toString().trim());
                    if (days > 7) {
                        Toast.makeText(ctx, "The maximum number of days that can be recorded is 7", Toast.LENGTH_SHORT).show();
                        O64.setText("");
                    }
                } catch (NumberFormatException e) {

                }
            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    int days = Integer.parseInt(O64.getText().toString().trim());
                    if (days > 7) {
                        Toast.makeText(ctx, "The maximum number of days that can be recorded is 7", Toast.LENGTH_SHORT).show();
                        O64.setText("");
                    }
                } catch (NumberFormatException e) {

                }


            }
        });
    }

    public String getCheckedStuff() {
        String str = "";
        if (O61a.isChecked()) {
            str = str + "1 ";
        }
        if (O61b.isChecked()) {
            str = str + "2 ";
        }
        if (O61c.isChecked()) {
            str = str + "3 ";
        }
        if (O61d.isChecked()) {
            str = str + "4 ";
        }
        if (O61e.isChecked()) {
            str = str + "5 ";
        }
        if (O61f.isChecked()) {
            str = str + "6 ";
        }
        if (O61g.isChecked()) {
            str = str + "7 ";
        }
        if (O61h.isChecked()) {
            str = str + "8 ";
        }
        if (O61i.isChecked()) {
            str = str + "77 ";
        }
        if (O61j.isChecked()) {
            str = str + "99 ";
        }
        if (O61k.isChecked()) {
            txtO61l.setVisibility(View.VISIBLE);
            str = str + txtO61l.getText().toString().trim() + " ";
            if (txtO61l.getText().toString().trim().length() == 0) {
                OthersMap.setO61(2);
            } else {
                OthersMap.setO61(1);
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