package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import fravier.com.fravier.com.results.Exporting;
import fravier.com.global.Fonting;
import fravier.com.quest.Dashboard;
import fravier.com.quest.R;


public class Finish1 extends Fragment {

    Button btn;
    Context ctx;
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) btn.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {

        btn = ((Button) paramView.findViewById(R.id.btOSave));
    }

    private void listeners() {
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View paramAnonymousView) {
                new Exporting().toCSC();
                Toast.makeText(ctx, "Questionnaire saved.", Toast.LENGTH_LONG).show();
                Intent localIntent = new Intent(ctx, Dashboard.class);
                startActivity(localIntent);
            }
        });
    }

    public void onAttach(Activity paramActivity) {
        super.onAttach(paramActivity);
    }

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
    }

    public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
        ctx = paramViewGroup.getContext();
        View localView = paramLayoutInflater.inflate(R.layout.fragment_finish1, paramViewGroup, false);
        initViews(localView);
        fonting();
        listeners();
        return localView;
    }


}
