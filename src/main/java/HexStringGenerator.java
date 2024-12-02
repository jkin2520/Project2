import java.util.Random;

public class HexStringGenerator {
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

