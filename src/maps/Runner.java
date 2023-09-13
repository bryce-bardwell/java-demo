package maps;

public class Runner {

    public static void main(String[] args) {
        MorseTranslator morseTranslator = new MorseTranslator();
        String out = morseTranslator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-");

        System.out.println(out);
    }
}
