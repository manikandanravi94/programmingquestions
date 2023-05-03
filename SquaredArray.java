import java.util.Arrays;

/*
question is given in an sorted array and hence when we take the absolute value, it will compare
and rearrange the order of an element.

points to note: mostly if we are working on the array.. rearrange the element takes high time
and hence we can create a new array and copy the content back to it.
 */
public class SquaredArray {

    public static void main(String[] args) {
        int[] input ={-11,-4,-1,1,2,5,10};
        System.out.println(Arrays.toString(getOrderedSquaredArray(input)));
    }

    public static int[] getOrderedSquaredArray(int[] array){
        int[] output = new int[array.length];

        int counter=array.length-1;
        int leftPointer =0;
        int rightPointer= array.length-1;
        for(int i=0;i< array.length;i++){
            if (Math.abs(array[leftPointer]) > Math.abs(array[rightPointer])) {
                output[counter-i]=array[leftPointer]*array[leftPointer];
                leftPointer++;
            }else{
                output[counter-i]=array[rightPointer]*array[rightPointer];
                rightPointer--;
            }
        }
        return output;
    }
}
