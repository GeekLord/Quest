package fravier.com.quest.module2;

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
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class T10 extends Fragment {
    CheckBox T52a;
    CheckBox T52b;
    CheckBox T52c;
    CheckBox T52d;
    RadioGroup T53;
    RadioGroup T54;
    EditText T55;
    EditText T56;
    Context ctx;
    TextView lbl;
    EditText txtT52e;
    EditText txtT54d;
    LinearLayout view54, view55, view56;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T52a = ((CheckBox) paramView.findViewById(R.id.rdgT52a));
        T52b = ((CheckBox) paramView.findViewById(R.id.rdgT52b));
        T52c = ((CheckBox) paramView.findViewById(R.id.rdgT52c));
        T52d = ((CheckBox) paramView.findViewById(R.id.rdgT52d));

        txtT52e = ((EditText) paramView.findViewById(R.id.rdgT52e));
        T53 = ((RadioGroup) paramView.findViewById(R.id.rdgT53));
        T54 = ((RadioGroup) paramView.findViewById(R.id.rdgT54));
        T55 = ((EditText) paramView.findViewById(R.id.txtT55));
        T56 = ((EditText) paramView.findViewById(R.id.txtT56));
        txtT54d = ((EditText) paramView.findViewById(R.id.rdgT54d));
        lbl = ((TextView) paramView.findViewById(R.id.lblT52));

        view54 = (LinearLayout) paramView.findViewById(R.id.view54);
        view55 = (LinearLayout) paramView.findViewById(R.id.view55);
        view56 = (LinearLayout) paramView.findViewById(R.id.view56);
    }

    private void listeners() {

        txtT52e.addTextChangedListener(new TextWatcher() {
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
        txtT54d.addTextChangedListener(new TextWatcher() {
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
        T52d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtT52e.setVisibility(View.VISIBLE);
                    OthersMap.setT52(1);
                    savePageData();
                    return;
                } else {
                    txtT52e.setVisibility(View.GONE);
                    OthersMap.setT52(0);
                }

            }
        });
        T53.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T53.indexOfChild(T53.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 0) {
                    view54.setVisibility(View.VISIBLE);
                    view55.setVisibility(View.VISIBLE);
                    view56.setVisibility(View.VISIBLE);
                    savePageData();
                    return;
                } else {
                    view54.setVisibility(View.GONE);
                    view55.setVisibility(View.GONE);
                    view56.setVisibility(View.GONE);
                    savePageData();
                }

            }
        });
        T54.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T54.indexOfChild(T54.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 2) {
                    txtT54d.setVisibility(View.VISIBLE);
                    OthersMap.setT54(1);
                    return;
                } else {
                    txtT54d.setVisibility(View.GONE);
                    OthersMap.setT54(0);
                }

                //Answers.setT54(T54.indexOfChild(T54.findViewById(T54.getCheckedRadioButtonId())) + "");
            }
        });

    }

    public String getCheckedStuff68() {
        String str = "";
        if (T52a.isChecked()) {
            str = str + T52a.getText().toString().trim() + " ";
        }
        if (T52b.isChecked()) {
            str = str + T52b.getText().toString().trim() + " ";
        }
        if (T52c.isChecked()) {
            str = str + T52c.getText().toString().trim() + " ";
        }
        if (T52d.isChecked()) {

            str = str + txtT52e.getText().toString().trim() + " ";
            if (txtT52e.getText().toString().trim().length() == 0) {
                OthersMap.setT52(2);
            } else {
                OthersMap.setT52(1);
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t10, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }


    public void savePageData() {
        Answers.setT52(getCheckedStuff68());
        Answers.setT53(T53.indexOfChild(T53.findViewById(T53.getCheckedRadioButtonId())) + "");

        if (T53.indexOfChild(T53.findViewById(T53.getCheckedRadioButtonId())) == 0) {
            if (T54.indexOfChild(T54.findViewById(T54.getCheckedRadioButtonId())) == 2) {
                Answers.setT54(txtT54d.getText().toString());
            }
            Answers.setT55(T55.getText().toString().trim());
            Answers.setT56(T56.getText().toString().trim());
        } else {
            Answers.setT54("");
            Answers.setT55("");
            Answers.setT56("");
        }

    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }
}

