import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Date: "+sdf.format(cal.getTime()));
        Format f=new SimpleDateFormat("EEEE");
        String str=f.format(new Date());
        System.out.println("Day: "+str);
    }
}
