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


public class T5 extends Fragment {
    public int progressChanged_410 = 0;
    public int progressChanged_411 = 0;
    public int progressChanged_412 = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT410:
                    progressChanged_410 = paramAnonymousInt;
                    sbvT410.setText(progressChanged_410 + "% likelihood");
                    T410a.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T410a.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T410b.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    T410b.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    return;
                case R.id.sbT411:
                    progressChanged_411 = paramAnonymousInt;
                    sbvT411.setText(progressChanged_411 + "% likelihood");
                    T411a.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T411a.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T411b.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    T411b.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    return;
                case R.id.sbT412:
                    progressChanged_412 = paramAnonymousInt;
                    sbvT412.setText(progressChanged_412 + "% likelihood");
                    T412a.setScaleX(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T412a.setScaleY(1.0F + (50 - paramAnonymousInt) / 70.0F);
                    T412b.setScaleX(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    T412b.setScaleY(1.0F + (paramAnonymousInt - 50) / 70.0F);
                    break;

            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT410:
                    Answers.setT410(progressChanged_410 + "%");
                    return;
                case R.id.sbT411:
                    Answers.setT411(progressChanged_411 + "%");
                    return;
                case R.id.sbT412:
                    Answers.setT412(progressChanged_412 + "%");
                    return;
            }

        }
    };
    ImageView T410a;
    ImageView T410b;
    ImageView T411a;
    ImageView T411b;
    ImageView T412a;
    ImageView T412b;
    Context ctx;
    TextView lbl;
    SeekBar sbT410;
    SeekBar sbT411;
    SeekBar sbT412;
    TextView sbvT410;
    TextView sbvT411;
    TextView sbvT412;

    public void setToZero() {
        T410a.setScaleX(1.0F + (50) / 70.0F);
        T410a.setScaleY(1.0F + (50) / 70.0F);
        T410b.setScaleX(1.0F + (-50) / 70.0F);
        T410b.setScaleY(1.0F + (-50) / 70.0F);

        T411a.setScaleX(1.0F + (50) / 70.0F);
        T411a.setScaleY(1.0F + (50) / 70.0F);
        T411b.setScaleX(1.0F + (-50) / 70.0F);
        T411b.setScaleY(1.0F + (-50) / 70.0F);

        T412a.setScaleX(1.0F + (50) / 70.0F);
        T412a.setScaleY(1.0F + (50) / 70.0F);
        T412b.setScaleX(1.0F + (-50) / 70.0F);
        T412b.setScaleY(1.0F + (-50) / 70.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        T410a = ((ImageView) paramView.findViewById(R.id.imgT410a));
        T410b = ((ImageView) paramView.findViewById(R.id.imgT410b));
        T411a = ((ImageView) paramView.findViewById(R.id.imgT411a));
        T411b = ((ImageView) paramView.findViewById(R.id.imgT411b));
        T412a = ((ImageView) paramView.findViewById(R.id.imgT412a));
        T412b = ((ImageView) paramView.findViewById(R.id.imgT412b));

        lbl = ((TextView) paramView.findViewById(R.id.lblT410a));

        sbT410 = ((SeekBar) paramView.findViewById(R.id.sbT410));
        sbT411 = ((SeekBar) paramView.findViewById(R.id.sbT411));
        sbT412 = ((SeekBar) paramView.findViewById(R.id.sbT412));

        sbvT410 = ((TextView) paramView.findViewById(R.id.sbvT410));
        sbvT411 = ((TextView) paramView.findViewById(R.id.sbvT411));
        sbvT412 = ((TextView) paramView.findViewById(R.id.sbvT412));

        setToZero();

        sbT410.setMax(100);
        sbT410.setProgress(0);
        sbT411.setMax(100);
        sbT411.setProgress(0);
        sbT412.setMax(100);
        sbT412.setProgress(0);

        sbvT410.setText(progressChanged_410 + "% likelihood");
        sbvT411.setText(progressChanged_411 + "% likelihood");
        sbvT412.setText(progressChanged_412 + "% likelihood");
    }

    private void listeners() {
        sbT410.setOnSeekBarChangeListener(l);
        sbT411.setOnSeekBarChangeListener(l);
        sbT412.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setT410(progressChanged_410 + "%");
        Answers.setT411(progressChanged_411 + "%");
        Answers.setT412(progressChanged_412 + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t5, paramViewGroup, false);
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
