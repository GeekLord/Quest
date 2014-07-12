package fravier.com.quest.module2;

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


public class T7 extends Fragment {
    public static int progressChanged_b = 0;
    public static int progressChanged_c = 0;
    public static int progressChanged_d = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT414a:
                    progressChanged_b = paramAnonymousInt;
                    sbvT414aa.setText(progressChanged_b + "% likelihood");
                    T414aa.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T414aa.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T414ab.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T414ab.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT414b:
                    progressChanged_c = paramAnonymousInt;
                    sbvT414ba.setText(progressChanged_c + "% likelihood");
                    T414ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T414ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T414bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T414bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT414c:
                    progressChanged_d = paramAnonymousInt;
                    sbvT414ca.setText(progressChanged_d + "% likelihood");
                    T414ca.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T414ca.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T414cb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T414cb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);

            }


        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT414a:
                    Answers.setT414a(progressChanged_b + "%");
                    return;
                case R.id.sbT414b:
                    Answers.setT414b(progressChanged_c + "%");
                    return;
                case R.id.sbT414c:
                    Answers.setT414c(progressChanged_d + "%");
                    return;
            }

        }
    };
    ImageView T414aa;
    ImageView T414ab;
    ImageView T414ba;
    ImageView T414bb;
    ImageView T414ca;
    ImageView T414cb;
    Context ctx;
    TextView lbl;
    SeekBar sbT414aa;
    SeekBar sbT414ba;
    SeekBar sbT414ca;
    TextView sbvT414aa;
    TextView sbvT414ba;
    TextView sbvT414ca;

    public void setToZero() {
        T414aa.setScaleX(1.0F + (50) / 100.0F);
        T414aa.setScaleY(1.0F + (50) / 100.0F);
        T414ab.setScaleX(1.0F + (-50) / 100.0F);
        T414ab.setScaleY(1.0F + (-50) / 100.0F);

        T414ba.setScaleX(1.0F + (50) / 100.0F);
        T414ba.setScaleY(1.0F + (50) / 100.0F);
        T414bb.setScaleX(1.0F + (-50) / 100.0F);
        T414bb.setScaleY(1.0F + (-50) / 100.0F);

        T414ca.setScaleX(1.0F + (50) / 100.0F);
        T414ca.setScaleY(1.0F + (50) / 100.0F);
        T414cb.setScaleX(1.0F + (-50) / 100.0F);
        T414cb.setScaleY(1.0F + (-50) / 100.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblT414a));
        T414aa = ((ImageView) paramView.findViewById(R.id.imgT414aa));
        T414ab = ((ImageView) paramView.findViewById(R.id.imgT414ab));
        T414ba = ((ImageView) paramView.findViewById(R.id.imgT414ba));
        T414bb = ((ImageView) paramView.findViewById(R.id.imgT414bb));
        T414ca = ((ImageView) paramView.findViewById(R.id.imgT414ca));
        T414cb = ((ImageView) paramView.findViewById(R.id.imgT414cb));

        sbT414aa = ((SeekBar) paramView.findViewById(R.id.sbT414a));
        sbT414ba = ((SeekBar) paramView.findViewById(R.id.sbT414b));
        sbT414ca = ((SeekBar) paramView.findViewById(R.id.sbT414c));

        sbvT414aa = ((TextView) paramView.findViewById(R.id.sbvT414a));
        sbvT414ba = ((TextView) paramView.findViewById(R.id.sbvT414b));
        sbvT414ca = ((TextView) paramView.findViewById(R.id.sbvT414c));

        setToZero();

        sbT414aa.setMax(100);
        sbT414aa.setProgress(0);
        sbT414ba.setMax(100);
        sbT414ba.setProgress(0);
        sbT414ca.setMax(100);
        sbT414ca.setProgress(0);

        sbvT414aa.setText(progressChanged_b + "% likelihood");
        sbvT414ba.setText(progressChanged_c + "% likelihood");
        sbvT414ca.setText(progressChanged_d + "% likelihood");
    }

    private void listeners() {
        sbT414aa.setOnSeekBarChangeListener(l);
        sbT414ba.setOnSeekBarChangeListener(l);
        sbT414ca.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setT414a(progressChanged_b + "%");
        Answers.setT414b(progressChanged_c + "%");
        Answers.setT414c(progressChanged_d + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t7, paramViewGroup, false);
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
