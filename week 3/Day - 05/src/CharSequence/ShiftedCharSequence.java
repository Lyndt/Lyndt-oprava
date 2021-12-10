package CharSequence;

public class ShiftedCharSequence implements CharSequence{
    private String word;
    private int number;

    public ShiftedCharSequence(String word, int number) {
        this.word = word;
        this.number = number;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return getWord().charAt(index+getNumber());
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}