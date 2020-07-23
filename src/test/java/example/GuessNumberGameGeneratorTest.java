package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameGeneratorTest {
    @Test
    void should_when_call_generate_then_return_guessNumber() {
        //given
        Generator generator = new GuessNumberGameGenerator();
        Generator mockedAnswerGenerator = Mockito.mock(Generator.class);

        //when
        String guessNumber = generator.generate();

        //then
        GuessNumberGame guessNumberGame = new GuessNumberGame(generator);
        given(mockedAnswerGenerator.generate()).willReturn(guessNumber);
        assertEquals(true,guessNumberGame.checkInput(guessNumber));
    }
}
