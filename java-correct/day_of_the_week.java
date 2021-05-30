import java.util.Calendar;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int num = cal.get(cal.DAY_OF_WEEK);
        return days[num-1];
    }
}