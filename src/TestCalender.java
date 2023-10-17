import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalender{
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is" + new Date());
        System.out.println("Year: " + calendar.get(Calendar.YEAR));

        Calendar calendar1 = new GregorianCalendar(2001, 8,11);
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("September 11, 2001 is a " + dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);

    }



}
