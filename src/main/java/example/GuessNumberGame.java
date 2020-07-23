package example;

import java.util.HashSet;
import java.util.Set;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(Generator generator) {
        answer = generator.generate();
    }

    public String guess(String guessNumber) {
        StringBuilder result = new StringBuilder();
        char[] guessNumberList = guessNumber.toCharArray();
        if (answer.equals(guessNumber)) {
            result.append("4A0B");
        } else {
            int aCount = 0, bCount = 0;
            for (int index = 0, len = guessNumberList.length; index < len; index++) {

                if (index == answer.indexOf(guessNumberList[index])) {
                    aCount++;
                } else if (answer.indexOf(guessNumberList[index]) != -1) {
                    bCount++;
                }
            }
            result.append(aCount).append("A").append(bCount).append("B");
        }

        return result.toString();
    }

    public Boolean checkInput(String guessNumber) {
        Boolean checkResult = null;
        Set<Character> guessNumberSet = new HashSet<>();
        if(guessNumber != null && guessNumber.length() == 4){
            for(int index = 0, len = guessNumber.length(); index < len; index++){
                guessNumberSet.add(guessNumber.charAt(index));
            }
            if(guessNumberSet.size() == guessNumber.length()){
                checkResult = true;
            }else{
                checkResult = false;
            }
        }else{
            checkResult = false;
        }
        return checkResult;
    }


}
