import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class EnglishLetterFrequencies {

    public static final Map<Character, Double> letterFrequencies = new HashMap<>();

    static {
        letterFrequencies.put('A', 0.08167);
        letterFrequencies.put('B', 0.01492);
        letterFrequencies.put('C', 0.02782);
        letterFrequencies.put('D', 0.04253);
        letterFrequencies.put('E', 0.12702);
        letterFrequencies.put('F', 0.02228);
        letterFrequencies.put('G', 0.02015);
        letterFrequencies.put('H', 0.06094);
        letterFrequencies.put('I', 0.06966);
        letterFrequencies.put('J', 0.00153);
        letterFrequencies.put('K', 0.00772);
        letterFrequencies.put('L', 0.04025);
        letterFrequencies.put('M', 0.02406);
        letterFrequencies.put('N', 0.06749);
        letterFrequencies.put('O', 0.07507);
        letterFrequencies.put('P', 0.01929);
        letterFrequencies.put('Q', 0.00095);
        letterFrequencies.put('R', 0.05987);
        letterFrequencies.put('S', 0.06327);
        letterFrequencies.put('T', 0.09056);
        letterFrequencies.put('U', 0.02758);
        letterFrequencies.put('V', 0.00978);
        letterFrequencies.put('W', 0.02360);
        letterFrequencies.put('X', 0.00150);
        letterFrequencies.put('Y', 0.01974);
        letterFrequencies.put('Z', 0.00074);
    }
}

public class CipherCracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Shift cipher ciphertext: ");
        String ciphertext = scanner.nextLine().toUpperCase();

        System.out.println("Attempting to break the Shift cipher...");
        int key = breakShiftCipher(ciphertext);

        if (key != -1) {
            System.out.println("Found key: " + key);
            String plaintext = decryptShiftCipher(ciphertext, key);
            System.out.println("Decrypted text: " + plaintext);
        } else {
            System.out.println("Failed to break the Shift cipher.");
        }

        scanner.close();
    }

    public static int breakShiftCipher(String ciphertext) {
        // Calculate letter frequencies in the ciphertext
        Map<Character, Integer> letterFrequencies = new HashMap<>();
        int totalLetters = 0;

        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                char uppercaseChar = Character.toUpperCase(c);
                letterFrequencies.put(uppercaseChar, letterFrequencies.getOrDefault(uppercaseChar, 0) + 1);
                totalLetters++;
            }
        }

        // Calculate Ij values for all shifts (0 to 25)
        double[] ijValues = new double[26];

        for (int j = 0; j < 26; j++) {
            for (char pi : EnglishLetterFrequencies.letterFrequencies.keySet()) {
                char qi = (char)  + (pi  + j) ;
                double pij = (double) letterFrequencies.getOrDefault(qi, 0) / totalLetters;
                ijValues[j] += EnglishLetterFrequencies.letterFrequencies.get(pi) * pij;
            }
        }

        // Find the key with the closest Ij value to the expected value
        double targetIj = 0.065;
        int bestKey = -1;
        double closestIj = Double.MAX_VALUE;

        for (int key = 0; key < 26; key++) {
            double diff = Math.abs(ijValues[key] - targetIj);
            if (diff < closestIj) {
                closestIj = diff;
                bestKey = key;
            }
        }

        return bestKey;
    }

    public static String decryptShiftCipher(String ciphertext, int shift) {
        StringBuilder decryptedText = new StringBuilder();

        for (char c : ciphertext.toCharArray()) {
            if (Character.isLetter(c)) {
                char decryptedChar = (char) ('A' + (c - 'A' - shift + 26) % 26);
                decryptedText.append(decryptedChar);
            } else {
                decryptedText.append(c);
            }
        }

        return decryptedText.toString();
    }
}
