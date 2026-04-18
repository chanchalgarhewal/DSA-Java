public class MissingNumber {
    static int findMissing(int[] arr,int n) {
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return totalSum - actualSum;
    }
    public static void main(String[] args){
        int arr[]={2,3,4,5};
        int n=5;

        System.out.println("ARRAY:[2,3,4,5]");
        System.out.println("Missing Number:"+findMissing(arr,n));


    }
}
