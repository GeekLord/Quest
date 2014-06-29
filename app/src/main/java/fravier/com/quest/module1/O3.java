package fravier.com.quest.module1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;

import fravier.com.fravier.com.results.Answers;
import fravier.com.quest.R;


public class O3 extends Fragment {

    Context ctx;
    RadioGroup O16;
    EditText O17;
    EditText O18;
    RadioGroup O19;

    RadioGroup.OnCheckedChangeListener changeListener = new RadioGroup.OnCheckedChangeListener() {
        public void onCheckedChanged(RadioGroup group, int v) {
            switch (group.getId()) {

                case R.id.rdgO16:
                    Answers.setO16(O16.indexOfChild(O16.findViewById(O16.getCheckedRadioButtonId())) + "");
                    break;
                case R.id.rdgO19:
                    Answers.setO19(O19.indexOfChild(O19.findViewById(O19.getCheckedRadioButtonId())) + "");
                    break;
            }
        }
    };

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
        View v = inflater.inflate(R.layout.fragment_o3, container, false);
        initViews(v);
        listeners();
        savePageData();

        return v;
    }

    public void setUserVisibleHint(boolean paramBoolean) {

        super.setUserVisibleHint(paramBoolean);
        try {
            savePageData();

        } catch (NullPointerException e) {
        }
    }

    private void initViews(View paramView) {
        O17 = ((EditText) paramView.findViewById(R.id.txtO17));
        O18 = ((EditText) paramView.findViewById(R.id.txtO18));
        O16 = ((RadioGroup) paramView.findViewById(R.id.rdgO16));
        O19 = ((RadioGroup) paramView.findViewById(R.id.rdgO19));
    }

    private void listeners() {
        O16.setOnCheckedChangeListener(changeListener);
        O19.setOnCheckedChangeListener(changeListener);
    }

    private void savePageData() {
        Answers.setO17(O17.getText().toString().trim());
        Answers.setO18(O18.getText().toString().trim());
        Answers.setO16(O16.indexOfChild(O16.findViewById(O16.getCheckedRadioButtonId())) + "");
        Answers.setO19(O19.indexOfChild(O19.findViewById(O19.getCheckedRadioButtonId())) + "");
    }


}
