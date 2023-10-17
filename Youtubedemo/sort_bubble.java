package Youtubedemo;

public class sort_bubble {
    public static void printt(int[] arrr){
        System.out.println("sprted array is: ");
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr= {6, 4, 2, 9, 7, 3};

        //bubble sort logic
        //time complexity: O(n^2)
        for(int i=0; i < arr.length-1; i++){
            for (int j=0;j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){ //descending (for ascending arr[j]<arr[j+1])
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printt(arr);//function call for printing the sorted array
    }
}
