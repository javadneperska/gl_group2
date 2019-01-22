package utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PersonUtility {


    public static boolean isMale(String rodneNumber) {
        int thirdNumber = Integer.parseInt(rodneNumber.substring(2, 3));
        return (thirdNumber > 1);
    }

    public static int age(String bornNumber) throws ParseException {
        int lastNumbersOfYear = Integer.parseInt(bornNumber.substring(0, 2));
        int year = lastNumbersOfYear > 18 ? 1900 + lastNumbersOfYear : 2000 + lastNumbersOfYear;
        int month = Integer.parseInt(bornNumber.substring(2, 4)) - 50;
        int day = Integer.parseInt(bornNumber.substring(4, 6));
        Date today = new Date();
        SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-DD");
        Date born = parser.parse(year + "-" + month + "-" + day);

        long diffInMillies = Math.abs(today.getTime() - born.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS)/360;
        return (int)diff;
    }
}
