package maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {
    private Map<String, String> morse = new HashMap<>();

    public MorseTranslator() {
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.-", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        morse.put("/", " ");
    }

    public String translate(String in) {
        StringBuilder output = new StringBuilder();
        String[] word = in.split(" ");

        for (String letter : word) {
            String word_out = "";
            word_out += morse.get(letter);

            output.append(word_out);
        }

        return output.toString();
    }
}
