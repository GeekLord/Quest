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


public class O19 extends Fragment {
    public int progressChanged_b = 0;
    public int progressChanged_c = 0;
    public int progressChanged_d = 0;


    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean fromUser) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO414a:
                    progressChanged_b = paramAnonymousInt;
                    sbvO414aa.setText(progressChanged_b + "% likelihood");
                    O414aa.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.F);
                    O414aa.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.F);
                    O414ab.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.F);
                    O414ab.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.F);
                    return;
                case R.id.sbO414b:
                    progressChanged_c = paramAnonymousInt;
                    sbvO414ba.setText(progressChanged_c + "% likelihood");
                    O414ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.F);
                    O414ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.F);
                    O414bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.F);
                    O414bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.F);
                    return;
                case R.id.sbO414c:
                    progressChanged_d = paramAnonymousInt;
                    sbvO414ca.setText(progressChanged_d + "% likelihood");
                    O414ca.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.F);
                    O414ca.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.F);
                    O414cb.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.F);
                    O414cb.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.F);

            }


        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {
                case R.id.sbO414a:
                    Answers.setO414a(progressChanged_b + "%");
                    return;
                case R.id.sbO414b:
                    Answers.setO414b(progressChanged_c + "%");
                    return;
                case R.id.sbO414c:
                    Answers.setO414c(progressChanged_d + "%");
                    return;
            }
        }
    };


    ImageView O414aa;
    ImageView O414ab;
    ImageView O414ba;
    ImageView O414bb;
    ImageView O414ca;
    ImageView O414cb;
    Context ctx;
    TextView lbl;
    SeekBar sbO414aa;
    SeekBar sbO414ba;
    SeekBar sbO414ca;
    TextView sbvO414aa;
    TextView sbvO414ba;
    TextView sbvO414ca;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    public void setToZero() {
        O414aa.setScaleX(1.0F + (50) / 70.F);
        O414aa.setScaleY(1.0F + (50) / 70.F);
        O414ab.setScaleX(1.0F + (-50) / 70.F);
        O414ab.setScaleY(1.0F + (-50) / 70.F);

        O414ba.setScaleX(1.0F + (50) / 70.F);
        O414ba.setScaleY(1.0F + (50) / 70.F);
        O414bb.setScaleX(1.0F + (-50) / 70.F);
        O414bb.setScaleY(1.0F + (-50) / 70.F);

        O414ca.setScaleX(1.0F + (50) / 70.F);
        O414ca.setScaleY(1.0F + (50) / 70.F);
        O414cb.setScaleX(1.0F + (-50) / 70.F);
        O414cb.setScaleY(1.0F + (-50) / 70.F);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO414a));
        O414aa = ((ImageView) paramView.findViewById(R.id.imgO414aa));
        O414ab = ((ImageView) paramView.findViewById(R.id.imgO414ab));
        O414ba = ((ImageView) paramView.findViewById(R.id.imgO414ba));
        O414bb = ((ImageView) paramView.findViewById(R.id.imgO414bb));
        O414ca = ((ImageView) paramView.findViewById(R.id.imgO414ca));
        O414cb = ((ImageView) paramView.findViewById(R.id.imgO414cb));

        sbO414aa = ((SeekBar) paramView.findViewById(R.id.sbO414a));
        sbO414ba = ((SeekBar) paramView.findViewById(R.id.sbO414b));
        sbO414ca = ((SeekBar) paramView.findViewById(R.id.sbO414c));

        sbvO414aa = ((TextView) paramView.findViewById(R.id.sbvO414a));
        sbvO414ba = ((TextView) paramView.findViewById(R.id.sbvO414b));
        sbvO414ca = ((TextView) paramView.findViewById(R.id.sbvO414c));

        setToZero();

        sbO414aa.setMax(100);
        sbO414aa.setProgress(0);
        sbO414ba.setMax(100);
        sbO414ba.setProgress(0);
        sbO414ca.setMax(100);
        sbO414ca.setProgress(0);

        sbvO414aa.setText(progressChanged_b + "% likelihood");
        sbvO414ba.setText(progressChanged_c + "% likelihood");
        sbvO414ca.setText(progressChanged_d + "% likelihood");
    }

    private void listeners() {
        sbO414aa.setOnSeekBarChangeListener(l);
        sbO414ba.setOnSeekBarChangeListener(l);
        sbO414ca.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setO414a(progressChanged_b + "%");
        Answers.setO414b(progressChanged_c + "%");
        Answers.setO414c(progressChanged_d + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o19, paramViewGroup, false);
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
