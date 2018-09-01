import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Create a function named is anagram following your current language's style guide.
        //It should take two strings and return a boolean value depending on whether its an anagram or not.

        System.out.println("Are the given words anagrams? : " + isAnagram("dog","god"));
    }
    public static boolean isAnagram (String word1, String word2) {
        String w1 = word1.replaceAll("\\s","");
        String w2 = word2.replaceAll("\\s","");

        boolean anagram = true;

        if (w1.length() != w2.length()) {
            anagram = false;
        } else {
            char[] w1Array = w1.toLowerCase().toCharArray();
            char[] w2Array = w2.toLowerCase().toCharArray();

            Arrays.sort(w1Array);
            Arrays.sort(w2Array);

            anagram = Arrays.equals(w1Array,w2Array);
        }
        return anagram;
    }
}
