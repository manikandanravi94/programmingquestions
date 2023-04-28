import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
subsequence of second array should have matching elements in the first array in the sequence.
 not necessarily all the elements to be present in the second array
*/
public class CheckSubsequenceArray {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 6, -1, 10));
        System.out.println(isValidSubsequence(array, sequence));
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int count = 0;
        int index = 0;
        for (Integer k : array) {
            if (sequence.get(index).equals(k)) {
                count++;
                index++;

            }
            if (count == sequence.size()) {
                return true;
            }
        }
        return false;
    }

}
