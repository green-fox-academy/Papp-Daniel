public class Shifter implements CharSequence {
    String text;
    int numb;

    Shifter(String text, int numb){
        this.text = text;
        this.numb = numb;
    }
    @Override
    public int length() {
        return text.length()+numb;
    }

    @Override
    public char charAt(int index) {
        return text.charAt(index + numb);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return text.subSequence(start + numb, end + numb);
    }
}
