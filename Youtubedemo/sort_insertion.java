package Youtubedemo;

public class sort_insertion {

    public static void printt(int[] arrr){
        System.out.println("sorted array is: ");
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr= {6, 4, 2, 9, 7, 3};

        //insertion sort logic
        //time complexity: O(n^2)
        for(int i=0;i<arr.length;i++)
        {
            int key= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        printt(arr);//function call for printing the sorted array
    }

}
