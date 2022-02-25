import static org.junit.jupiter.api.Assertions.*;

class AlphabetTest {

    @org.junit.jupiter.api.Test
    void countVowels() {
        assertEquals(Alphabet.countVowels("apple"), 2);
    }
}