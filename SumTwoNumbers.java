import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//input --> distinct numbers

//array with two elements equivalent to sum of two numbers

public class SumTwoNumbers {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};
        int targetSum=6;
//        Map<Integer, Integer> numMap = Arrays.stream(arr).boxed().collect(Collectors.toMap(j -> j, j -> j));
//        System.out.println(numMap);
        Map<Integer, Integer> numMap = Arrays.stream(array).boxed().collect(Collectors.toMap(j->j, j->j));
        for(int i=0;i<array.length;i++){
            int foundValue =array[i]>0?targetSum-array[i]:targetSum+array[i];
            if(foundValue!=array[i] && numMap.containsKey(foundValue)){
                int[] returnArray = new int[2];
                returnArray[0]=foundValue;
                returnArray[1]=array[i];
                System.out.println("found");
            }
        }
    }
}
