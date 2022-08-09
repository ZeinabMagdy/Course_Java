package Ex8_5;

import java.util.GregorianCalendar;

public class gregorianCalendar {

    public static void main(String[] args) {
        GregorianCalendar Gc = new GregorianCalendar();
        System.out.println(Gc.get(GregorianCalendar.YEAR) + " - " + Gc.get(GregorianCalendar.MONTH) + " - " + Gc.get(GregorianCalendar.DAY_OF_MONTH));
        Gc.setTimeInMillis(1234567898765L);
        System.out.println(Gc.get(GregorianCalendar.YEAR) + " - " + Gc.get(GregorianCalendar.MONTH) + " - " + Gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
