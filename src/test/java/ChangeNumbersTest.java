import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeNumbersTest {

    @Test
    void test001() {
        final int result = ChangeNumbers.changeNumber("one4seveneight");
        assertEquals(1478, result);
    }

    @Test
    void test002() {
        final int result = ChangeNumbers.changeNumber("23four5six7");
        assertEquals(234567, result);
    }

    @Test
    void test003() {
        final int result = ChangeNumbers.changeNumber("2three45sixseven");
        assertEquals(234567, result);
    }

    @Test
    void test004() {
        final int result = ChangeNumbers.changeNumber("123");
        assertEquals(123, result);
    }

}