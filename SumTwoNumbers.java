import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

//input --> distinct numbers

//array with two elements equivalent to sum of two numbers

public class SumTwoNumbers {

    public static void main(String[] args) {
        int[] array = {3,2,4};
        int targetSum=6;
//        Map<Integer, Integer> numMap = Arrays.stream(arr).boxed().collect(Collectors.toMap(j -> j, j -> j));
//        System.out.println(numMap);
//        Map<Integer, Integer> numMap = Arrays.stream(array).boxed().collect(Collectors.toMap(j->j, j->j));
//        for(int i=0;i<array.length;i++){
//            int foundValue =array[i]>0?targetSum-array[i]:targetSum+array[i];
//            if(foundValue!=array[i] && numMap.containsKey(foundValue)){
//                int[] returnArray = new int[2];
//                returnArray[0]=foundValue;
//                returnArray[1]=array[i];
//                System.out.println("found");
//            }
//        }
        System.out.println(Arrays.toString(twoSum(array, targetSum)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new TreeMap<>();
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++){
            numMap.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            if(numMap.containsKey(target-nums[j])){
                output[0]=j;
                output[1]=numMap.get(target-nums[j]);
                if(output[0]!=output[1]) {
                    break;
                }
            }
        }
        return output;
    }
}
