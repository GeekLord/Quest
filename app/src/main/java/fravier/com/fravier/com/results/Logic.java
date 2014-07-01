package fravier.com.fravier.com.results;

/**
 * Created by francis on 6/29/2014.
 */

import android.content.Context;

public class Logic {
    Context ctx;

    public Logic(Context c) {
        ctx = c;
    }

    public int ALU(String qn, String ans, int els) {
        if (qn.equals("O11")) {
            if (ans.equals("0")) {
                return Addressing("O16");
            }

        } else if (qn.equals("O19")) {
            if (ans.equals("0") || ans.equals("3") || ans.equals("4")) {
                return Addressing("O111");
            } else {
                return els + 1;
            }

        } else if (qn.equals("O21")) {
            if (ans.equals("1")) {
                return Addressing("O27");
            } else {
                return els + 1;
            }


        } else if (qn.equals("O22")) {
            if (ans.equals("1")) {
                return Addressing("O24");
            } else if (ans.equals("2")) {
                return Addressing("O27");
            } else {
                return els + 1;
            }


        } else if (qn.equals("O24")) {
            if (ans.equals("0") || ans.equals("2")) {
                return Addressing("O26");
            } else {
                return els + 1;
            }

        } else if (qn.equals("O49")) {
            if (ans.equals("1") || ans.equals("2")) {
                return Addressing("O413");
            }


        } else if (qn.equals("O413")) {
            if (ans.equals("0")) {
                return Addressing("O414a");
            } else if (ans.equals("1")) {
                return Addressing("O415a");
            } else {
                return els + 1;
            }

        } else if (qn.equals("O51")) {
            if (ans.equals("1")) {
                return Addressing("O61");
            }
        } else if (qn.equals("O65")) {
            if (ans.equals("1")) {
                return Addressing("O67");
            }
            //for module two
        } else if (qn.equals("T49")) {
            if (ans.equals("1") || ans.equals("2")) {
                return Addressing("T413");
            }
        } else if (qn.equals("T413")) {
            if (ans.equals("0")) {
                return Addressing("T414a");
            } else if (ans.equals("1")) {
                return Addressing("T415a");
            } else {
                return els + 1;
            }
        } else if (qn.equals("T51")) {
            if (ans.equals("1")) {
                return Addressing("T71");
            } else {
                return els + 1;
            }
        } else if (qn.equals("T71")) {
            if (ans.equals("0")) {
                return Addressing("T91");
            } else {
                return els + 1;
            }
        }
        return els + 1;
    }

    public int Addressing(String qn) {
//        if (qn.equals("O16")) {
//            return 1;
//        } else if (qn.equals("O111")) {
//            return 4;
//        } else if (qn.equals("O24")) {
//            return 9;
//        } else if (qn.equals("O26")) {
//            return 10;
//        } else if (qn.equals("O27")) {
//            return 11;
//        } else if (qn.equals("O413")) {
//            return 20;
//        } else if (qn.equals("O414a")) {
//            return 21;
//        } else if (qn.equals("O415a")) {
//            return 22;
//        } else if (qn.equals("O61")) {
//            return 25;
//        } else if (qn.equals("O67")) {
//            return 26;
//        } else {
//            return 0;
//        }
        if (qn.equals("O16")) {
            return 3;
        } else if (qn.equals("O24")) {

            return 9;
        } else if (qn.equals("O26")) {

            return 11;
        } else if (qn.equals("O27")) {

            return 12;
        } else if (qn.equals("O413")) {

            return 23;
        } else if (qn.equals("O414a")) {
            return 24;

        } else if (qn.equals("O415a")) {
            return 25;

        } else if (qn.equals("O61")) {
            return 28;

        } else if (qn.equals("O67")) {

            return 31;
        } else if (qn.equals("T413")) {

            return 6;
        } else if (qn.equals("T414a")) {

            return 7;
        } else if (qn.equals("T415a")) {

            return 8;
        } else if (qn.equals("T71")) {

            return 11;
        } else if (qn.equals("T91")) {

            return 14;
        } else if (qn.equals("O111")) {
            return 5;
        }

        return 0;
    }
}

