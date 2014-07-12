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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class T2 extends Fragment {
    public static int progressChanged_b = 0;
    public static int progressChanged_c = 0;
    public static int progressChanged_d = 0;
    public static int progressChanged_e = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {
                default:
                    return;
                case R.id.sbT40b:
                    progressChanged_b = paramAnonymousInt;
                    sbvT40ba.setText(progressChanged_b + "% likelihood");
                    T40ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T40bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT40c:
                    progressChanged_c = paramAnonymousInt;
                    sbvT40ca.setText(progressChanged_c + "% likelihood");
                    T40ca.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40ca.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40cb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T40cb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT40d:
                    progressChanged_d = paramAnonymousInt;
                    sbvT40da.setText(progressChanged_d + "% likelihood");
                    T40da.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40da.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40db.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T40db.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT40e:
                    progressChanged_e = paramAnonymousInt;
                    sbvT40ea.setText(progressChanged_e + "% likelihood");
                    T40ea.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40ea.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T40eb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T40eb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);

            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT40b:
                    Answers.setT40b(progressChanged_b + "%");
                    return;
                case R.id.sbT40c:
                    Answers.setT40c(progressChanged_c + "%");
                    return;
                case R.id.sbT40d:
                    Answers.setT40d(progressChanged_d + "%");
                    return;
                case R.id.sbT40e:
                    Answers.setT40e(progressChanged_e + "%");
                    return;
            }

        }
    };
    EditText T40aa;
    EditText T40ab;
    ImageView T40ba;
    ImageView T40bb;
    ImageView T40ca;
    ImageView T40cb;
    ImageView T40da;
    ImageView T40db;
    ImageView T40ea;
    ImageView T40eb;
    Context ctx;
    TextView lbl;
    SeekBar sbT40ba;
    SeekBar sbT40ca;
    SeekBar sbT40da;
    SeekBar sbT40ea;
    TextView sbvT40ba;
    TextView sbvT40ca;
    TextView sbvT40da;
    TextView sbvT40ea;

    public void setToZero() {
        T40ba.setScaleX(1.0F + (50) / 100.0F);
        T40ba.setScaleY(1.0F + (50) / 100.0F);
        T40bb.setScaleX(1.0F + (-50) / 100.0F);
        T40bb.setScaleY(1.0F + (-50) / 100.0F);

        T40ca.setScaleX(1.0F + (50) / 100.0F);
        T40ca.setScaleY(1.0F + (50) / 100.0F);
        T40cb.setScaleX(1.0F + (-50) / 100.0F);
        T40cb.setScaleY(1.0F + (-50) / 100.0F);

        T40da.setScaleX(1.0F + (50) / 100.0F);
        T40da.setScaleY(1.0F + (50) / 100.0F);
        T40db.setScaleX(1.0F + (-50) / 100.0F);
        T40db.setScaleY(1.0F + (-50) / 100.0F);

        T40ea.setScaleX(1.0F + (50) / 100.0F);
        T40ea.setScaleY(1.0F + (50) / 100.0F);
        T40eb.setScaleX(1.0F + (-50) / 100.0F);
        T40eb.setScaleY(1.0F + (-50) / 100.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblT40));
        T40aa = ((EditText) paramView.findViewById(R.id.txtT40aa));
        T40ab = ((EditText) paramView.findViewById(R.id.txtT40ab));
        T40ba = ((ImageView) paramView.findViewById(R.id.imgT40ba));
        T40bb = ((ImageView) paramView.findViewById(R.id.imgT40bb));
        T40ca = ((ImageView) paramView.findViewById(R.id.imgT40ca));
        T40cb = ((ImageView) paramView.findViewById(R.id.imgT40cb));
        T40da = ((ImageView) paramView.findViewById(R.id.imgT40da));
        T40db = ((ImageView) paramView.findViewById(R.id.imgT40db));
        T40ea = ((ImageView) paramView.findViewById(R.id.imgT40ea));
        T40eb = ((ImageView) paramView.findViewById(R.id.imgT40eb));

        sbT40ba = ((SeekBar) paramView.findViewById(R.id.sbT40b));
        sbT40ca = ((SeekBar) paramView.findViewById(R.id.sbT40c));
        sbT40da = ((SeekBar) paramView.findViewById(R.id.sbT40d));
        sbT40ea = ((SeekBar) paramView.findViewById(R.id.sbT40e));

        sbvT40ba = ((TextView) paramView.findViewById(R.id.sbvT40b));
        sbvT40ca = ((TextView) paramView.findViewById(R.id.sbvT40c));
        sbvT40da = ((TextView) paramView.findViewById(R.id.sbvT40d));
        sbvT40ea = ((TextView) paramView.findViewById(R.id.sbvT40e));

        setToZero();

        sbT40ba.setMax(100);
        sbT40ba.setProgress(0);
        sbT40ca.setMax(100);
        sbT40ca.setProgress(0);
        sbT40da.setMax(100);
        sbT40da.setProgress(0);
        sbT40ea.setMax(100);
        sbT40ea.setProgress(0);
        sbvT40ba.setText(progressChanged_b + "% likelihood");
        sbvT40ca.setText(progressChanged_c + "% likelihood");
        sbvT40da.setText(progressChanged_d + "% likelihood");
        sbvT40ea.setText(progressChanged_e + "% likelihood");
    }

    private void listeners() {
        sbT40ba.setOnSeekBarChangeListener(l);
        sbT40ca.setOnSeekBarChangeListener(l);
        sbT40da.setOnSeekBarChangeListener(l);
        sbT40ea.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setT40a(T40aa.getText().toString().trim() + " of " + T40ab.getText().toString().trim());
        Answers.setT40b(progressChanged_b + "%");
        Answers.setT40c(progressChanged_c + "%");
        Answers.setT40d(progressChanged_d + "%");
        Answers.setT40e(progressChanged_e + "%");
        T40aa.addTextChangedListener(new TextWatcher() {
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
        T40ab.addTextChangedListener(new TextWatcher() {
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
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t2, paramViewGroup, false);
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


