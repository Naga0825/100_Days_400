class CountOddEven{
    public static void count(int[] arr){
        int oddCount = 0;
        int evenCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 1)
            oddCount++;
            else 
            evenCount++;
        }
        System.out.println("Even = " + evenCount);
        System.out.println("Odd = " + oddCount);
    }
    public static void main(String[] args){
        int arr[] = {2, 5, 7, 8, 10};
        count(arr);
    }
}
