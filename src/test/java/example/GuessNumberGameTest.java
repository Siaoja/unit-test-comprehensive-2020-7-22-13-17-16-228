package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class GuessNumberGameTest {

    @Test
    void should_given_1234_when_call_guess_then_return_4A0B() {
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

    @Test
    void should_given_1243_when_call_guess_then_return_2A2B() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn("1234");
        String guessNumber = "2134";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("2A2B", guessResult);
    }

    @Test
    void should_given_4321_when_call_guess_then_return_0A4B() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn("1234");
        String guessNumber = "4321";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A4B", guessResult);
    }
}
