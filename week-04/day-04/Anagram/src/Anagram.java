public class Anagram {
    private String word1;
    private String word2;

    public Anagram(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }

    public boolean isItAnagram() {
        if (word1.length() == word2.length() && word1.contains(getWord1()) == word2.contains(getWord2())) {
            System.out.println(word2 + " is an anagram of " + word1);
            return true;
        }
        else {
            System.out.println(word2 + " is not an anagram of " + word1);
            return false;
        }

    }
}
