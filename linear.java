class Main {
    public static int linear(int arr[] , int target){
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                found = true;
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {2,7,9,11};
        int target = 7;
        int value = linear(arr,target);
        System.out.println("The indexing position of " + target + " is " +value);
    }
}
