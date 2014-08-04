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
import android.widget.RadioGroup;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.fravier.com.results.OthersMap;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class T17 extends Fragment {
    RadioGroup T95;
    RadioGroup T96;
    CheckBox T97a;
    CheckBox T97b;
    CheckBox T97c;
    CheckBox T97d;
    CheckBox T97e;
    CheckBox T97f;
    CheckBox T97g;

    RadioGroup T98;
    RadioGroup T99;
    Context ctx;
    TextView lbl;
    EditText txtT95;
    EditText txtT96;
    EditText txtT97;
    EditText txtT98;
    EditText T99x, T99y, T99z;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initviews(View paramView) {
        T95 = ((RadioGroup) paramView.findViewById(R.id.rdgT95));
        T96 = ((RadioGroup) paramView.findViewById(R.id.rdgT96));

        T97a = ((CheckBox) paramView.findViewById(R.id.rdgT97a));
        T97b = ((CheckBox) paramView.findViewById(R.id.rdgT97b));
        T97c = ((CheckBox) paramView.findViewById(R.id.rdgT97c));
        T97d = ((CheckBox) paramView.findViewById(R.id.rdgT97d));
        T97e = ((CheckBox) paramView.findViewById(R.id.rdgT97e));
        T97f = ((CheckBox) paramView.findViewById(R.id.rdgT97f));
        T97g = ((CheckBox) paramView.findViewById(R.id.rdgT97g));


        T98 = ((RadioGroup) paramView.findViewById(R.id.rdgT98));
        T99 = ((RadioGroup) paramView.findViewById(R.id.rdgT99));
        txtT95 = ((EditText) paramView.findViewById(R.id.rdgT95i));
        txtT96 = ((EditText) paramView.findViewById(R.id.rdgT96g));
        txtT97 = ((EditText) paramView.findViewById(R.id.rdgT97h));
        txtT98 = ((EditText) paramView.findViewById(R.id.rdgT98f));
        lbl = ((TextView) paramView.findViewById(R.id.lblT95));
        T99x = (EditText) paramView.findViewById(R.id.T99x);
        T99y = (EditText) paramView.findViewById(R.id.T99y);
        T99z = (EditText) paramView.findViewById(R.id.T99z);

    }

    private void listeners() {
        T99x.addTextChangedListener(new TextWatcher() {
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
        T99y.addTextChangedListener(new TextWatcher() {
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
        T99z.addTextChangedListener(new TextWatcher() {
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
        txtT95.addTextChangedListener(new TextWatcher() {
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
        txtT96.addTextChangedListener(new TextWatcher() {
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
        txtT97.addTextChangedListener(new TextWatcher() {
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
        txtT98.addTextChangedListener(new TextWatcher() {
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

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t17, paramViewGroup, false);
        initviews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public String getCheckedStuff97() {
        String str = "";
        if (T97a.isChecked()) {
            str = str + "1 ";
        }
        if (T97b.isChecked()) {
            str = str + "2 ";
        }
        if (T97c.isChecked()) {
            str = str + "3 ";
        }
        if (T97d.isChecked()) {
            str = str + "4 ";
        }
        if (T97e.isChecked()) {
            str = str + "5 ";
        }
        if (T97f.isChecked()) {
            str = str + "6 ";
        }
        if (T97g.isChecked()) {

            str = str + txtT97.getText().toString().trim() + " ";
            if (txtT97.getText().toString().trim().length() == 0) {
                OthersMap.setT97(2);
            } else {
                OthersMap.setT97(1);
            }
        }

        return str;
    }


    public void onResume() {
        savePageData();
        T95.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T95.indexOfChild(T95.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 7) {
                    txtT95.setVisibility(View.VISIBLE);
                    OthersMap.setT95(1);
                    return;
                } else {
                    txtT95.setVisibility(View.GONE);
                    OthersMap.setT95(0);
                }

                // Answers.setT95(T95.indexOfChild(T95.findViewById(T95.getCheckedRadioButtonId())) + "");
            }
        });
        T96.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T96.indexOfChild(T96.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 5) {
                    txtT96.setVisibility(View.VISIBLE);
                    OthersMap.setT96(1);
                    return;
                } else {
                    txtT96.setVisibility(View.GONE);
                    OthersMap.setT96(0);
                }

                //Answers.setT96(T96.indexOfChild(T96.findViewById(T96.getCheckedRadioButtonId())) + "");
            }
        });


        T97g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean) {
                if (paramAnonymousBoolean) {
                    txtT97.setVisibility(View.VISIBLE);
                    OthersMap.setT97(1);
                    savePageData();
                    return;
                } else {
                    txtT97.setVisibility(View.GONE);
                    OthersMap.setT97(0);
                    savePageData();
                }

            }
        });

        T98.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T98.indexOfChild(T98.findViewById(paramAnonymousInt));
                System.out.println(i);
                if (i == 4) {
                    txtT98.setVisibility(View.VISIBLE);
                    OthersMap.setT98(1);
                    return;
                } else {
                    txtT98.setVisibility(View.GONE);
                    OthersMap.setT98(0);
                }

                // Answers.setT98(T98.indexOfChild(T98.findViewById(T98.getCheckedRadioButtonId())) + "");
            }
        });
        T99.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                int i = T99.indexOfChild(T99.findViewById(paramAnonymousInt));
                if (i == 1) {
                    T99x.setVisibility(View.VISIBLE);
                } else {
                    T99x.setVisibility(View.INVISIBLE);
                }
                if (i == 2) {
                    T99y.setVisibility(View.VISIBLE);
                } else {
                    T99y.setVisibility(View.INVISIBLE);
                }
                if (i == 3) {
                    T99z.setVisibility(View.VISIBLE);
                } else {
                    T99z.setVisibility(View.INVISIBLE);
                }
                savePageData();
                //  Answers.setT98(T99.indexOfChild(T99.findViewById(T99.getCheckedRadioButtonId())) + "");

            }
        });
        super.onResume();
    }

    public void savePageData() {
        if (this.T95.indexOfChild(this.T95.findViewById(this.T95.getCheckedRadioButtonId())) == 7) {
            Answers.setT95(this.txtT95.getText().toString());
        }
        if (this.T96.indexOfChild(this.T96.findViewById(this.T96.getCheckedRadioButtonId())) == 5) {
            Answers.setT96(this.txtT96.getText().toString());
        }
        Answers.setT97(getCheckedStuff97());

        if (this.T98.indexOfChild(this.T98.findViewById(this.T98.getCheckedRadioButtonId())) == 4) {
            Answers.setT98(this.txtT98.getText().toString());
        }
        if (this.T99.indexOfChild(this.T99.findViewById(this.T99.getCheckedRadioButtonId())) == 1) {
            Answers.setT99(this.T99x.getText().toString() + " Acres");
        } else if (this.T99.indexOfChild(this.T99.findViewById(this.T99.getCheckedRadioButtonId())) == 2) {
            Answers.setT99(this.T99y.getText().toString() + " Hectares");
        } else if (this.T99.indexOfChild(this.T99.findViewById(this.T99.getCheckedRadioButtonId())) == 3) {
            Answers.setT99(this.T99z.getText().toString() + " Feet");
        } else {
            Answers.setT99(this.T99.indexOfChild(this.T99.findViewById(this.T99.getCheckedRadioButtonId())) + "");
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