public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {0,1,21,33,45,45,61,71,72,73};
        //int[] arr = {1,5,23,111};
        int target=33;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] array, int target){

        int start=0;
        int end=array.length-1;

        while(start!=end){
            int mid=(start+end)/2;
            if(array[start]==target)
                return start;
            if(array[end]==target)
                return end;
            if(array[mid]==target){
                return mid;
            }
            if(array[mid]>target){
                end=mid;
            }else{
                start=mid+1;
            }

        }
        return -1;
    }
}
