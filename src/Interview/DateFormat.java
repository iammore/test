package Interview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) {
        String pattern="MM--dd--yyyy:hh:mm:ss ";
        SimpleDateFormat format=new SimpleDateFormat(pattern);
        String date=format.format(new Date());
        System.out.println(date);
    }
}
