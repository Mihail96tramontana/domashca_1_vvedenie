package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void FirstTest() {
        Assertions.assertTrue(3 >= 2);
    }

        @Test
         void secondTest() {
        Assertions.assertTrue(3 >= 1);
    }
}
