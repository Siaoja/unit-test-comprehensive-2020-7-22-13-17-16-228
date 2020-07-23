package example;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(Generator generator) {
        answer = generator.generate();
    }

    public String guess(String guessNumber){
        StringBuilder result = new StringBuilder();
        char[] guessNumberList = guessNumber.toCharArray();
        if(answer.equals(guessNumber)){
            result.append("4A0B");
        }else{
            int aCount = 0, bCount = 0;
            for(int index = 0, len = guessNumberList.length; index < len; index++){
                if(index == answer.indexOf(guessNumberList[index])){
                    aCount++;
                }else{
                    bCount++;
                }
            }
            result.append(aCount).append("A").append(bCount).append("B");
        }

        return result.toString();
    }
}
