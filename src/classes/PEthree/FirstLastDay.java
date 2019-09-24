package classes.PEthree;

import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FirstLastDay {

public void firstDayOfWeek(){

    Date date  = new Date();


    Calendar cal = Calendar.getInstance();

    cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

    System.out.println("First date of this week : "+cal.getTime());

    cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);

    System.out.println("Last date of the week : "+cal.getTime());


}





}
