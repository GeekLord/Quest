package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O17 extends Fragment {
    public int progressChanged_410 = 0;
    public int progressChanged_411 = 0;
    public int progressChanged_412 = 0;


    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO410:
                    progressChanged_410 = paramAnonymousInt;
                    sbvO410.setText(progressChanged_410 + "% likelihood");
                    O410a.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    O410a.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    O410b.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    O410b.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    return;
                case R.id.sbO411:
                    progressChanged_411 = paramAnonymousInt;
                    sbvO411.setText(progressChanged_411 + "% likelihood");
                    O411a.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    O411a.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    O411b.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    O411b.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    return;
                case R.id.sbO412:
                    progressChanged_412 = paramAnonymousInt;
                    sbvO412.setText(progressChanged_412 + "% likelihood");
                    O412a.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    O412a.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    O412b.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    O412b.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    break;

            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO410:
                    Answers.setO410(progressChanged_410 + "%");
                    return;
                case R.id.sbO411:
                    Answers.setO411(progressChanged_411 + "%");
                    return;
                case R.id.sbO412:
                    Answers.setO412(progressChanged_412 + "%");
                    return;
            }

        }
    };
    ImageView O410a;
    ImageView O410b;
    ImageView O411a;
    ImageView O411b;
    ImageView O412a;
    ImageView O412b;
    Context ctx;
    TextView lbl;
    SeekBar sbO410;
    SeekBar sbO411;
    SeekBar sbO412;
    TextView sbvO410;
    TextView sbvO411;
    TextView sbvO412;

    public void setToZero() {
        O410a.setScaleX(1.0F + (50) / 70.0F);
        O410a.setScaleY(1.0F + (50) / 70.0F);
        O410b.setScaleX(1.0F + (-50) / 70.0F);
        O410b.setScaleY(1.0F + (-50) / 70.0F);

        O411a.setScaleX(1.0F + (50) / 70.0F);
        O411a.setScaleY(1.0F + (50) / 70.0F);
        O411b.setScaleX(1.0F + (-50) / 70.0F);
        O411b.setScaleY(1.0F + (-50) / 70.0F);

        O412a.setScaleX(1.0F + (50) / 70.0F);
        O412a.setScaleY(1.0F + (50) / 70.0F);
        O412b.setScaleX(1.0F + (-50) / 70.0F);
        O412b.setScaleY(1.0F + (-50) / 70.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        O410a = ((ImageView) paramView.findViewById(R.id.imgO410a));
        O410b = ((ImageView) paramView.findViewById(R.id.imgO410b));
        O411a = ((ImageView) paramView.findViewById(R.id.imgO411a));
        O411b = ((ImageView) paramView.findViewById(R.id.imgO411b));
        O412a = ((ImageView) paramView.findViewById(R.id.imgO412a));
        O412b = ((ImageView) paramView.findViewById(R.id.imgO412b));

        lbl = ((TextView) paramView.findViewById(R.id.lblO410a));

        sbO410 = ((SeekBar) paramView.findViewById(R.id.sbO410));
        sbO411 = ((SeekBar) paramView.findViewById(R.id.sbO411));
        sbO412 = ((SeekBar) paramView.findViewById(R.id.sbO412));

        sbvO410 = ((TextView) paramView.findViewById(R.id.sbvO410));
        sbvO411 = ((TextView) paramView.findViewById(R.id.sbvO411));
        sbvO412 = ((TextView) paramView.findViewById(R.id.sbvO412));

        setToZero();

        sbO410.setMax(100);
        sbO410.setProgress(0);
        sbO411.setMax(100);
        sbO411.setProgress(0);
        sbO412.setMax(100);
        sbO412.setProgress(0);

        sbvO410.setText(progressChanged_410 + "% likelihood");
        sbvO411.setText(progressChanged_411 + "% likelihood");
        sbvO412.setText(progressChanged_412 + "% likelihood");
    }

    private void listeners() {
        sbO410.setOnSeekBarChangeListener(l);
        sbO411.setOnSeekBarChangeListener(l);
        sbO412.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setO410(progressChanged_410 + "%");
        Answers.setO411(progressChanged_411 + "%");
        Answers.setO412(progressChanged_412 + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o17, paramViewGroup, false);
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
