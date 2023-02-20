package oh.study.makeprojectbygradle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
class MakeWordTest {
    @InjectMocks
    private MakeWord makeWord;

    @Mock
    private WordsRepository wordsRepository;

    @Test
    @DisplayName("String 정상 반환")
    public void testService() {
        Words words = Words.builder().id(1).korean("사과").japaness("りんご").build();

        Mockito.doAnswer(invocation -> 1).when(wordsRepository).getMaxId();
        Mockito.doAnswer(invocation -> Optional.of(words)).when(wordsRepository).findById(1);
        String res = makeWord.Service();
        assertEquals("사과-りんご", res);
    }

    @Test
    @DisplayName("String 정상 반환2")
    public void testService2() {
        Words words = Words.builder().id(2).korean("사과").japaness("りんご").build();

        Mockito.doAnswer(invocation -> 2).when(wordsRepository).getMaxId();
        Mockito.doAnswer(invocation -> Optional.of(words)).when(wordsRepository).findById(2);
        String res = makeWord.Service();
        assertEquals("친구-友達", res);
    }
}