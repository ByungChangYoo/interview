import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongestTextTest {
    @Test
    void test001() {
        final List<String> result = LongestText.getLongestText("AABBCCCD");
        assertEquals(1, result.size());
        assertEquals("CCC", result.get(0));
    }

    @Test
    void test002() {
        final List<String> result = LongestText.getLongestText("ABCD");
        assertEquals(4, result.size());
        assertEquals("A", result.get(0));
        assertEquals("B", result.get(1));
        assertEquals("C", result.get(2));
        assertEquals("D", result.get(3));
    }
}