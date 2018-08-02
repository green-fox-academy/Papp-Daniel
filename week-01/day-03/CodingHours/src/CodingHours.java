import java.sql.SQLOutput;

public class CodingHours {
    public static void main (String[] args) {
        int weeksInSemester=17;
        int codingHours = 6;
        int workdayInSemester = 17*5;
        int hoursInSemester = workdayInSemester*24;
        int workHoursInSemester = workdayInSemester*52;
        int allWorkHours = 17*52;
        int allCodingHours = workdayInSemester*codingHours;

        System.out.println(workdayInSemester*codingHours);
        System.out.println(allWorkHours);
        float result = (float)allCodingHours / allWorkHours;
        System.out.format("%.2f",result*100);




    }
}
