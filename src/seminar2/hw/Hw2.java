package seminar2.hw;

import java.sql.Array;
import java.util.Arrays;

//
////Дана строка json:
////[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4",
//// "предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
////Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
////        Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
////        Студент Иванов получил 5 по предмету Математика.
////        Студент Петрова получил 4 по предмету Информатика.
////        Студент Краснов получил 5 по предмету Физика.
public class Hw2 {

    public static String[] replaceList() {

        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";


        String replStr_1 = json.replace("[", "");
        String replStr_2 = replStr_1.replace("]", "");
        String replStr_3 = replStr_2.replace(":", ",");
        String replStr_4 = replStr_3.replace("}", "");
        String replStr_5 = replStr_4.replace("{", "");
        String replStr_6 = replStr_5.replace("фамилия", "Студент");
        String replStr_7 = replStr_6.replace("оценка", "получил");
        String replStr_8 = replStr_7.replace("предмет", "по предмету");

        String[] replStr = replStr_8.split(", ");

        return replStr;
    }

    public static void main() {
        String[] arrStudents = replaceList();

        for (int i = 0; i < arrStudents.length; i++) {
            String replStudents_1 = arrStudents[i].replace('"', ' ');
            String replStudents_2 = replStudents_1.replace(",", "");
            String replStudents = replStudents_2.trim();
            System.out.println(replStudents + '.');
        }
    }
}


