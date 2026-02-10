import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
        return Character.MIN_VALUE;
    }
    public char firstRepeatedChar(String s){
        s = s.replace(" ", "");
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return s.charAt(i);
            }
            set.add(s.charAt(i));
        }
        return Character.MIN_VALUE;
    }
}
