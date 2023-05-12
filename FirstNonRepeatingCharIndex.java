import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepeatingCharIndex {


    public static void main(String[] args) {
        System.out.println(firstNonRepeatingCharacter("ggyllaylacrhdzedddjsc"));
    }

    public static int firstNonRepeatingCharacter(String string) {
        // Write your code here.
        Map<Character, Value> charCountMap = new TreeMap<>();
        int i = 0;
        for (char c : string.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, new Value(i, -1));
            } else {
                charCountMap.put(c, new Value(i, 1));
            }
            i++;
        }
        return charCountMap.values().stream().filter(value -> value.count == 1).map(value -> value.index).min(Comparator.comparing(Integer::intValue)).orElse(-1);
    }

    static class Value {
        int index;
        int count;

        Value(int index, int count) {
            this.index = index;
            this.count = count;
        }

    }
}
