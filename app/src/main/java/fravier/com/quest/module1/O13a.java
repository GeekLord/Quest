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


public class O13a extends Fragment {
    public int progressChanged_b = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {
                default:
                    return;
                case R.id.sbTest:
                    progressChanged_b = paramAnonymousInt;
                    sbvT40ba.setText(progressChanged_b + "% likelihood");
                    T40ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T40ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T40bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    T40bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    return;

            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbTest:
                    Answers.setT40b(progressChanged_b + "%");
                    return;

            }

        }
    };
    Context ctx;
    TextView lbl;
    ImageView T40ba;
    ImageView T40bb;
    SeekBar sbT40ba;
    TextView sbvT40ba;

    public void setToZero() {
        T40ba.setScaleX(1.0F + (50) / 100.0F);
        T40ba.setScaleY(1.0F + (50) / 100.0F);
        T40bb.setScaleX(1.0F + (-50) / 100.0F);
        T40bb.setScaleY(1.0F + (-50) / 100.0F);


    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) this.lbl.getRootView(), this.ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        this.lbl = ((TextView) paramView.findViewById(R.id.lblO31a));
        T40ba = ((ImageView) paramView.findViewById(R.id.imgTesta));
        T40bb = ((ImageView) paramView.findViewById(R.id.imgTestb));

        sbT40ba = ((SeekBar) paramView.findViewById(R.id.sbTest));
        sbvT40ba = ((TextView) paramView.findViewById(R.id.sbvTest));

        setToZero();

        sbT40ba.setMax(100);
        sbT40ba.setProgress(0);

        sbvT40ba.setText(progressChanged_b + "% likelihood");

    }

    private void listeners() {
        sbT40ba.setOnSeekBarChangeListener(l);
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        this.ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o13a, paramViewGroup, false);
        initViews(localView);
        listeners();
        fonting();
        return localView;
    }
}

