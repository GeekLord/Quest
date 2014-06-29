package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O15 extends Fragment {
    public static int progressChanged_47 = 50;
    public static int progressChanged_48 = 50;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO47:
                    progressChanged_47 = paramAnonymousInt;
                    sbvO47.setText(progressChanged_47 + "% likelihood");
                    O47a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O47a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O47b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O47b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO48:
                    sbvO48.setText(progressChanged_48 + "% likelihood");
                    progressChanged_48 = paramAnonymousInt;
                    O48a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O48a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O48b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O48b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO47:
                    Answers.setO47(O15.progressChanged_47 + "%");
                    return;
                case R.id.sbO48:
                    Answers.setO48(O15.progressChanged_48 + "%");
                    return;
            }

        }
    };
    RadioGroup O46;
    ImageView O47a;
    ImageView O47b;
    ImageView O48a;
    ImageView O48b;
    Context ctx;
    TextView lbl;
    SeekBar sbO47;
    SeekBar sbO48;
    TextView sbvO47;
    TextView sbvO48;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        O46 = ((RadioGroup) paramView.findViewById(R.id.rdgO46));
        O47a = ((ImageView) paramView.findViewById(R.id.imgO47a));
        O47b = ((ImageView) paramView.findViewById(R.id.imgO47b));
        O48a = ((ImageView) paramView.findViewById(R.id.imgO48a));
        O48b = ((ImageView) paramView.findViewById(R.id.imgO48b));
        lbl = ((TextView) paramView.findViewById(R.id.lblO46));
        sbO47 = ((SeekBar) paramView.findViewById(R.id.sbO47));
        sbO48 = ((SeekBar) paramView.findViewById(R.id.sbO48));
        sbvO47 = ((TextView) paramView.findViewById(R.id.sbvO47));
        sbvO48 = ((TextView) paramView.findViewById(R.id.sbvO48));
        sbO47.setMax(100);
        sbO47.setProgress(50);
        sbO48.setMax(100);
        sbO48.setProgress(50);
        sbvO47.setText(progressChanged_47 + "% likelihood");
        sbvO48.setText(progressChanged_48 + "% likelihood");
    }

    private void listeners() {
        sbO47.setOnSeekBarChangeListener(l);
        sbO48.setOnSeekBarChangeListener(l);
        O46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                Answers.setO46(O46.indexOfChild(O46.findViewById(O46.getCheckedRadioButtonId())) + "");
            }
        });
    }

    private void savePageData() {
        Answers.setO47(progressChanged_47 + "%");
        Answers.setO48(progressChanged_48 + "%");
        Answers.setO46(O46.indexOfChild(O46.findViewById(O46.getCheckedRadioButtonId())) + "");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o15, paramViewGroup, false);
        initViews(localView);
        fonting();
        listeners();
        savePageData();
        return localView;
    }


    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {
        }
    }
}
