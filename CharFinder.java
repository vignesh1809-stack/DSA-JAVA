import java.util.HashMap;

public class CharFinder {

    public char firstNonRepeatingChar(String s) {
        s = s.replace(" ", "");
        HashMap<Character, Integer> myMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
        }


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (myMap.get(ch) == 1) {
                return ch;
            }

        }
        return 'N';
    }
}
