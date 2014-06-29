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


public class T13 extends Fragment {
    public static int progressChanged_81 = 50;
    public static int progressChanged_82 = 50;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT81:
                    progressChanged_81 = paramAnonymousInt;
                    sbvT81.setText(progressChanged_81 + "% likelihood");

                    T81a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T81a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T81b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T81b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT82:
                    progressChanged_82 = paramAnonymousInt;
                    sbvT82.setText(progressChanged_82 + "% likelihood");
                    T82a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T82a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T82b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T82b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbT81:
                    Answers.setT81(progressChanged_81 + "%");
                    return;
                case R.id.sbT82:
                    Answers.setT82(progressChanged_82 + "%");
                    return;
            }

        }
    };
    TextView sbvT81, sbvT82;
    ImageView T81a;
    ImageView T81b;
    ImageView T82a;
    ImageView T82b;
    Context ctx;
    TextView lbl;
    SeekBar sbT81;
    SeekBar sbT82;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        T81a = ((ImageView) paramView.findViewById(R.id.imgT81a));
        T81b = ((ImageView) paramView.findViewById(R.id.imgT81b));
        T82a = ((ImageView) paramView.findViewById(R.id.imgT82a));
        T82b = ((ImageView) paramView.findViewById(R.id.imgT82b));
        lbl = ((TextView) paramView.findViewById(R.id.lblT81));
        sbT81 = ((SeekBar) paramView.findViewById(R.id.sbT81));
        sbT82 = ((SeekBar) paramView.findViewById(R.id.sbT82));

        sbvT81 = ((TextView) paramView.findViewById(R.id.sbvT81));
        sbvT82 = ((TextView) paramView.findViewById(R.id.sbvT82));

        sbT81.setMax(100);
        sbT81.setProgress(50);
        sbT82.setMax(100);
        sbT82.setProgress(50);

        sbvT81.setText(progressChanged_81 + "% likelihood");
        sbvT82.setText(progressChanged_82 + "% likelihood");
    }

    private void listeners() {
        sbT81.setOnSeekBarChangeListener(l);
        sbT82.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setT81(progressChanged_81 + "%");
        Answers.setT82(progressChanged_82 + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t13, paramViewGroup, false);
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