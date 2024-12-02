import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HexStringGeneratorTest {

    @Test
    void testGenerateRandomHex() {
        // Call the method to test
        String result = HexStringGenerator.generateRandomHex();

        // Assert that the result is not null
        assertNotNull(result, "The generated string should not be null");

        // Assert that the result has the correct length
        assertEquals(36, result.length(), "The generated string should be 36 characters long");

        // Assert that the result matches the correct format
        assertTrue(
            result.matches("[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}"),
            "The generated string should match the UUID format"
        );
    }
}

