public class Summing {
    public static void main(String[] args) {

        int [] numbArray = {1,2,3,4,5};

        System.out.println(sumAll(numbArray));



    }


    public static int sumAll(int []numbers){

        int result = 0;
        for(int i = 0 ; i < numbers.length; i++) {
            result += numbers[i];
        }

        return result;
    }








}
