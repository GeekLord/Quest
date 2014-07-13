package fravier.com.fravier.com.results;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import au.com.bytecode.opencsv.CSV;
import au.com.bytecode.opencsv.CSVReadProc;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * Created by francis on 6/29/2014.
 */
public class Exporting {
    public static int rowcount = 0;
    public static int rowcount2 = 0;
    public String[] title;
    public String[] title2;
    Calendar myCalendar = Calendar.getInstance();
    String myFormat_date = "dd-MM-yy";
    SimpleDateFormat sdf_date = new SimpleDateFormat(myFormat_date, Locale.US);
    CSV csv = CSV.separator(',').quote('"').create();
    String date = sdf_date.format(myCalendar.getTime());
    public String folder = "/sdcard/Quest/" + date + "/";


    CSVReader reader = null;
    CSVWriter writer = null;

    public static boolean createDirIfNotExists(String path) {
        boolean ret = true;

        File file = new File(path);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                System.out.println("error creating folder in local");
                ret = false;
            }
        }
        return ret;
    }


    public int getCountofRows()
            throws IOException {
        rowcount = 0;
        try {
            createDirIfNotExists(folder);
            csv.read(folder + "BaselineQuestionnaire.csv", new CSVReadProc() {
                public void procRow(int paramAnonymousInt, String... paramAnonymousVarArgs) {
                    Exporting.rowcount = 1 + Exporting.rowcount;
                }
            });
            int i = rowcount;
            return i;
        } catch (Exception localException) {
            writer = new CSVWriter(new FileWriter(folder + "BaselineQuestionnaire.csv", true), ',');
            writer.writeNext(title);
            writer.close();
        }
        return rowcount;
    }

    public int getCountofRows2()
            throws IOException {
        rowcount2 = 0;
        try {
            createDirIfNotExists(folder);
            csv.read(folder + "FollowUpQuestionnaire.csv", new CSVReadProc() {
                public void procRow(int paramAnonymousInt, String... paramAnonymousVarArgs) {
                    Exporting.rowcount2 = 1 + Exporting.rowcount2;
                }
            });
            int i = rowcount2;
            return i;
        } catch (Exception localException) {
            writer = new CSVWriter(new FileWriter(folder + "FollowUpQuestionnaire.csv", true), ',');
            writer.writeNext(title2);
            writer.close();
        }
        return rowcount2;
    }

    public void toCSC() {
        try {
            title = new String[]{"Q 0.1", "Q 0.2", "Q 0.3", "Q 0.4", "Q 0.5", "Q 0.6", "Q 0.7", "Interview date", "Start time", "Q 1.1", "Q 1.2", "Q 1.3", "Q 1.4", "Q 1.5", "Q 1.6", "Q 1.7", "Q 1.8", "Q 1.9", "Q 1.10", "Q 1.11", "Q 2.1", "Q 2.2", "Q 2.3", "Q 2.4", "Q 2.5", "Q 2.6", "Q 2.7", "Q 2.8", "Q 3.1a", "Q 3.1b", "Q 3.1c", "Q 3.1d", "Q 3.2a", "Q 3.2b", "Q 3.2c", "Q 3.2d", "Q 3.2e", "Q 4.0a", "Q 4.0b", "Q 4.0c", "Q 4.0d", "Q 4.0e", "Q 4.1", "Q 4.2", "Q 4.3", "Q 4.4a", "Q 4.4b", "Q 4.4c", "Q 4.5a", "Q 4.5b", "Q 4.6", "Q 4.7", "Q 4.8", "Q 4.9", "Q 4.10", "Q 4.11", "Q 4.12", "Q 4.13", "Q 4.14a", "Q 4.14b", "Q 4.14c", "Q 4.15a", "Q 4.15b", "Q 4.15c", "Q 5.1", "Q 5.2", "Q 5.3", "Q 5.4", "Q 6.1", "Q 6.2", "Q 6.3", "Q 6.4", "Q 6.5", "Q 6.6", "Q 6.7", "Q 6.8", "Q 6.9", "Q 12.1", "Q 12.2", "End time"};
            String[] arrayOfString = new String[80];
            arrayOfString[0] = StringUtils.replaceEach(Answers.getO01(), new String[]{"0", "1", "-1"}, new String[]{"1", "2", " "});
            arrayOfString[1] = Answers.getO02();
            arrayOfString[2] = Answers.getO03();
            arrayOfString[3] = Answers.getO04();
            arrayOfString[4] = Answers.getO05();
            arrayOfString[5] = Answers.getO06();
            arrayOfString[6] = Answers.getO07();
            arrayOfString[7] = Answers.getO07_day();
            arrayOfString[8] = Answers.getO07_time();
            arrayOfString[9] = StringUtils.replaceEach(Answers.getO11(), new String[]{"0", "1", "-1"}, new String[]{"1", "2", " "});
            arrayOfString[10] = StringUtils.replaceEach(Answers.getO12(), new String[]{"0", "1", "-1"}, new String[]{"1", "2", " "});
            arrayOfString[11] = StringUtils.replaceEach(Answers.getO13(), new String[]{"0", "1", "-1"}, new String[]{"1", "0", " "});
            arrayOfString[12] = Answers.getO14();
            arrayOfString[13] = Answers.getO15();
            arrayOfString[14] = StringUtils.replaceEach(Answers.getO16(), new String[]{"0", "1", "-1"}, new String[]{"1", "0", " "});
            arrayOfString[15] = Answers.getO17();
            arrayOfString[16] = Answers.getO18();
            arrayOfString[17] = StringUtils.replaceEach(Answers.getO19(), new String[]{"4", "-1"}, new String[]{"17", " "});
            arrayOfString[18] = Answers.getO110();
            arrayOfString[19] = StringUtils.replaceEach(Answers.getO111(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "-1"},
                    new String[]{"0", "1", "2", "3", "0", "4", "5", "0", "6", "7", "8", "0", "9", "10", "11", "12", "13", "14", " "});
            arrayOfString[20] = StringUtils.replaceEach(Answers.getO21(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[21] = StringUtils.replaceEach(Answers.getO22(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[22] = StringUtils.replaceEach(Answers.getO23(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[23] = StringUtils.replaceEach(Answers.getO24(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[24] = StringUtils.replaceEach(Answers.getO25(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "-1"}, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " "});
            arrayOfString[25] = StringUtils.replaceEach(Answers.getO26(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[26] = Answers.getO27();
            arrayOfString[27] = StringUtils.replaceEach(Answers.getO28(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[28] = Answers.getO31a();
            arrayOfString[29] = Answers.getO31b();
            arrayOfString[30] = Answers.getO31c();
            arrayOfString[31] = Answers.getO31d();
            arrayOfString[32] = Answers.getO32a();
            arrayOfString[33] = Answers.getO32b();
            arrayOfString[34] = Answers.getO32c();
            arrayOfString[35] = Answers.getO32d();
            arrayOfString[36] = Answers.getO32e();
            arrayOfString[37] = Answers.getO40a();
            arrayOfString[38] = Answers.getO40b();
            arrayOfString[39] = Answers.getO40c();
            arrayOfString[40] = Answers.getO40d();
            arrayOfString[41] = Answers.getO40e();
            arrayOfString[42] = Answers.getO41();
            arrayOfString[43] = Answers.getO42();
            arrayOfString[44] = Answers.getO43();
            arrayOfString[45] = Answers.getO44a();
            arrayOfString[46] = Answers.getO44b();
            arrayOfString[47] = Answers.getO44c();
            arrayOfString[48] = Answers.getO45a();
            arrayOfString[49] = Answers.getO45b();
            arrayOfString[50] = StringUtils.replaceEach(Answers.getO46(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[51] = Answers.getO47();
            arrayOfString[52] = Answers.getO48();
            arrayOfString[53] = StringUtils.replaceEach(Answers.getO49(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[54] = Answers.getO410();
            arrayOfString[55] = Answers.getO411();
            arrayOfString[56] = Answers.getO412();
            arrayOfString[57] = StringUtils.replaceEach(Answers.getO413(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[58] = Answers.getO414a();
            arrayOfString[59] = Answers.getO414b();
            arrayOfString[60] = Answers.getO414c();
            arrayOfString[61] = Answers.getO415a();
            arrayOfString[62] = Answers.getO415b();
            arrayOfString[63] = Answers.getO415c();
            arrayOfString[64] = StringUtils.replaceEach(Answers.getO51(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[65] = StringUtils.replaceEach(Answers.getO52(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[66] = StringUtils.replaceEach(Answers.getO53(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[67] = StringUtils.replaceEach(Answers.getO54(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "99", " "});
            arrayOfString[68] = Answers.getO61();
            arrayOfString[69] = Answers.getO62();
            arrayOfString[70] = Answers.getO63();
            arrayOfString[71] = Answers.getO64();
            arrayOfString[72] = StringUtils.replaceEach(Answers.getO65(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[73] = Answers.getO66();
            arrayOfString[74] = Answers.getO67();
            arrayOfString[75] = Answers.getO68();
            arrayOfString[76] = Answers.getO69();
            arrayOfString[77] = StringUtils.replaceEach(Answers.getO121(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[78] = StringUtils.replaceEach(Answers.getO122(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[79] = Answers.getO12_time_end();
            System.out.println(getCountofRows() + " rows found");
            writer = new CSVWriter(new FileWriter(folder + "BaselineQuestionnaire.csv", true), ',');
            writer.writeNext(arrayOfString);
            writer.close();

        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }

    public void toCSC2() {
        try {
            title2 = new String[]{"Q 0.2", "Q 0.3", "Q 0.3a", "Q 0.3b", "Q 0.3c", "Q 0.3d", "Q 0.4", "Q 0.5", "Q 0.6", "Q 0.7", "Day", "Time", "Q 4.0a", "Q 4.0b", "Q 4.0c", "Q 4.0d", "Q 4.0e", "Q 4.6", "Q 4.7", "Q 4.8", "Q 4.9", "Q 4.10", "Q 4.11", "Q 4.12", "Q 4.13", "Q 4.14a", "Q 4.14b", "Q 4.14c", "Q 4.15a", "Q 4.15b", "Q 4.15c", "Q 5.1", "Q 5.2", "Q 5.3", "Q 5.4", "Q 5.5", "Q 5.6", "Q 7.1", "Q 7.2", "Q 7.3", "Q T81", "Q T82", "Q 9.1", "Q 9.2a", "Q 9.2b", "Q 9.2c", "Q 9.2d", "Q 9.2e", "Q 9.2f", "Q 9.2g", "Q 9.2h", "Q 9.3a", "Q 9.3b", "Q 9.3c", "Q 9.4", "Q 9.5", "Q 9.6", "Q 9.7", "Q 9.8", "Q 9.9", "Q 12.1", "Q 12.2", "End Time"};
            String[] arrayOfString = new String[63];
            arrayOfString[0] = Answers.getT02();
            arrayOfString[1] = Answers.getT03();
            arrayOfString[2] = StringUtils.replaceEach(Answers.getT03a(), new String[]{"0", "1", "-1"}, new String[]{"1", "2", " "});
            arrayOfString[3] = Answers.getT03b();
            arrayOfString[4] = StringUtils.replaceEach(Answers.getT03c(), new String[]{"0", "1", "-1"}, new String[]{"1", "2", " "});
            arrayOfString[5] = StringUtils.replaceEach(Answers.getT03d(), new String[]{"0", "1", "-1"}, new String[]{"1", "2", " "});
            arrayOfString[6] = Answers.getT04();
            arrayOfString[7] = Answers.getT05();
            arrayOfString[8] = Answers.getT06();
            arrayOfString[9] = Answers.getT07();
            arrayOfString[10] = Answers.getT07_day();
            arrayOfString[11] = Answers.getT07_time();
            arrayOfString[12] = Answers.getT40a();
            arrayOfString[13] = Answers.getT40b();
            arrayOfString[14] = Answers.getT40c();
            arrayOfString[15] = Answers.getT40d();
            arrayOfString[16] = Answers.getT40e();
            arrayOfString[17] = StringUtils.replaceEach(Answers.getT46(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[18] = Answers.getT47();
            arrayOfString[19] = StringUtils.replaceEach(Answers.getT48(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[20] = StringUtils.replaceEach(Answers.getT49(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[21] = Answers.getT410();
            arrayOfString[22] = Answers.getT411();
            arrayOfString[23] = Answers.getT412();
            arrayOfString[24] = StringUtils.replaceEach(Answers.getT413(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[25] = Answers.getT414a();
            arrayOfString[26] = Answers.getT414b();
            arrayOfString[27] = Answers.getT414c();
            arrayOfString[28] = Answers.getT415a();
            arrayOfString[29] = Answers.getT415b();
            arrayOfString[30] = Answers.getT415c();
            arrayOfString[31] = StringUtils.replaceEach(Answers.getT51(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[32] = Answers.getT52();
            arrayOfString[33] = StringUtils.replaceEach(Answers.getT53(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[34] = Answers.getT54();
            arrayOfString[35] = Answers.getT55();
            arrayOfString[36] = Answers.getT56();
            arrayOfString[37] = StringUtils.replaceEach(Answers.getT71(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[38] = StringUtils.replaceEach(Answers.getT72(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[39] = StringUtils.replaceEach(Answers.getT73(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[40] = Answers.getT81();
            arrayOfString[41] = Answers.getT82();
            arrayOfString[42] = StringUtils.replaceEach(Answers.getT91(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "-1"}, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", " "});
            arrayOfString[43] = StringUtils.replaceEach(Answers.getT92a(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[44] = StringUtils.replaceEach(Answers.getT92b(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[45] = StringUtils.replaceEach(Answers.getT92c(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[46] = StringUtils.replaceEach(Answers.getT92d(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[47] = StringUtils.replaceEach(Answers.getT92e(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[48] = StringUtils.replaceEach(Answers.getT92f(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[49] = StringUtils.replaceEach(Answers.getT92g(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[50] = StringUtils.replaceEach(Answers.getT92h(), new String[]{"0", "1", "2", "-1"}, new String[]{"1", "2", "99", " "});
            arrayOfString[51] = StringUtils.replaceEach(Answers.getT93a(), new String[]{"0", "-1"}, new String[]{"99", " "});
            arrayOfString[52] = StringUtils.replaceEach(Answers.getT93b(), new String[]{"0", "-1"}, new String[]{"99", " "});
            arrayOfString[53] = StringUtils.replaceEach(Answers.getT93c(), new String[]{"0", "-1"}, new String[]{"99", " "});
            arrayOfString[54] = StringUtils.replaceEach(Answers.getT94(), new String[]{"0", "1", "2", "3", "4", "5", "6", "-1"}, new String[]{"1", "2", "3", "4", "5", "6", "7", " "});
            arrayOfString[55] = StringUtils.replaceEach(Answers.getT95(), new String[]{"0", "1", "2", "3", "4", "5", "6", "-1"}, new String[]{"1", "2", "3", "4", "5", "6", "7", " "});
            arrayOfString[56] = StringUtils.replaceEach(Answers.getT96(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[57] = StringUtils.replaceEach(Answers.getT97(), new String[]{"0", "1", "2", "3", "4", "5", "-1"}, new String[]{"1", "2", "3", "4", "5", "6", " "});
            arrayOfString[58] = StringUtils.replaceEach(Answers.getT98(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[59] = StringUtils.replaceEach(Answers.getT99(), new String[]{"-1"}, new String[]{" "});
            arrayOfString[60] = StringUtils.replaceEach(Answers.getT121(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[61] = StringUtils.replaceEach(Answers.getT122(), new String[]{"0", "1", "2", "3", "4", "-1"}, new String[]{"1", "2", "3", "4", "5", " "});
            arrayOfString[62] = Answers.getT12_time_end();

            System.out.println(getCountofRows2() + " rows found");
            writer = new CSVWriter(new FileWriter(folder + "FollowUpQuestionnaire.csv", true), ',');
            writer.writeNext(arrayOfString);
            writer.close();
            return;
        } catch (Exception localException) {
            localException.printStackTrace();
        }
    }
}


