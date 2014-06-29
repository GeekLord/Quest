package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O11 extends Fragment {
    Button O31aa;
    Button O31ab;
    Button O31ba;
    Button O31bb;
    Button O31ca;
    Button O31cb;
    Button O31da;
    Button O31db;
    Context ctx;
    View.OnClickListener l = new View.OnClickListener() {
        public void onClick(View paramAnonymousView) {
            switch (paramAnonymousView.getId()) {

                case R.id.btbO31aa:
                    Answers.setO31a("A");
                    return;
                case R.id.btbO31ab:
                    Answers.setO31a("B");
                    return;
                case R.id.btbO31ba:
                    Answers.setO31b("A");
                    return;
                case R.id.btbO31bb:
                    Answers.setO31b("B");
                    return;
                case R.id.btbO31ca:
                    Answers.setO31c("A");
                    return;
                case R.id.btbO31cb:
                    Answers.setO31c("B");
                    return;
                case R.id.btbO31da:
                    Answers.setO31d("A");
                    return;
                case R.id.btbO31db:
                    Answers.setO31c("B");
                    return;
            }

        }
    };
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO31));
        O31aa = ((Button) paramView.findViewById(R.id.btbO31aa));
        O31ab = ((Button) paramView.findViewById(R.id.btbO31ab));
        O31ba = ((Button) paramView.findViewById(R.id.btbO31ba));
        O31bb = ((Button) paramView.findViewById(R.id.btbO31bb));
        O31ca = ((Button) paramView.findViewById(R.id.btbO31ca));
        O31cb = ((Button) paramView.findViewById(R.id.btbO31cb));
        O31da = ((Button) paramView.findViewById(R.id.btbO31da));
        O31db = ((Button) paramView.findViewById(R.id.btbO31db));
    }

    private void listeners() {
        O31aa.setOnClickListener(l);
        O31ab.setOnClickListener(l);
        O31ba.setOnClickListener(l);
        O31bb.setOnClickListener(l);
        O31ca.setOnClickListener(l);
        O31cb.setOnClickListener(l);
        O31da.setOnClickListener(l);
        O31db.setOnClickListener(l);
    }

    private void savePageData() {
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

    public void setUserVisibleHint(boolean paramBoolean) {
        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_o11, container, false);
        initViews(v);
        fonting();
        listeners();
        savePageData();
        return v;
    }


}
