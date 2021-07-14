import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParseHeaderTest {
    @Test
    public void test001() {
        Map<String, List<String>> result =  ParseHeader.parseHeader("A:A\r\nB:B\r\nC:C");
        assertEquals(3, result.size());
        assertEquals("A", result.get("A").get(0));
        assertEquals("B", result.get("B").get(0));
        assertEquals("C", result.get("C").get(0));
    }

    @Test
    public void test002() {
        Map<String, List<String>> result =  ParseHeader.parseHeader("A:A1\r\nB:B1\r\nC:C1\r\nA:A2\r\nB:B2\r\nC:C2");
        assertEquals(3, result.size());
        assertEquals("A1", result.get("A").get(0));
        assertEquals("A2", result.get("A").get(1));

        assertEquals("B1", result.get("B").get(0));
        assertEquals("B2", result.get("B").get(1));

        assertEquals("C1", result.get("C").get(0));
        assertEquals("C2", result.get("C").get(1));
    }
}