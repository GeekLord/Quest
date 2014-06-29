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


public class O12 extends Fragment {
    Button O32aa;
    Button O32ab;
    Button O32ba;
    Button O32bb;
    Button O32ca;
    Button O32cb;
    Button O32da;
    Button O32db;
    Button O32ea;
    Button O32eb;
    Context ctx;
    View.OnClickListener l = new View.OnClickListener() {
        public void onClick(View paramAnonymousView) {
            switch (paramAnonymousView.getId()) {
                case R.id.btnO32aa:
                    Answers.setO32a("A");
                    return;
                case R.id.btnO32ab:
                    Answers.setO32a("B");
                    return;
                case R.id.btnO32ba:
                    Answers.setO32b("A");
                    return;
                case R.id.btnO32bb:
                    Answers.setO32b("B");
                    return;
                case R.id.btnO32ca:
                    Answers.setO32c("A");
                    return;
                case R.id.btnO32cb:
                    Answers.setO32c("B");
                    return;
                case R.id.btnO32da:
                    Answers.setO32d("A");
                    return;
                case R.id.btnO32db:
                    Answers.setO32d("B");
                    return;
                case R.id.btnO32ea:
                    Answers.setO32e("A");
                    return;
                case R.id.btnO32eb:
                    Answers.setO32e("B");
                    return;
            }

        }
    };
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO32));
        O32aa = ((Button) paramView.findViewById(R.id.btnO32aa));
        O32ab = ((Button) paramView.findViewById(R.id.btnO32ab));
        O32ba = ((Button) paramView.findViewById(R.id.btnO32ba));
        O32bb = ((Button) paramView.findViewById(R.id.btnO32ab));
        O32ca = ((Button) paramView.findViewById(R.id.btnO32ca));
        O32cb = ((Button) paramView.findViewById(R.id.btnO32cb));
        O32da = ((Button) paramView.findViewById(R.id.btnO32da));
        O32db = ((Button) paramView.findViewById(R.id.btnO32db));
        O32ea = ((Button) paramView.findViewById(R.id.btnO32ea));
        O32eb = ((Button) paramView.findViewById(R.id.btnO32eb));
    }

    private void listeners() {
        O32aa.setOnClickListener(l);
        O32ab.setOnClickListener(l);
        O32ba.setOnClickListener(l);
        O32bb.setOnClickListener(l);
        O32ca.setOnClickListener(l);
        O32cb.setOnClickListener(l);
        O32da.setOnClickListener(l);
        O32db.setOnClickListener(l);
        O32ea.setOnClickListener(l);
        O32eb.setOnClickListener(l);
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ctx = container.getContext();
        View v = inflater.inflate(R.layout.fragment_o12, container, false);

        return v;
    }

}
