public class SecondInADay {
    public static void main (String [] args){

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int allsecond = currentHours*60*60+currentMinutes*60+42;

        int remainSeconds = 24*60*60;


       int remainingseconds =remainSeconds-allsecond;

        System.out.println(remainingseconds);

    }
}
