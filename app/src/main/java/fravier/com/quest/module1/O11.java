package fravier.com.quest.module1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import fravier.com.fravier.com.results.Answers;
import fravier.com.global.Fonting;
import fravier.com.quest.R;


public class O11 extends Fragment {
    public static boolean response;
    Button O31aa;
    Button O31ab;
    Button O31ba;
    Button O31bb;
    Button O31ca;
    Button O31cb;
    Button O31da;
    Button O31db;
    Context ctx;
    AlertDialog.Builder adb;
    View.OnClickListener l = new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.btbO31aa:
                    rd31ax.setChecked(true);
                    rd31ay.setChecked(false);
                    Answers.setO31a("A");

                    return;
                case R.id.btbO31ab:
                    rd31ax.setChecked(false);
                    rd31ay.setChecked(true);
                    Answers.setO31a("B");
                    adb = new AlertDialog.Builder(ctx);
                    adb.setMessage("Kindly make sure that the respondent has understood the question");
                    adb.setCancelable(true);
                    adb.setTitle("Answer confirmation");

                    adb.setNegativeButton("OK", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface arg0, int arg1) {
                            arg0.cancel();
                        }

                    });


                    adb.show();
                    return;
                case R.id.btbO31ba:

                    if (Answers.getO31b().trim().length() == 0) {
                        rd31bx.setChecked(true);
                        rd31by.setChecked(false);
                        Answers.setO31b("A");
                    } else if (Answers.getO31b().equals("B")) {
                        adb = new AlertDialog.Builder(ctx);
                        adb.setMessage("Are you sure you would like to change the answer ?");
                        adb.setCancelable(true);
                        adb.setTitle("Answer confirmation");
                        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                            }
                        });
                        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                                rd31bx.setChecked(true);
                                rd31by.setChecked(false);
                                Answers.setO31b("A");
                            }
                        });
                        adb.show();
                    }

                    return;
                case R.id.btbO31bb:
                    if (Answers.getO31b().trim().length() == 0) {
                        rd31bx.setChecked(false);
                        rd31by.setChecked(true);
                        Answers.setO31b("B");
                    } else if (Answers.getO31b().equals("A")) {
                        adb = new AlertDialog.Builder(ctx);
                        adb.setMessage("Are you sure you would like to change the answer ?");
                        adb.setCancelable(true);
                        adb.setTitle("Answer confirmation");
                        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                            }
                        });
                        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                                rd31bx.setChecked(false);
                                rd31by.setChecked(true);
                                Answers.setO31b("B");
                            }
                        });
                        adb.show();
                    }

                    return;
                case R.id.btbO31ca:


                    if (Answers.getO31c().trim().length() == 0) {
                        rd31cx.setChecked(true);
                        rd31cy.setChecked(false);
                        Answers.setO31c("A");
                    } else if (Answers.getO31c().equals("B")) {
                        adb = new AlertDialog.Builder(ctx);
                        adb.setMessage("Are you sure you would like to change the answer ?");
                        adb.setCancelable(true);
                        adb.setTitle("Answer confirmation");
                        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                            }
                        });
                        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                                rd31cx.setChecked(true);
                                rd31cy.setChecked(false);
                                Answers.setO31c("A");
                            }
                        });
                        adb.show();
                    }
                    return;
                case R.id.btbO31cb:
                    if (Answers.getO31c().trim().length() == 0) {
                        rd31cx.setChecked(false);
                        rd31cy.setChecked(true);
                        Answers.setO31c("B");
                    } else if (Answers.getO31c().equals("A")) {
                        adb = new AlertDialog.Builder(ctx);
                        adb.setMessage("Are you sure you would like to change the answer ?");
                        adb.setCancelable(true);
                        adb.setTitle("Answer confirmation");
                        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                            }
                        });
                        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                                rd31cx.setChecked(false);
                                rd31cy.setChecked(true);
                                Answers.setO31c("B");
                            }
                        });
                        adb.show();
                    }

                    return;
                case R.id.btbO31da:
                    if (Answers.getO31d().trim().length() == 0) {
                        rd31dx.setChecked(true);
                        rd31dy.setChecked(false);
                        Answers.setO31d("A");
                    } else if (Answers.getO31d().equals("B")) {
                        adb = new AlertDialog.Builder(ctx);
                        adb.setMessage("Are you sure you would like to change the answer ?");
                        adb.setCancelable(true);
                        adb.setTitle("Answer confirmation");
                        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                            }
                        });
                        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                                rd31dx.setChecked(true);
                                rd31dy.setChecked(false);
                                Answers.setO31d("A");
                            }
                        });
                        adb.show();
                    }
                    return;
                case R.id.btbO31db:
                    if (Answers.getO31d().trim().length() == 0) {
                        rd31dx.setChecked(false);
                        rd31dy.setChecked(true);
                        Answers.setO31d("B");
                    } else if (Answers.getO31d().equals("A")) {
                        adb = new AlertDialog.Builder(ctx);
                        adb.setMessage("Are you sure you would like to change the answer ?");
                        adb.setCancelable(true);
                        adb.setTitle("Answer confirmation");
                        adb.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                            }
                        });
                        adb.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                arg0.cancel();
                                rd31dx.setChecked(false);
                                rd31dy.setChecked(true);
                                Answers.setO31d("B");
                            }
                        });
                        adb.show();
                    }

                    return;
            }
        }


    };
    RadioButton rd31ax, rd31ay;
    RadioButton rd31bx, rd31by;
    RadioButton rd31cx, rd31cy;
    RadioButton rd31dx, rd31dy;
    TextView lbl;

    public boolean confirmAns() {
        return response;

    }

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

        rd31ax = (RadioButton) paramView.findViewById(R.id.rd31ax);
        rd31ay = (RadioButton) paramView.findViewById(R.id.rd31ay);

        rd31bx = (RadioButton) paramView.findViewById(R.id.rd31bx);
        rd31by = (RadioButton) paramView.findViewById(R.id.rd31by);

        rd31cx = (RadioButton) paramView.findViewById(R.id.rd31cx);
        rd31cy = (RadioButton) paramView.findViewById(R.id.rd31cy);

        rd31dx = (RadioButton) paramView.findViewById(R.id.rd31dx);
        rd31dy = (RadioButton) paramView.findViewById(R.id.rd31dy);


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
