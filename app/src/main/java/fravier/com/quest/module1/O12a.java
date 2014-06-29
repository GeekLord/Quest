package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O12a extends Fragment {
    Context ctx;
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) this.lbl.getRootView(), this.ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        this.lbl = ((TextView) paramView.findViewById(R.id.lblO31a));
    }

    private void listeners() {
    }


    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_o12a, container, false);
        initViews(v);
        fonting();
        return v;
    }

}
