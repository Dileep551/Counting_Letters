import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {

    @Test
    void getCountChar() {

        //Give
        String value = "HELLO THERE";
        
        //When
        CountLetters countLetter = new CountLetters();
        Map<Character, Integer> letterCountMap = countLetter.getCountChar(value);
        
        //Then
        assertEquals(2, letterCountMap.get('H'));
        assertEquals(3, letterCountMap.get('E'));
        assertEquals(2, letterCountMap.get('L'));
        assertEquals(1, letterCountMap.get('O'));
        assertEquals(1, letterCountMap.get('T'));
        assertEquals(1, letterCountMap.get('R'));

        

    }
}