package example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class GuessNumberGameGenerator implements Generator{
    @Override
    public String generate() {
        Random random = new Random();
        Set<Integer> numbersSet = new HashSet<>();
        StringBuilder guessNumber = new StringBuilder();

        while (numbersSet.size() != 4){
            numbersSet.add(random.nextInt(10));
        }
        Integer[] numbersArray = new Integer[numbersSet.size()];
        numbersSet.toArray(numbersArray);
        for(int index = 0,len =numbersArray.length;index<len;index++){
            guessNumber.append(String.valueOf(numbersArray[index]));
        }

        return guessNumber.toString();
    }
}
