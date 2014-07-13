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


public class O14 extends Fragment {
    public int progressChanged_41 = 0;
    public int progressChanged_42 = 0;
    public int progressChanged_43 = 0;
    public int progressChanged_44a = 0;
    public int progressChanged_44b = 0;
    public int progressChanged_44c = 0;
    public int progressChanged_45a = 0;
    public int progressChanged_45b = 0;
    SeekBar.OnSeekBarChangeListener l = new SeekBar.OnSeekBarChangeListener() {
        public void onProgressChanged(SeekBar paramAnonymousSeekBar, int paramAnonymousInt, boolean paramAnonymousBoolean) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO41:
                    progressChanged_41 = paramAnonymousInt;
                    srvO41.setText(progressChanged_41 + "% likelihood");
                    O41a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O41a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O41b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O41b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO42:
                    progressChanged_42 = paramAnonymousInt;
                    srvO42.setText(progressChanged_42 + "% likelihood");
                    O42a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O42a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O42b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O42b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO43:
                    progressChanged_43 = paramAnonymousInt;
                    srvO43.setText(progressChanged_43 + "% likelihood");
                    O43a.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O43a.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O43b.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O43b.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO44a:
                    progressChanged_44a = paramAnonymousInt;
                    srvO44a.setText(progressChanged_44a + "% likelihood");
                    O44aa.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O44aa.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O44ab.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O44ab.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO44b:
                    progressChanged_44b = paramAnonymousInt;
                    srvO44b.setText(progressChanged_44b + "% likelihood");
                    O44ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O44ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O44bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O44bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO44c:
                    progressChanged_44c = paramAnonymousInt;
                    srvO44c.setText(progressChanged_44c + "% likelihood");
                    O44ca.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O44ca.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O44cb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O44cb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO45a:
                    progressChanged_45a = paramAnonymousInt;
                    srvO45a.setText(progressChanged_45a + "% likelihood");
                    O45aa.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O45aa.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O45ab.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O45ab.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    return;
                case R.id.sbO45b:
                    progressChanged_45b = paramAnonymousInt;
                    srvO45b.setText(progressChanged_45b + "% likelihood");
                    O45ba.setScaleX(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O45ba.setScaleY(1.0F + (50 - paramAnonymousInt) / 100.0F);
                    O45bb.setScaleX(1.0F + (paramAnonymousInt - 50) / 100.0F);
                    O45bb.setScaleY(1.0F + (paramAnonymousInt - 50) / 100.0F);

                    return;
            }

        }

        public void onStartTrackingTouch(SeekBar paramAnonymousSeekBar) {
        }

        public void onStopTrackingTouch(SeekBar paramAnonymousSeekBar) {
            switch (paramAnonymousSeekBar.getId()) {

                case R.id.sbO41:
                    Answers.setO41(progressChanged_41 + "%");
                    return;
                case R.id.sbO42:
                    Answers.setO42(progressChanged_42 + "%");
                    return;
                case R.id.sbO43:
                    Answers.setO43(progressChanged_43 + "%");
                    return;
                case R.id.sbO44a:
                    Answers.setO44a(progressChanged_44a + "%");
                    return;
                case R.id.sbO44b:
                    Answers.setO44b(progressChanged_44b + "%");
                    return;
                case R.id.sbO44c:
                    Answers.setO44c(progressChanged_44c + "%");
                    return;
                case R.id.sbO45a:
                    Answers.setO45a(progressChanged_45a + "%");
                    return;
                case R.id.sbO45b:
                    Answers.setO45b(progressChanged_45b + "%");
                    return;
            }

        }
    };
    ImageView O41a;
    ImageView O41b;
    ImageView O42a;
    ImageView O42b;
    ImageView O43a;
    ImageView O43b;
    ImageView O44aa;
    ImageView O44ab;
    ImageView O44ba;
    ImageView O44bb;
    ImageView O44ca;
    ImageView O44cb;
    ImageView O45aa;
    ImageView O45ab;
    ImageView O45ba;
    ImageView O45bb;
    Context ctx;
    TextView lbl;
    SeekBar sbO41;
    SeekBar sbO42;
    SeekBar sbO43;
    SeekBar sbO44aa;
    SeekBar sbO44ba;
    SeekBar sbO44ca;
    SeekBar sbO45aa;
    SeekBar sbO45ba;
    TextView srvO41;
    TextView srvO42;
    TextView srvO43;
    TextView srvO44a;
    TextView srvO44b;
    TextView srvO44c;
    TextView srvO45a;
    TextView srvO45b;

    public void setToZero() {
        O41a.setScaleX(1.0F + (50) / 100.0F);
        O41a.setScaleY(1.0F + (50) / 100.0F);
        O41b.setScaleX(1.0F + (-50) / 100.0F);
        O41b.setScaleY(1.0F + (-50) / 100.0F);

        O42a.setScaleX(1.0F + (50) / 100.0F);
        O42a.setScaleY(1.0F + (50) / 100.0F);
        O42b.setScaleX(1.0F + (-50) / 100.0F);
        O42b.setScaleY(1.0F + (-50) / 100.0F);

        O43a.setScaleX(1.0F + (50) / 100.0F);
        O43a.setScaleY(1.0F + (50) / 100.0F);
        O43b.setScaleX(1.0F + (-50) / 100.0F);
        O43b.setScaleY(1.0F + (-50) / 100.0F);

        O44aa.setScaleX(1.0F + (50) / 100.0F);
        O44aa.setScaleY(1.0F + (50) / 100.0F);
        O44ab.setScaleX(1.0F + (-50) / 100.0F);
        O44ab.setScaleY(1.0F + (-50) / 100.0F);

        O44ba.setScaleX(1.0F + (50) / 100.0F);
        O44ba.setScaleY(1.0F + (50) / 100.0F);
        O44bb.setScaleX(1.0F + (-50) / 100.0F);
        O44bb.setScaleY(1.0F + (-50) / 100.0F);

        O44ca.setScaleX(1.0F + (50) / 100.0F);
        O44ca.setScaleY(1.0F + (50) / 100.0F);
        O44cb.setScaleX(1.0F + (-50) / 100.0F);
        O44cb.setScaleY(1.0F + (-50) / 100.0F);

        O45aa.setScaleX(1.0F + (50) / 100.0F);
        O45aa.setScaleY(1.0F + (50) / 100.0F);
        O45ab.setScaleX(1.0F + (-50) / 100.0F);
        O45ab.setScaleY(1.0F + (-50) / 100.0F);

        O45ba.setScaleX(1.0F + (50) / 100.0F);
        O45ba.setScaleY(1.0F + (50) / 100.0F);
        O45bb.setScaleX(1.0F + (-50) / 100.0F);
        O45bb.setScaleY(1.0F + (-50) / 100.0F);
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        O41a = ((ImageView) paramView.findViewById(R.id.imgO41a));
        O41b = ((ImageView) paramView.findViewById(R.id.imgO41b));
        O42a = ((ImageView) paramView.findViewById(R.id.imgO42a));
        O42b = ((ImageView) paramView.findViewById(R.id.imgO42b));
        O43a = ((ImageView) paramView.findViewById(R.id.imgO43a));
        O43b = ((ImageView) paramView.findViewById(R.id.imgO43b));
        lbl = ((TextView) paramView.findViewById(R.id.lblO41));
        O44aa = ((ImageView) paramView.findViewById(R.id.imgO44aa));
        O44ab = ((ImageView) paramView.findViewById(R.id.imgO44ab));
        O44ba = ((ImageView) paramView.findViewById(R.id.imgO44ba));
        O44bb = ((ImageView) paramView.findViewById(R.id.imgO44bb));
        O44ca = ((ImageView) paramView.findViewById(R.id.imgO44ca));
        O44cb = ((ImageView) paramView.findViewById(R.id.imgO44cb));
        O45aa = ((ImageView) paramView.findViewById(R.id.imgO45aa));
        O45ab = ((ImageView) paramView.findViewById(R.id.imgO45ab));
        O45ba = ((ImageView) paramView.findViewById(R.id.imgO45ba));
        O45bb = ((ImageView) paramView.findViewById(R.id.imgO45bb));

        sbO41 = ((SeekBar) paramView.findViewById(R.id.sbO41));
        sbO42 = ((SeekBar) paramView.findViewById(R.id.sbO42));
        sbO43 = ((SeekBar) paramView.findViewById(R.id.sbO43));
        sbO44aa = ((SeekBar) paramView.findViewById(R.id.sbO44a));
        sbO44ba = ((SeekBar) paramView.findViewById(R.id.sbO44b));
        sbO44ca = ((SeekBar) paramView.findViewById(R.id.sbO44c));
        sbO45aa = ((SeekBar) paramView.findViewById(R.id.sbO45a));
        sbO45ba = ((SeekBar) paramView.findViewById(R.id.sbO45b));

        srvO41 = ((TextView) paramView.findViewById(R.id.srvO41));
        srvO42 = ((TextView) paramView.findViewById(R.id.srvO42));
        srvO43 = ((TextView) paramView.findViewById(R.id.srvO43));
        srvO44a = ((TextView) paramView.findViewById(R.id.srvO44a));
        srvO44b = ((TextView) paramView.findViewById(R.id.srvO44b));
        srvO44c = ((TextView) paramView.findViewById(R.id.srvO44c));
        srvO45a = ((TextView) paramView.findViewById(R.id.srvO45a));
        srvO45b = ((TextView) paramView.findViewById(R.id.srvO45b));

        setToZero();

        sbO41.setMax(100);
        sbO41.setProgress(0);
        sbO42.setMax(100);
        sbO42.setProgress(0);
        sbO43.setMax(100);
        sbO43.setProgress(0);
        sbO44aa.setMax(100);
        sbO44aa.setProgress(0);
        sbO44ba.setMax(100);
        sbO44ba.setProgress(0);
        sbO44ca.setMax(100);
        sbO44ca.setProgress(0);
        sbO45aa.setMax(100);
        sbO45aa.setProgress(0);
        sbO45ba.setMax(100);
        sbO45ba.setProgress(0);
        srvO41.setText(progressChanged_41 + "% likelihood");
        srvO42.setText(progressChanged_42 + "% likelihood");
        srvO43.setText(progressChanged_43 + "% likelihood");
        srvO44a.setText(progressChanged_44a + "% likelihood");
        srvO44b.setText(progressChanged_44b + "% likelihood");
        srvO44c.setText(progressChanged_44c + "% likelihood");
        srvO45a.setText(progressChanged_45a + "% likelihood");
        srvO45b.setText(progressChanged_45b + "% likelihood");
    }

    private void listeners() {
        sbO41.setOnSeekBarChangeListener(l);
        sbO42.setOnSeekBarChangeListener(l);
        sbO43.setOnSeekBarChangeListener(l);
        sbO44aa.setOnSeekBarChangeListener(l);
        sbO44ba.setOnSeekBarChangeListener(l);
        sbO44ca.setOnSeekBarChangeListener(l);
        sbO45aa.setOnSeekBarChangeListener(l);
        sbO45ba.setOnSeekBarChangeListener(l);
    }

    private void savePageData() {
        Answers.setO41(progressChanged_41 + "%");
        Answers.setO42(progressChanged_42 + "%");
        Answers.setO43(progressChanged_43 + "%");
        Answers.setO44a(progressChanged_44a + "%");
        Answers.setO44b(progressChanged_44b + "%");
        Answers.setO44c(progressChanged_44c + "%");
        Answers.setO45a(progressChanged_45a + "%");
        Answers.setO45b(progressChanged_45b + "%");
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_o14, paramViewGroup, false);
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
