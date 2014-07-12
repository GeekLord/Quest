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


public class O20 extends Fragment {
    public static int progressChanged_b = 0;
    public static int progressChanged_c = 0;
    public static int progressChanged_d = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {
                default:
                    return;
                case R.id.sbO415a:
                    progressChanged_b = paramAnonymousInt;
                    sbvO415a.setText(progressChanged_b + "% likelihood");
                    O415aa.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O415aa.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O415ab.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O415ab.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO415b:
                    progressChanged_c = paramAnonymousInt;
                    sbvO415b.setText(progressChanged_c + "% likelihood");
                    O415ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O415ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O415bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O415bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO415c:
                    progressChanged_d = paramAnonymousInt;
                    sbvO415c.setText(progressChanged_d + "% likelihood");
                    O415ca.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O415ca.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O415cb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O415cb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {
                case R.id.sbO415a:
                    Answers.setO415a(progressChanged_b + "%");
                    return;
                case R.id.sbO415b:
                    Answers.setO415b(progressChanged_c + "%");
                    return;
                case R.id.sbO415c:
                    Answers.setO415c(progressChanged_d + "%");
                    return;
            }

        }
    };
    TextView sbvO415a;
    TextView sbvO415b;
    TextView sbvO415c;
    ImageView O415aa;
    ImageView O415ab;
    ImageView O415ba;
    ImageView O415bb;
    ImageView O415ca;
    ImageView O415cb;
    Context ctx;
    TextView lbl;
    SeekBar sbO415aa;
    SeekBar sbO415ba;
    SeekBar sbO415ca;

    public void setToZero() {
        O415aa.setScaleX(1.0F + (50) / 100.0F);
        O415aa.setScaleY(1.0F + (50) / 100.0F);
        O415ab.setScaleX(1.0F + (-50) / 100.0F);
        O415ab.setScaleY(1.0F + (-50) / 100.0F);

        O415ba.setScaleX(1.0F + (50) / 100.0F);
        O415ba.setScaleY(1.0F + (50) / 100.0F);
        O415bb.setScaleX(1.0F + (-50) / 100.0F);
        O415bb.setScaleY(1.0F + (-50) / 100.0F);

        O415ca.setScaleX(1.0F + (50) / 100.0F);
        O415ca.setScaleY(1.0F + (50) / 100.0F);
        O415cb.setScaleX(1.0F + (-50) / 100.0F);
        O415cb.setScaleY(1.0F + (-50) / 100.0F);
    }


    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO415a));
        O415aa = ((ImageView) paramView.findViewById(R.id.imgO415aa));
        O415ab = ((ImageView) paramView.findViewById(R.id.imgO415ab));
        O415ba = ((ImageView) paramView.findViewById(R.id.imgO415ba));
        O415bb = ((ImageView) paramView.findViewById(R.id.imgO415bb));
        O415ca = ((ImageView) paramView.findViewById(R.id.imgO415ca));
        O415cb = ((ImageView) paramView.findViewById(R.id.imgO415cb));

        sbO415aa = ((SeekBar) paramView.findViewById(R.id.sbO415a));
        sbO415ba = ((SeekBar) paramView.findViewById(R.id.sbO415b));
        sbO415ca = ((SeekBar) paramView.findViewById(R.id.sbO415c));

        sbvO415a = ((TextView) paramView.findViewById(R.id.sbvO415a));
        sbvO415b = ((TextView) paramView.findViewById(R.id.sbvO415b));
        sbvO415c = ((TextView) paramView.findViewById(R.id.sbvO415c));

        setToZero();

        sbO415aa.setMax(100);
        sbO415aa.setProgress(0);
        sbO415ba.setMax(100);
        sbO415ba.setProgress(0);
        sbO415ca.setMax(100);
        sbO415ca.setProgress(0);

        sbvO415a.setText(progressChanged_b + "% likelihood");
        sbvO415b.setText(progressChanged_c + "% likelihood");
        sbvO415c.setText(progressChanged_d + "% likelihood");
    }

    private void listeners() {
        sbO415aa.setOnSeekBarChangeListener(l);
        sbO415ba.setOnSeekBarChangeListener(l);
        sbO415ca.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setO415a(progressChanged_b + "%");
        Answers.setO415b(progressChanged_c + "%");
        Answers.setO415c(progressChanged_d + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o20, paramViewGroup, false);
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

