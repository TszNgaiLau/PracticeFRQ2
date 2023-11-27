public class HiddenWord {
    private String word;
    public HiddenWord(String word) {
        this.word = word;
    }

    public String getHint(String guess) {
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            String wordLetter = word.substring(i, i + 1);
            String guessLetter = guess.substring(i, i + 1);

            if (wordLetter.equals(guessLetter)) {
                str += guessLetter;
            } else if (word.indexOf(guessLetter) != -1) {
                str += "+";
            } else {
                str += "*";
            }
        }
        return str;
    }

}


