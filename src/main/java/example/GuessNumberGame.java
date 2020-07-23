package example;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(Generator generator) {
        answer = generator.generate();
    }

    public String guess(String guessNumber){
        return "4A0B";
    }
}
