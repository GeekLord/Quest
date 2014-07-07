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
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O13 extends Fragment {
    public static int progressChanged_b = 0;
    public static int progressChanged_c = 0;
    public static int progressChanged_d = 50;
    public static int progressChanged_e = 50;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {
                default:
                    return;
                case R.id.sbO40b:
                    progressChanged_b = paramAnonymousInt;
                    sbvO40ba.setText(progressChanged_b + "% likelihood");
                    O40ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O40bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO40c:
                    progressChanged_c = paramAnonymousInt;
                    sbvO40ca.setText(progressChanged_c + "% likelihood");
                    O40ca.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40ca.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40cb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O40cb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO40d:
                    progressChanged_d = paramAnonymousInt;
                    sbvO40da.setText(progressChanged_d + "% likelihood");
                    O40da.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40da.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40db.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O40db.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO40e:
                    progressChanged_e = paramAnonymousInt;
                    sbvO40ea.setText(progressChanged_e + "% likelihood");
                    O40ea.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40ea.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O40eb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O40eb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);

            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO40b:
                    Answers.setO40b(progressChanged_b + "%");
                    return;
                case R.id.sbO40c:
                    Answers.setO40c(progressChanged_c + "%");
                    return;
                case R.id.sbO40d:
                    Answers.setO40d(progressChanged_d + "%");
                    return;
                case R.id.sbO40e:
                    Answers.setO40e(progressChanged_e + "%");
                    return;
            }

        }
    };
    EditText O40aa;
    EditText O40ab;
    ImageView O40ba;
    ImageView O40bb;
    ImageView O40ca;
    ImageView O40cb;
    ImageView O40da;
    ImageView O40db;
    ImageView O40ea;
    ImageView O40eb;
    Context ctx;
    TextView lbl;
    SeekBar sbO40ba;
    SeekBar sbO40ca;
    SeekBar sbO40da;
    SeekBar sbO40ea;
    TextView sbvO40ba;
    TextView sbvO40ca;
    TextView sbvO40da;
    TextView sbvO40ea;

    public void setToZero() {
        O40ba.setScaleX(1.0F + (50) / 100.0F);
        O40ba.setScaleY(1.0F + (50) / 100.0F);
        O40bb.setScaleX(1.0F + (-50) / 100.0F);
        O40bb.setScaleY(1.0F + (-50) / 100.0F);

        O40ca.setScaleX(1.0F + (50) / 100.0F);
        O40ca.setScaleY(1.0F + (50) / 100.0F);
        O40cb.setScaleX(1.0F + (-50) / 100.0F);
        O40cb.setScaleY(1.0F + (-50) / 100.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO40));
        O40aa = ((EditText) paramView.findViewById(R.id.txtO40aa));
        O40ab = ((EditText) paramView.findViewById(R.id.txtO40ab));
        O40ba = ((ImageView) paramView.findViewById(R.id.imgO40ba));
        O40bb = ((ImageView) paramView.findViewById(R.id.imgO40bb));
        O40ca = ((ImageView) paramView.findViewById(R.id.imgO40ca));
        O40cb = ((ImageView) paramView.findViewById(R.id.imgO40cb));
        O40da = ((ImageView) paramView.findViewById(R.id.imgO40da));
        O40db = ((ImageView) paramView.findViewById(R.id.imgO40db));
        O40ea = ((ImageView) paramView.findViewById(R.id.imgO40ea));
        O40eb = ((ImageView) paramView.findViewById(R.id.imgO40eb));

        sbO40ba = ((SeekBar) paramView.findViewById(R.id.sbO40b));
        sbO40ca = ((SeekBar) paramView.findViewById(R.id.sbO40c));
        sbO40da = ((SeekBar) paramView.findViewById(R.id.sbO40d));
        sbO40ea = ((SeekBar) paramView.findViewById(R.id.sbO40e));

        sbvO40ba = ((TextView) paramView.findViewById(R.id.sbvO40b));
        sbvO40ca = ((TextView) paramView.findViewById(R.id.sbvO40c));
        sbvO40da = ((TextView) paramView.findViewById(R.id.sbvO40d));
        sbvO40ea = ((TextView) paramView.findViewById(R.id.sbvO40e));

        setToZero();


        sbO40ba.setMax(100);
        sbO40ba.setProgress(0);
        sbO40ca.setMax(100);
        sbO40ca.setProgress(0);
        sbO40da.setMax(100);
        sbO40da.setProgress(50);
        sbO40ea.setMax(100);
        sbO40ea.setProgress(50);
        sbvO40ba.setText(progressChanged_b + "% likelihood");
        sbvO40ca.setText(progressChanged_c + "% likelihood");
        sbvO40da.setText(progressChanged_d + "% likelihood");
        sbvO40ea.setText(progressChanged_e + "% likelihood");
    }

    private void listeners() {
        sbO40ba.setOnSeekBarChangeListener(l);
        sbO40ca.setOnSeekBarChangeListener(l);
        sbO40da.setOnSeekBarChangeListener(l);
        sbO40ea.setOnSeekBarChangeListener(l);

        O40aa.addTextChangedListener(new TextWatcher() {
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
        O40ab.addTextChangedListener(new TextWatcher() {
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
        Answers.setO40a(O40aa.getText().toString().trim() + " of " + O40ab.getText().toString().trim());
        Answers.setO40b(progressChanged_b + "%");
        Answers.setO40c(progressChanged_c + "%");
        Answers.setO40d(progressChanged_d + "%");
        Answers.setO40e(progressChanged_e + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o13, paramViewGroup, false);
        initViews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }

    public void onResume() {
        savePageData();
        super.onResume();
    }

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {
        }
    }
}


