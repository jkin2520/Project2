/**
 * Utility class for generating random hexadecimal strings.
 * The generated string is formatted as follows:
 * xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
 * where each "x" is a hexadecimal character (0-9, a-f).
 */
public class HexStringGenerator {

    /**
     * Generates a random 32-character hexadecimal string formatted as:
     * xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx.
     *
     * @return A formatted random hexadecimal string.
     */
    public static String generateRandomHex() {
        Random random = new Random();
        StringBuilder hex = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            hex.append(Integer.toHexString(random.nextInt(16)));
        }
        return String.format("%s-%s-%s-%s-%s",
                hex.substring(0, 8),
                hex.substring(8, 12),
                hex.substring(12, 16),
                hex.substring(16, 20),
                hex.substring(20));
    }
}
