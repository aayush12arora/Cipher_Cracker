import java.util.*;

class EnglishLetterFrequencies {

    public static final Map<Character, Double> letterFrequencies = new HashMap<>();

    static {
        letterFrequencies.put('a', 0.082);
        letterFrequencies.put('b', 0.015);
        letterFrequencies.put('c', 0.028);
        letterFrequencies.put('d', 0.043);
        letterFrequencies.put('e', 0.13);
        letterFrequencies.put('f', 0.022);
        letterFrequencies.put('g', 0.02);
        letterFrequencies.put('h', 0.061);
        letterFrequencies.put('i', 0.07);
        letterFrequencies.put('j', 0.002);
        letterFrequencies.put('k', 0.008);
        letterFrequencies.put('l', 0.04);
        letterFrequencies.put('m', 0.024);
        letterFrequencies.put('n', 0.067);
        letterFrequencies.put('o', 0.075);
        letterFrequencies.put('p', 0.019);
        letterFrequencies.put('q', 0.001);
        letterFrequencies.put('r', 0.06);
        letterFrequencies.put('s', 0.063);
        letterFrequencies.put('t', 0.091);
        letterFrequencies.put('u', 0.028);
        letterFrequencies.put('v', 0.01);
        letterFrequencies.put('w', 0.024);
        letterFrequencies.put('x', 0.002);
        letterFrequencies.put('y', 0.02);
        letterFrequencies.put('z', 0.001);
    }
}



public class VigenereCipherCracker {
    public static void main(String[] args) {
        String ciphertext = "IFSPPSFJKBOWNWHDNIGSPSGDCBRGKPFLPQMTUOBTPHSRTOZACFHZHCICPOHFTOZPPJWCQBAPPHWEGBQZODODUSGEJSAJTWOOQTHCGSGDJFIMUDZLPHGLPRUCCGGPUHVLVPZLPYSEQIFWCBRDEODPUDFZXWRTPUAZTSHSCBXFUHOPUHVPVWQLRDSLNWHANOMDCDWGQHOWTCZPKBCFTZWGGGWYHZIPPQWYICICRVMDKQOWJSOWVVAPPHOWYSZWDSWYIOBOVVSDWGHLKBOMKZWEACTZWFDWCBSECHWEUQCCGUFPGBSCAWGLUMAMQZCQNWTPCBRGKHOWKHMTVWGEJSZTXWBREOBGCGHSCHDLKBHDVVSHQFZOCFCFPRIDHFCXVVSEQKSCKBUQQFSDVGHSCHKSKGDPTGSNTSHDQTHTOSZPUGBPUGHZVVSOGZWNCHSAGHOWUCTLUDFTPUPWQGGZOUFPGBSCAQOAVIFPUHVPGGGPPQSZHUFZYHVCGBSHCZOYFVOCOCBJYWHSPOHFTSMPVWHDUWUYKTWNCBQPICSDHOFMGMCYFASCGOSDVVSEKQGZPSCQVVSXQGHPXWRPPHOOXOBECUSDQTUCGSBPTMWDKHGAQGWEKJSTODONVCBEJSSYXWFZPASYVHFPGGOYFDZLPHGLEHODPOHFTOZLKFDFTWTTGFGLDGCCDWBRJOFXHIZAQZZFVOBEUGINJOGNCFPZPRWZZWRPCBRCGZSLUWBRQLMRGBHSGMATVWULVSHSGSTQGQHDQTQWKAOEGQVLPUSMAFSOWQWYIUFPGBVZWGSRCGSXKGGTQBGLPRGECPWWKNWYIHSXRSFLVIFPUACCGCJPTHVPTCCEUMGEGAGZHDZLPHGSGZDATSJPPHGZKZSCQGWZPSBDWFWYIHVPNCBRVSFXHSFEKZWEACTEJSZLPRUCGSBPTMOWUCDWCMGLEFINKOZCQZSTPPWZFWJPTGWEARWGGFGPGQCDAGHPOGHSTWJPYVSCGHVPTSWDCBOMWBRLPQSZHDZLPHZTHSDCQJWOKBUSCPWECHGQQFQZWBHWGGGDRSQTGGCQCBWXCZGLPRWYUSQEUHVTUWBEGFQZPBSNVSRHGPCQNWTPGBGFTSGEJSPLNOBNGCTYCHICGOBOVVSDWFJTXOZZHAOYAGDPEWSDKBQWWRWYICICQKBTPIFMCBOCGOGRTSSYGFMECYSDQBOOFSRDKUBTHWQLPQSACFYDCBRRTSSYUDONGGDCQJWOGOFPUDWEGTFZOHVPECBNTSHPLIBRNSCQHSFTPUDPQDZPCDZLESHZTSZLZSLPTQWDGOBOECBYGQHHKHVYCHICGOQNGGGEQUFPGBOCGOGHKHVTPQWEKSGSCGPPGBZTPYSOVCWXRFCGGRAPPHOWJSOWVVFPFIQPFGHCGGGWGJSWUOBOKBQCGOGPFCJPTOZWYSZWDSWYIOGFTPOYKNOEKCBNQBHTPISDVCFTUSDCGGSCXWBRCBRPZDOYFWBRIFSPPGDLESGTUSGDGBHTCZTZTHVPJSOWVVOYFVOARWBPUGCQEWHJFKSWNSFDHIFEJSFXQFSRTSSYGFMSCGSNQBCXKQPPPSTTVGHSGOUCKQIWVIFLNWBOWGHCAFSWKSGSGOJTNMCYVVSNWZHTXOHTQBCQEFCAUOBOVVSNCFSZHZWGGGHZEYKSKQVOGDSYFCBQGFHTNSGZKZOYFOVZUDWECPZPEZWXCHSRTSSYGFMSGZDDOOWYVOWYVVSDGQCYFWHTQBGPPGICKBULUHOMNSTZQRGFRDZJCBRDWDDZTHWYIZWGGZWSQCRDVVSTODCCVOBNGCTRTSSYGFMNCBBZVPSZXSFDVOHPFKVPPWHNQASDVCSOWQOEKCBLPROHCFSYGGGTVGSCXSGLUOZTXWBREZODUFCZOHSLEVWYIIGLDCIEVVSNAQZPUCTWKTSPECZZIMOYFHVPFSZTEOHPDOZLPQSZHSQZUMGEGAGRTSSYUDONGGCQHSFZRDCCVIBTVWSDHCFNJWZOTSBEQQCYPSQEYWHSPOHFTSTZUHSCKBULUSBDGCTCGGDZPGWMKZWEAOBOUHSHCFRDJWDQQFHSGSBGKFCYOSBEHFCXCBSLTZMLISVZYSJPTRSDRWHPKHGXCBMLFJOYVOUPUUFPGBSCATONGGHSTSOEUWBEJSTZTACQFSTZTSGECHWZPVOMKHOEFSGETIQEKCBLPRDZNZIEKCBLUGHPYOFOUCTEJWGANOBPVWHTUCICTSGAQBGTDWZTVMHZRFCEGQHLPRDCGGSCXSHSGUFPGBSCAHVLVGIDVOWYUIGTPWHTCHWGGGGFEVODCTTZTSGECHWZPFSQQFSDVOHTQBOYFGIDVOWYCPZPNOBOOOBLISAPPHOCGQFFEWOWUHSAUHCHCFRPPGICKBUEJSQZPHWYWSRGKHOWKHMZHCICIFSPPGDLESGTPQCYEZIDKCBRTSSYGFMTUBCEOSFPNMOYGAPPNZWDJASYVWBEJSHLRSGETMCQQIFHQFZOKHWDVVSEJFSLFHVLVPWYFGIDVCHSGBOEWFOWYCFWFOBOUIGECWBDQIFPZWGEGBQPHFCXVVSLKFKPDFSLVVSEQHVPOSBECZGZNOQPKHDCQJWOGGUCGSBPTMSYTWQSGGCFTZWGGGWYECIYVZSDUKOJUOGHGACGGTCCYOFONSHFUQSWGPFLVSDCQHSNVOBOEIZEKJOEGUFPGBSCAFSNQUBTBWBRKHGATCTZWBRTODCCVOBNGHCZWFVPCZHSJODAKBSDUOBOVVSQWHICGCTZWFDWCBSE";
       ciphertext=ciphertext.toLowerCase();
        int keyLength = findKeyLength(ciphertext);
        System.out.println("Key length is "+keyLength);
        String key = findKey(ciphertext, keyLength);
        System.out.println("key is  "+key);
        String plaintext = decryptVigenere(ciphertext, key);
        System.out.println("Decrypted Text: " + plaintext);
    }

    // Step 1: Find the most frequent trigram and store it in a HashMap
    public static HashMap<String, Integer> findMostFrequentTrigram(String ciphertext) {
        HashMap<String, Integer> trigramMap = new HashMap<>();
        for (int i = 0; i < ciphertext.length() - 2; i++) {
            String trigram = ciphertext.substring(i, i + 3);
            trigramMap.put(trigram, trigramMap.getOrDefault(trigram, 0) + 1);
        }
        return trigramMap;
    }

    // Step 2: Find the maximum occurring trigram
    public static String findMaximumOccurringTrigram(HashMap<String, Integer> trigramMap) {
        return Collections.max(trigramMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    // Step 3: Calculate starting indexes of the trigrams
    public static ArrayList<Integer> calculateStartingIndexes(String ciphertext, String trigram) {
        ArrayList<Integer> indexes = new ArrayList<>();
        int index = -1;
        while ((index = ciphertext.indexOf(trigram, index + 1)) != -1) {
            indexes.add(index);
        }

        return indexes;
    }





 // Step 4: Find the length of the key using GCD of distances
 public static int findKeyLength(String ciphertext) {
    HashMap<String, Integer> trigramMap = findMostFrequentTrigram(ciphertext);
    
    String maxTrigram = findMaximumOccurringTrigram(trigramMap);

    ArrayList<Integer> startingIndexes = calculateStartingIndexes(ciphertext, maxTrigram);
    ArrayList<Integer> distances = new ArrayList<>();

    for (int i = 1; i < startingIndexes.size(); i++) {
        int distance = startingIndexes.get(i) - startingIndexes.get(i - 1);
        distances.add(distance);
    }

    // Find the greatest common divisor (GCD) of distances
    int keyLength = calculateGCD(distances);
    return keyLength;
}

// Helper function to calculate the GCD of a list of integers
public static int calculateGCD(ArrayList<Integer> numbers) {
    if (numbers.isEmpty()) {
        return 1; // Default to a key length of 1 if no distances are found
    }

    int gcd = numbers.get(0);
    for (int i = 1; i < numbers.size(); i++) {
        gcd = calculateGCD(gcd, numbers.get(i));
    }
    return gcd;
}

// Helper function to calculate the GCD of two integers using Euclid's algorithm
private static int calculateGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return Math.abs(a);
}

// Step 5: Make substrings and get a key for each substring using index of coincidence
public static String findKey(String ciphertext, int keyLength) {
    // Implement this function
    // Split the ciphertext into keyLength substrings
    // Calculate the key for each substring using index of coincidence
    // Combine the keys to form the final key
    StringBuilder finalKey = new StringBuilder();

    for (int i = 0; i < keyLength; i++) {
        String substring = extractSubstring(ciphertext, i, keyLength);
        //System.out.println("substring :-  "+ substring);
       
        int substringKey = breakShiftCipher(substring);
        finalKey.append((char) ('a' + substringKey));
    }
    return finalKey.toString();
}

// Helper function to extract a substring starting from index with a given step
private static String extractSubstring(String text, int startIndex, int step) {
    StringBuilder substring = new StringBuilder();
    for (int i = startIndex; i < text.length(); i += step) {
        substring.append(text.charAt(i));
    }
    return substring.toString();
}


///===---------------------------------------------------






///==--------------------------------------

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
            char qi = (char) (((pi - 'a' + j) % 26) + 'a');

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


   // Step 6: Decrypt the Vigenère cipher using the key
public static String decryptVigenere(String ciphertext, String key) {
    StringBuilder plaintext = new StringBuilder();
    int keyLength = key.length();
    
    for (int i = 0; i < ciphertext.length(); i++) {
        char ciphertextChar = ciphertext.charAt(i);
        char keyChar = key.charAt(i % keyLength);

        if (Character.isLetter(ciphertextChar)) {
            // Determine whether the character is uppercase or lowercase
            boolean isUpperCase = Character.isUpperCase(ciphertextChar);
            char base = isUpperCase ? 'A' : 'a';

            // Perform the Vigenère decryption
            char decryptedChar = (char) (((ciphertextChar - keyChar + 26) % 26) + base);
            plaintext.append(decryptedChar);
        } else {
            // If the character is not a letter, leave it unchanged
            plaintext.append(ciphertextChar);
        }
    }
    
    return plaintext.toString();
}

}
