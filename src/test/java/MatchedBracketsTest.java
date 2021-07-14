import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatchedBracketsTest {
    @Test
    void test001() {
        final String result = MatchedBrackets.matchBrackets("()()");
        assertEquals("YES", result);
    }

    @Test
    void test002() {
        final String result = MatchedBrackets.matchBrackets("({[}]");
        assertEquals("NO", result);
    }

    @Test
    void test003() {
        final String result = MatchedBrackets.matchBrackets("({}[(){}])");
        assertEquals("YES", result);
    }
}