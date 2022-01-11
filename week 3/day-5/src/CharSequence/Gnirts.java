package CharSequence;

public class Gnirts implements CharSequence{
    private String word;

    public Gnirts(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return getWord().charAt(getWord().length()-1-index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return CharSequence.super.isEmpty();
    }
}