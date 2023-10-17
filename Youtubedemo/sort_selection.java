package Youtubedemo;

public class sort_selection {

    public static void printt(int[] arrr){
        System.out.println("sorted array is: ");
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr= {6, 4, 2, 9, 7, 3};

        //selection sort logic
        //time complexity: O(n^2)
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[j] <  arr[min])
                {
                    min = j;
                }
            }
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }

        printt(arr);//function call for printing the sorted array
    }

}
