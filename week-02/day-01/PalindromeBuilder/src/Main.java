public class Main {
    public static void main(String[] args) {
        //Create a function named create palindrome following your current language's style guide.
        //It should take a string, create a palindrome from it and then return it.
        System.out.println(palindrome("greenfox"));
    }
    public static String palindrome (String word) {
        int length = word.length();
        String reverse = "";

        for (int i = length - 1; i >=0 ; i--) {
            reverse = reverse + word.charAt(i);
        }
        return word+reverse;

    }
}
