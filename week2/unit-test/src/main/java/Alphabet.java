public class Alphabet {
    private static boolean isVowel(int c) {
        return c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u';
    }

    public static int countVowels(String s) {
       return (int) s.toLowerCase().chars().
               filter(Alphabet::isVowel).count();
    }

    public static int countConstants(String s) {
        return s.length() - Alphabet.countVowels(s);
    }
}
