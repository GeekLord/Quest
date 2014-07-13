package fravier.com.quest.module2;

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


public class T3 extends Fragment {
    public int progressChanged_47 = 0;
    public int progressChanged_48 = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT47:
                    progressChanged_47 = paramAnonymousInt;
                    sbvT47.setText(progressChanged_47 + "% likelihood");
                    T47a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T47a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T47b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T47b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT48:
                    sbvT48.setText(progressChanged_48 + "% likelihood");
                    progressChanged_48 = paramAnonymousInt;
                    T48a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T48a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T48b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T48b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT47:
                    Answers.setT47(progressChanged_47 + "%");
                    return;
                case R.id.sbT48:
                    Answers.setT48(progressChanged_48 + "%");
                    return;
            }

        }
    };
    RadioGroup T46;
    ImageView T47a;
    ImageView T47b;
    ImageView T48a;
    ImageView T48b;
    Context ctx;
    TextView lbl;
    SeekBar sbT47;
    SeekBar sbT48;
    TextView sbvT47;
    TextView sbvT48;

    public void setToZero() {
        T47a.setScaleX(1.0F + (50) / 100.0F);
        T47a.setScaleY(1.0F + (50) / 100.0F);
        T47b.setScaleX(1.0F + (-50) / 100.0F);
        T47b.setScaleY(1.0F + (-50) / 100.0F);

        T48a.setScaleX(1.0F + (50) / 100.0F);
        T48a.setScaleY(1.0F + (50) / 100.0F);
        T48b.setScaleX(1.0F + (-50) / 100.0F);
        T48b.setScaleY(1.0F + (-50) / 100.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        T46 = ((RadioGroup) paramView.findViewById(R.id.rdgT46));
        T47a = ((ImageView) paramView.findViewById(R.id.imgT47a));
        T47b = ((ImageView) paramView.findViewById(R.id.imgT47b));
        T48a = ((ImageView) paramView.findViewById(R.id.imgT48a));
        T48b = ((ImageView) paramView.findViewById(R.id.imgT48b));
        lbl = ((TextView) paramView.findViewById(R.id.lblT46));
        sbT47 = ((SeekBar) paramView.findViewById(R.id.sbT47));
        sbT48 = ((SeekBar) paramView.findViewById(R.id.sbT48));
        sbvT47 = ((TextView) paramView.findViewById(R.id.sbvT47));
        sbvT48 = ((TextView) paramView.findViewById(R.id.sbvT48));

        setToZero();

        sbT47.setMax(100);
        sbT47.setProgress(0);
        sbT48.setMax(100);
        sbT48.setProgress(0);
        sbvT47.setText(progressChanged_47 + "% likelihood");
        sbvT48.setText(progressChanged_48 + "% likelihood");
    }

    private void listeners() {
        sbT47.setOnSeekBarChangeListener(l);
        sbT48.setOnSeekBarChangeListener(l);
        T46.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt) {
                Answers.setT46(T46.indexOfChild(T46.findViewById(T46.getCheckedRadioButtonId())) + "");
            }
        });
    }

    private void savePageData() {
        Answers.setT47(progressChanged_47 + "%");
        Answers.setT48(progressChanged_48 + "%");
        Answers.setT46(T46.indexOfChild(T46.findViewById(T46.getCheckedRadioButtonId())) + "");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t3, paramViewGroup, false);
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
