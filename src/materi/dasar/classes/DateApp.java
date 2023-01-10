package materi.dasar.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {

        Date tanggal = new Date();

        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, 2000);
        calendar.add(Calendar.MONTH, Calendar.JANUARY);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
