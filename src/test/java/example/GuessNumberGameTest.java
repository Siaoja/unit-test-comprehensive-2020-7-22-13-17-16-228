package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {

    @Test
    void should_given_1234_when_guess_then_return_4A0B() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn("1234");
        String guessNumber = "1234";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("4A0B",guessResult);
    }
}
