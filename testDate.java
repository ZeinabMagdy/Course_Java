package Ex8_3;
import java.util.Date;
public class testDate {
    public static void main (String [] args ){
        Date d = new Date();
        d.setTime(10000);
        for (long i = 10000; i<= 100000000000L; i *= 10){
            d.setTime(i);
            System.out.println(d.toString());
        }
    }

    
}
