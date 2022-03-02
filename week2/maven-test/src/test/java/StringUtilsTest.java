import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private StringUtils utils;
    @BeforeEach
    void init() {
        utils = new StringUtils();
    }

    @org.junit.jupiter.api.Test
    void toList() {
        String input = "apple - orange - juice";
        List<String> list = utils.toList(input);
        assertLinesMatch(Arrays.asList("apple", "orange", "juice"), list);
    }

    @org.junit.jupiter.api.Test
    void toList2() {
        String input = "apple - orange - juice";
        List<String> list = utils.toList2(input);
        assertLinesMatch(Arrays.asList("apple", "orange", "juice"), list);
    }
}