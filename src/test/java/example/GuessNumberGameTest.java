package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class GuessNumberGameTest {

    private final String answer = "1234";

    @Test
    void should_given_1234_when_call_guess_then_return_4A0B() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
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
        given(mockedAnswerGenerator.generate()).willReturn(answer);
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
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        String guessNumber = "4321";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A4B", guessResult);
    }

    @Test
    void should_given_1024_when_call_guess_then_return_2A1B() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        String guessNumber = "1024";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("2A1B",guessResult);

    }

    @Test
    void should_given_2105_when_call_guess_then_return_0A2B() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        String guessNumber = "2105";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A2B",guessResult);

    }

    @Test
    void should_given_5678_when_call_guess_then_return_0A0B() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        String guessNumber = "5678";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A0B",guessResult);

    }

    @Test
    void should_given_1234_when_call_check_input_then_return_true() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        String guessNumber = "1234";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        Boolean checkInputResult = guessNumberGame.checkInput(guessNumber);

        //then
        assertEquals(true,checkInputResult);

    }

    @Test
    void should_given_1124_when_call_check_input_then_return_false() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        String guessNumber = "1124";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        Boolean checkInputResult = guessNumberGame.checkInput(guessNumber);

        //then
        assertEquals(false,checkInputResult);

    }

    @Test
    void should_given_12_when_call_check_input_then_return_false() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        String guessNumber = "12";

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        Boolean checkInputResult = guessNumberGame.checkInput(guessNumber);

        //then
        assertEquals(false,checkInputResult);
    }

    @Test
    void should_given_guess_list_when_call_play_then_return_win_info() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        List<String> guessList = new ArrayList<>();
        guessList.add("1024");guessList.add("2105");guessList.add("4321");guessList.add("1124");guessList.add("12");guessList.add("1234");

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.play(guessList);

        //then
        assertEquals("2A1B\n0A2B\n0A4B\nWrong Input，Input again\nWrong Input，Input again\n4A0B\nCongratulations,you win!\n", guessResult);
    }


    @Test
    void should_given_guess_list_when_call_play_then_return_lose_info() {
        //given
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);
        given(mockedAnswerGenerator.generate()).willReturn(answer);
        List<String> guessList = new ArrayList<>();
        guessList.add("1024");guessList.add("2105");guessList.add("4321");guessList.add("1124");guessList.add("12");guessList.add("5678");

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(mockedAnswerGenerator);
        String guessResult = guessNumberGame.play(guessList);

        //then
        assertEquals("2A1B\n0A2B\n0A4B\nWrong Input，Input again\nWrong Input，Input again\n0A0B\nGameOver\n", guessResult);
    }
}
