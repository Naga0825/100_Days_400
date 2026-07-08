import java.util.Arrays;
class hasDuplicates {
    public static boolean removeDuplicates(int[] arr){
        if(arr.length == 1) return false;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1])
              return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3,3};
        boolean result = removeDuplicates(arr);
        System.out.println(result);
    }
}
