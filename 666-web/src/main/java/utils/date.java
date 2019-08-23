package utils;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class date {
    public static void main(String[] args) {
       // demo1();
        int a[]=new int[49];
    }

    private static void demo1() {
        Calendar calendar2 = Calendar.getInstance();
        System.out.println(calendar2);
        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
                23, 59, 59);
        Date endOfDate = calendar2.getTime();
        System.out.println(endOfDate);

        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
                0, 0, 0);
        Date endOfDate1 = calendar2.getTime();
        System.out.println(endOfDate1);

        String s="[{\"$$hashKey\":\"004\",\"haoma\":\"12\",\"monny\":\"2\"}]";
    }
}
