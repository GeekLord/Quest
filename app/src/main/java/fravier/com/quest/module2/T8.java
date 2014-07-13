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


public class T8 extends Fragment {
    public int progressChanged_b = 0;
    public int progressChanged_c = 0;
    public int progressChanged_d = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {
                default:
                    return;
                case R.id.sbT415a:
                    progressChanged_b = paramAnonymousInt;
                    sbvT415a.setText(progressChanged_b + "% likelihood");
                    T415aa.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T415aa.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T415ab.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T415ab.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT415b:
                    progressChanged_c = paramAnonymousInt;
                    sbvT415b.setText(progressChanged_c + "% likelihood");
                    T415ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T415ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T415bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T415bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbT415c:
                    progressChanged_d = paramAnonymousInt;
                    sbvT415c.setText(progressChanged_d + "% likelihood");
                    T415ca.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T415ca.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    T415cb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    T415cb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {
                case R.id.sbT415a:
                    Answers.setT415a(progressChanged_b + "%");
                    return;
                case R.id.sbT415b:
                    Answers.setT415b(progressChanged_c + "%");
                    return;
                case R.id.sbT415c:
                    Answers.setT415c(progressChanged_d + "%");
                    return;
            }

        }
    };
    TextView sbvT415a;
    TextView sbvT415b;
    TextView sbvT415c;
    ImageView T415aa;
    ImageView T415ab;
    ImageView T415ba;
    ImageView T415bb;
    ImageView T415ca;
    ImageView T415cb;
    Context ctx;
    TextView lbl;
    SeekBar sbT415aa;
    SeekBar sbT415ba;
    SeekBar sbT415ca;

    public void setToZero() {
        T415aa.setScaleX(1.0F + (50) / 100.0F);
        T415aa.setScaleY(1.0F + (50) / 100.0F);
        T415ab.setScaleX(1.0F + (-50) / 100.0F);
        T415ab.setScaleY(1.0F + (-50) / 100.0F);

        T415ba.setScaleX(1.0F + (50) / 100.0F);
        T415ba.setScaleY(1.0F + (50) / 100.0F);
        T415bb.setScaleX(1.0F + (-50) / 100.0F);
        T415bb.setScaleY(1.0F + (-50) / 100.0F);

        T415ca.setScaleX(1.0F + (50) / 100.0F);
        T415ca.setScaleY(1.0F + (50) / 100.0F);
        T415cb.setScaleX(1.0F + (-50) / 100.0F);
        T415cb.setScaleY(1.0F + (-50) / 100.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblT415a));
        T415aa = ((ImageView) paramView.findViewById(R.id.imgT415aa));
        T415ab = ((ImageView) paramView.findViewById(R.id.imgT415ab));
        T415ba = ((ImageView) paramView.findViewById(R.id.imgT415ba));
        T415bb = ((ImageView) paramView.findViewById(R.id.imgT415bb));
        T415ca = ((ImageView) paramView.findViewById(R.id.imgT415ca));
        T415cb = ((ImageView) paramView.findViewById(R.id.imgT415cb));

        sbT415aa = ((SeekBar) paramView.findViewById(R.id.sbT415a));
        sbT415ba = ((SeekBar) paramView.findViewById(R.id.sbT415b));
        sbT415ca = ((SeekBar) paramView.findViewById(R.id.sbT415c));

        sbvT415a = ((TextView) paramView.findViewById(R.id.sbvT415a));
        sbvT415b = ((TextView) paramView.findViewById(R.id.sbvT415b));
        sbvT415c = ((TextView) paramView.findViewById(R.id.sbvT415c));


        setToZero();

        sbT415aa.setMax(100);
        sbT415aa.setProgress(0);
        sbT415ba.setMax(100);
        sbT415ba.setProgress(0);
        sbT415ca.setMax(100);
        sbT415ca.setProgress(0);

        sbvT415a.setText(progressChanged_b + "% likelihood");
        sbvT415b.setText(progressChanged_c + "% likelihood");
        sbvT415c.setText(progressChanged_d + "% likelihood");
    }

    private void listeners() {
        sbT415aa.setOnSeekBarChangeListener(l);
        sbT415ba.setOnSeekBarChangeListener(l);
        sbT415ca.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setT415a(progressChanged_b + "%");
        Answers.setT415b(progressChanged_c + "%");
        Answers.setT415c(progressChanged_d + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_t8, paramViewGroup, false);
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

