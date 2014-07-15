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

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnO32aa:
                    Answers.setO32a("A");
                    rd32ax.setChecked(true);
                    rd32ay.setChecked(false);
                    return;
                case R.id.btnO32ab:
                    Answers.setO32a("B");
                    rd32ax.setChecked(false);
                    rd32ay.setChecked(true);

                    AlertDialog.Builder adb = new AlertDialog.Builder(ctx);
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
//                case R.id.btnO32ba:
//                    Answers.setO32b("A");
//                    rd32bx.setChecked(true);
//                    rd32by.setChecked(false);
//                    return;
//                case R.id.btnO32bb:
//                    Answers.setO32b("B");
//                    rd32bx.setChecked(false);
//                    rd32by.setChecked(true);
//                    return;
//                case R.id.btnO32ca:
//                    Answers.setO32c("A");
//                    rd32cx.setChecked(true);
//                    rd32cy.setChecked(false);
//                    return;
//                case R.id.btnO32cb:
//                    Answers.setO32c("B");
//                    rd32cx.setChecked(false);
//                    rd32cy.setChecked(true);
//                    return;
//                case R.id.btnO32da:
//                    Answers.setO32d("A");
//                    rd32dx.setChecked(true);
//                    rd32dy.setChecked(false);
//                    return;
//                case R.id.btnO32db:
//                    Answers.setO32d("B");
//                    rd32dx.setChecked(false);
//                    rd32dy.setChecked(true);
//                    return;
                case R.id.btnO32ba:

                    if (Answers.getO32b().trim().length() == 0) {
                        rd32bx.setChecked(true);
                        rd32by.setChecked(false);
                        Answers.setO32b("A");
                    } else if (Answers.getO32b().equals("B")) {
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
                                rd32bx.setChecked(true);
                                rd32by.setChecked(false);
                                Answers.setO32b("A");
                            }
                        });
                        adb.show();
                    }

                    return;
                case R.id.btnO32bb:
                    if (Answers.getO32b().trim().length() == 0) {
                        rd32bx.setChecked(false);
                        rd32by.setChecked(true);
                        Answers.setO32b("B");
                    } else if (Answers.getO32b().equals("A")) {
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
                                rd32bx.setChecked(false);
                                rd32by.setChecked(true);
                                Answers.setO32b("B");
                            }
                        });
                        adb.show();
                    }

                    return;
                case R.id.btnO32ca:


                    if (Answers.getO32c().trim().length() == 0) {
                        rd32cx.setChecked(true);
                        rd32cy.setChecked(false);
                        Answers.setO32c("A");
                    } else if (Answers.getO32c().equals("B")) {
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
                                rd32cx.setChecked(true);
                                rd32cy.setChecked(false);
                                Answers.setO32c("A");
                            }
                        });
                        adb.show();
                    }
                    return;
                case R.id.btnO32cb:
                    if (Answers.getO32c().trim().length() == 0) {
                        rd32cx.setChecked(false);
                        rd32cy.setChecked(true);
                        Answers.setO32c("B");
                    } else if (Answers.getO32c().equals("A")) {
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
                                rd32cx.setChecked(false);
                                rd32cy.setChecked(true);
                                Answers.setO32c("B");
                            }
                        });
                        adb.show();
                    }

                    return;
                case R.id.btnO32da:
                    if (Answers.getO32d().trim().length() == 0) {
                        rd32dx.setChecked(true);
                        rd32dy.setChecked(false);
                        Answers.setO32d("A");
                    } else if (Answers.getO32d().equals("B")) {
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
                                rd32dx.setChecked(true);
                                rd32dy.setChecked(false);
                                Answers.setO32d("A");
                            }
                        });
                        adb.show();
                    }
                    return;
                case R.id.btnO32db:
                    if (Answers.getO32d().trim().length() == 0) {
                        rd32dx.setChecked(false);
                        rd32dy.setChecked(true);
                        Answers.setO32d("B");
                    } else if (Answers.getO32d().equals("A")) {
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
                                rd32dx.setChecked(false);
                                rd32dy.setChecked(true);
                                Answers.setO32d("B");
                            }
                        });
                        adb.show();
                    }
                case R.id.btnO32ea:
                    if (Answers.getO32e().trim().length() == 0) {
                        rd32ex.setChecked(true);
                        rd32ey.setChecked(false);
                        Answers.setO32e("A");
                    } else if (Answers.getO32e().equals("B")) {
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
                                rd32ex.setChecked(true);
                                rd32ey.setChecked(false);
                                Answers.setO32e("A");
                            }
                        });
                        adb.show();
                    }
                    return;
                case R.id.btnO32eb:
                    if (Answers.getO32e().trim().length() == 0) {
                        rd32ex.setChecked(false);
                        rd32ey.setChecked(true);
                        Answers.setO32e("B");
                    } else if (Answers.getO32e().equals("A")) {
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
                                rd32ex.setChecked(false);
                                rd32ey.setChecked(true);
                                Answers.setO32e("B");
                            }
                        });
                        adb.show();
                    }

                    return;
            }


        }
    };
    RadioButton rd32ax, rd32ay;
    RadioButton rd32bx, rd32by;
    RadioButton rd32cx, rd32cy;
    RadioButton rd32dx, rd32dy;
    RadioButton rd32ex, rd32ey;
    TextView lbl;

    private void fonting() {
        Fonting.setTypeFaceForViewGroup((ViewGroup) lbl.getRootView(), ctx, Fonting.KEY_REGULAR);
    }

    private void initViews(View paramView) {
        lbl = ((TextView) paramView.findViewById(R.id.lblO32));
        O32aa = ((Button) paramView.findViewById(R.id.btnO32aa));
        O32ab = ((Button) paramView.findViewById(R.id.btnO32ab));
        O32ba = ((Button) paramView.findViewById(R.id.btnO32ba));
        O32bb = ((Button) paramView.findViewById(R.id.btnO32bb));
        O32ca = ((Button) paramView.findViewById(R.id.btnO32ca));
        O32cb = ((Button) paramView.findViewById(R.id.btnO32cb));
        O32da = ((Button) paramView.findViewById(R.id.btnO32da));
        O32db = ((Button) paramView.findViewById(R.id.btnO32db));
        O32ea = ((Button) paramView.findViewById(R.id.btnO32ea));
        O32eb = ((Button) paramView.findViewById(R.id.btnO32eb));

        rd32ax = (RadioButton) paramView.findViewById(R.id.rd32ax);
        rd32ay = (RadioButton) paramView.findViewById(R.id.rd32ay);

        rd32bx = (RadioButton) paramView.findViewById(R.id.rd32bx);
        rd32by = (RadioButton) paramView.findViewById(R.id.rd32by);

        rd32cx = (RadioButton) paramView.findViewById(R.id.rd32cx);
        rd32cy = (RadioButton) paramView.findViewById(R.id.rd32cy);

        rd32dx = (RadioButton) paramView.findViewById(R.id.rd32dx);
        rd32dy = (RadioButton) paramView.findViewById(R.id.rd32dy);

        rd32ex = (RadioButton) paramView.findViewById(R.id.rd32ex);
        rd32ey = (RadioButton) paramView.findViewById(R.id.rd32ey);
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
        initViews(v);
        fonting();
        listeners();
        savePageData();
        return v;
    }

}
