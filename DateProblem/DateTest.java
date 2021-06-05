import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    static void find(String join_date, String leave_date) {
        SimpleDateFormat obj = new SimpleDateFormat("dd-MM-yyy");
        try {
            Date date1 = obj.parse(join_date);
            Date date2 = obj.parse(leave_date);
            long time_difference = date2.getTime() - date1.getTime();

            long days_difference = (time_difference / (1000 * 60 * 60 * 24));
            System.out.print("Difference " + "between two dates is: ");
            System.out.println(Math.abs(days_difference) + " days");
        }
        catch (ParseException excep) {
            excep.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String a = "1-2-2020";
        String b = "1-3-2020";
        find(a, b);
    }
}
