public class ConditionalVaribaleMutation {
    public static void main(String[] args) {

        double a = 24;
        int out = 0;

        if ((a%2)==0) out++;

        System.out.println(out);




        int b = 4;
        String out2="";

        if(b>=10 && b<=20){
            out2 = "Sweet!";
        }
        else if(b<10){
            out2 = "Less!";
        }
        else if (b>20) {
            out2 = "More!";
        }
        System.out.println(out2);



        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        if (credits>=50 && isBonus==false){
            c-=2;
        }
        else if (credits<50&& isBonus==false){
            c-=1;
        }

        System.out.println(c);


    }
}
