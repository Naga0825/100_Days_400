class Example{
    public static int maxElement(int[] arr){
        if(arr.length == 1) return arr[0];
        int max_element = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max_element ){
                max_element = arr[i];
            }
        }
        return max_element ;
    }
    public static void main(String[] args){
        int arr[] = {10,20,8,32,64};
        int result = maxElement(arr);
        System.out.println(result);
    }
}
