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
            title = new String[]{"0.1", "0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "Interview date", "Start time", "1.1", "1.2", "1.3", "1.4", "1.5", "1.6", "1.7", "1.8", "1.9", "1.10", "1.11", "2.1", "2.2", "2.3", "2.4", "2.5", "2.6", "2.7", "2.8", "3.1a", "3.1b", "3.1c", "3.1d", "3.2a", "3.2b", "3.2c", "3.2d", "3.2e", "4.0a", "4.0b", "4.0c", "4.0d", "4.0e", "4.1", "4.2", "4.3", "4.4a", "4.4b", "4.4c", "4.5a", "4.5b", "4.6", "4.7", "4.8", "4.9", "4.10", "4.11", "4.12", "4.13", "4.14a", "4.14b", "4.14c", "4.15a", "4.15b", "4.15c", "5.1", "5.2", "5.3", "5.4", "6.1", "6.2", "6.3", "6.4", "6.5", "6.6", "6.7", "6.8", "6.9", "12.1", "12.2", "End time"};
            String[] arrayOfString = new String[80];
            arrayOfString[0] = Answers.getO01();
            arrayOfString[1] = Answers.getO02();
            arrayOfString[2] = Answers.getO03();
            arrayOfString[3] = Answers.getO04();
            arrayOfString[4] = Answers.getO05();
            arrayOfString[5] = Answers.getO06();
            arrayOfString[6] = Answers.getO07();
            arrayOfString[7] = Answers.getO07_day();
            arrayOfString[8] = Answers.getO07_time();
            arrayOfString[9] = StringUtils.replaceEach(Answers.getO11(), new String[]{"0", "1"}, new String[]{"1", "2"});
            arrayOfString[10] = StringUtils.replaceEach(Answers.getO12(), new String[]{"0", "1"}, new String[]{"1", "2",});
            arrayOfString[11] = StringUtils.replaceEach(Answers.getO13(), new String[]{"0", "1"}, new String[]{"1", "0"});
            arrayOfString[12] = Answers.getO14();
            arrayOfString[13] = Answers.getO15();
            arrayOfString[14] = StringUtils.replaceEach(Answers.getO16(), new String[]{"0", "1",}, new String[]{"1", "0"});
            arrayOfString[15] = Answers.getO17();
            arrayOfString[16] = Answers.getO18();
            arrayOfString[17] = StringUtils.replaceEach(Answers.getO19(), new String[]{"4"}, new String[]{"17"});
            arrayOfString[18] = Answers.getO110();
            arrayOfString[19] = StringUtils.replaceEach(Answers.getO111(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"},
                    new String[]{"0", "1", "2", "3", "0", "4", "5", "0", "6", "7", "8", "0", "9", "10", "11", "12", "13", "14"});
            arrayOfString[20] = StringUtils.replaceEach(Answers.getO21(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[21] = StringUtils.replaceEach(Answers.getO22(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[22] = StringUtils.replaceEach(Answers.getO23(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[23] = StringUtils.replaceEach(Answers.getO24(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[24] = StringUtils.replaceEach(Answers.getO25(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"}, new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"});
            arrayOfString[25] = StringUtils.replaceEach(Answers.getO26(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[26] = Answers.getO27();
            arrayOfString[27] = StringUtils.replaceEach(Answers.getO28(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
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
            arrayOfString[50] = StringUtils.replaceEach(Answers.getO46(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[51] = Answers.getO47();
            arrayOfString[52] = Answers.getO48();
            arrayOfString[53] = StringUtils.replaceEach(Answers.getO49(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[54] = Answers.getO410();
            arrayOfString[55] = Answers.getO411();
            arrayOfString[56] = Answers.getO412();
            arrayOfString[57] = StringUtils.replaceEach(Answers.getO413(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[58] = Answers.getO414a();
            arrayOfString[59] = Answers.getO414b();
            arrayOfString[60] = Answers.getO414c();
            arrayOfString[61] = Answers.getO415a();
            arrayOfString[62] = Answers.getO415b();
            arrayOfString[63] = Answers.getO415c();
            arrayOfString[64] = StringUtils.replaceEach(Answers.getO51(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[65] = StringUtils.replaceEach(Answers.getO52(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[66] = StringUtils.replaceEach(Answers.getO53(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[67] = StringUtils.replaceEach(Answers.getO54(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[68] = Answers.getO61();
            arrayOfString[69] = Answers.getO62();
            arrayOfString[70] = Answers.getO63();
            arrayOfString[71] = Answers.getO64();
            arrayOfString[72] = StringUtils.replaceEach(Answers.getO65(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[73] = Answers.getO66();
            arrayOfString[74] = Answers.getO67();
            arrayOfString[75] = Answers.getO68();
            arrayOfString[76] = Answers.getO69();
            arrayOfString[77] = StringUtils.replaceEach(Answers.getO121(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[78] = StringUtils.replaceEach(Answers.getO122(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
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
            title2 = new String[]{"0.2", "0.3", "0.4", "0.5", "0.6", "0.7", "0.7_day", "0.7_time", "4.0a", "4.0b", "4.0c", "4.0d", "4.0e", "4.6", "4.7", "4.8", "4.9", "4.10", "4.11", "4.12", "4.13", "4.14a", "4.14b", "4.14c", "4.15a", "4.15b", "4.15c", "5.1", "5.2", "5.3", "5.4", "5.5", "5.6", "7.1", "7.2", "7.3", "T81", "T82", "9.1", "9.2a", "9.2b", "9.2c", "9.2d", "9.2e", "9.2f", "9.2g", "9.2h", "9.3a", "9.3b", "9.3c", "9.4", "9.5", "9.6", "9.7", "9.8", "9.9", "12.1", "12.2", "End Time"};
            String[] arrayOfString = new String[59];
            arrayOfString[0] = Answers.getT02();
            arrayOfString[1] = Answers.getT03();
            arrayOfString[2] = Answers.getT04();
            arrayOfString[3] = Answers.getT05();
            arrayOfString[4] = Answers.getT06();
            arrayOfString[5] = Answers.getT07();
            arrayOfString[6] = Answers.getT07_day();
            arrayOfString[7] = Answers.getT07_time();
            arrayOfString[8] = Answers.getT40a();
            arrayOfString[9] = Answers.getT40b();
            arrayOfString[10] = Answers.getT40c();
            arrayOfString[11] = Answers.getT40d();
            arrayOfString[12] = Answers.getT40e();
            arrayOfString[13] = Answers.getT46();
            arrayOfString[14] = Answers.getT47();
            arrayOfString[15] = StringUtils.replaceEach(Answers.getT48(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[16] = StringUtils.replaceEach(Answers.getT49(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[17] = Answers.getT410();
            arrayOfString[18] = Answers.getT411();
            arrayOfString[19] = Answers.getT412();
            arrayOfString[20] = StringUtils.replaceEach(Answers.getT413(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[21] = Answers.getT414a();
            arrayOfString[22] = Answers.getT414b();
            arrayOfString[23] = Answers.getT414c();
            arrayOfString[24] = Answers.getT415a();
            arrayOfString[25] = Answers.getT415b();
            arrayOfString[26] = Answers.getT415c();
            arrayOfString[27] = StringUtils.replaceEach(Answers.getT51(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[28] = Answers.getT52();
            arrayOfString[29] = StringUtils.replaceEach(Answers.getT53(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[30] = Answers.getT54();
            arrayOfString[31] = Answers.getT55();
            arrayOfString[32] = Answers.getT56();
            arrayOfString[33] = StringUtils.replaceEach(Answers.getT71(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[34] = StringUtils.replaceEach(Answers.getT72(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[35] = StringUtils.replaceEach(Answers.getT73(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[36] = Answers.getT81();
            arrayOfString[37] = Answers.getT82();
            arrayOfString[38] = StringUtils.replaceEach(Answers.getT91(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7"}, new String[]{"1", "2", "3", "4", "5", "6", "7", "8"});
            arrayOfString[39] = StringUtils.replaceEach(Answers.getT92a(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[40] = StringUtils.replaceEach(Answers.getT92b(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[41] = StringUtils.replaceEach(Answers.getT92c(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[42] = StringUtils.replaceEach(Answers.getT92d(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[43] = StringUtils.replaceEach(Answers.getT92e(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[44] = StringUtils.replaceEach(Answers.getT92f(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[45] = StringUtils.replaceEach(Answers.getT92g(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[46] = StringUtils.replaceEach(Answers.getT92h(), new String[]{"0", "1", "2"}, new String[]{"1", "2", "99"});
            arrayOfString[47] = StringUtils.replaceEach(Answers.getT93a(), new String[]{"0"}, new String[]{"99"});
            arrayOfString[48] = StringUtils.replaceEach(Answers.getT93b(), new String[]{"0"}, new String[]{"99"});
            arrayOfString[49] = StringUtils.replaceEach(Answers.getT93c(), new String[]{"0"}, new String[]{"99"});
            arrayOfString[50] = StringUtils.replaceEach(Answers.getT94(), new String[]{"0", "1", "2", "3", "4", "5", "6"}, new String[]{"1", "2", "3", "4", "5", "6", "7"});
            arrayOfString[51] = StringUtils.replaceEach(Answers.getT95(), new String[]{"0", "1", "2", "3", "4", "5", "6"}, new String[]{"1", "2", "3", "4", "5", "6", "7"});
            arrayOfString[52] = StringUtils.replaceEach(Answers.getT96(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[53] = StringUtils.replaceEach(Answers.getT97(), new String[]{"0", "1", "2", "3", "4", "5"}, new String[]{"1", "2", "3", "4", "5", "6"});
            arrayOfString[54] = StringUtils.replaceEach(Answers.getT98(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[55] = Answers.getT99();
            arrayOfString[56] = StringUtils.replaceEach(Answers.getT121(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[57] = StringUtils.replaceEach(Answers.getT122(), new String[]{"0", "1", "2", "3", "4"}, new String[]{"1", "2", "3", "4", "5"});
            arrayOfString[58] = Answers.getT12_time_end();

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


