package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O4 extends Fragment {

    EditText O0110;
    Context ctx;
    TextView lbl;

    private void initView(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO110));
        O0110 = ((EditText) paramView.findViewById(R.id.txtO110));
    }

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_o4, container, false);
        initView(v);
        fonting();
        savePageData();

        return v;
    }

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    public void savePageData() {
        Answers.setO110(O0110.getText().toString().trim());
    }

    public void setUserVisibleHint(boolean paramBoolean) {

        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {

        }
    }

}
