package com.example;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimplestNormaliserTest {
    @ParameterizedTest
    @CsvSource({
        "Java engineer,Software engineer",
        "C# engineer,Software engineer",
        "Chief Accountant,Accountant"
    })
    void testNormalisation(String input, String expected) {
        SimplestNormaliser n = new SimplestNormaliser();
        assertEquals(expected, n.normalise(input));
    }
}
