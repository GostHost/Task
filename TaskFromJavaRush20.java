import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TaskFromJavaRush20 {
    //9. Работа с датой
    //1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года
    // - нечетное число, иначе false
    //2. String date передается в формате MAY 1 2013
    //Не забудьте учесть первый день года.
    //JANUARY 1 2000 = true
    //JANUARY 2 2020 = false
    public boolean isDateOdd (String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy", Locale.US);
        Date first = formatter.parse(date);
        Date second = new Date();
        long count = second.getTime() - first.getTime();
        int i = 24*60*60*1000;
        int dateCount = (int)(count/i);
        if (dateCount % 2 == 0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) throws ParseException {
        TaskFromJavaRush20 task = new TaskFromJavaRush20();
        System.out.println(task.isDateOdd("JANUARY 1 2022"));
        System.out.println(task.isDateOdd("JANUARY 2 2022"));
    }
}
