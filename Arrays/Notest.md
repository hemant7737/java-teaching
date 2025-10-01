Array - Data Structure

Array is an indexed collection of fixed no. of homogeneous data elements.


[10][20][12][10][01][20][50]
 0   1  2 3 4 5 6 7 8 9
 Declarations:
        
        int[] arr;
        int arr[];
        int []arr;

        int[][] arr;
        int arr[][];
        int[] arr[];
        int []arr[];

Initialization:

    long l = Long.MAX_VALUE;
    long[] arr = new long[l]; // long type is Not allowed


Single Line :

    byte[] barr = new int[]{1,2,3,4,5,6,7,8,9};



Write a program to store first 10 even numbers into an array.

public class Even {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int k=1;
        for(int j=0;j<10;j++)
        {
            if(k%2==0) {
                arr[j] = k;
            }
            else{j--;}
            k++;
        }
        for(int i=0;i<10;i++) {
            System.out.println(arr[i]);
        }
    }



[1,2,3,4,5]
[5,4,3,2,1]


------------------------------------------------------
Reverse of an array:
int[] arr = [1,2,6,3,4,5];

int f = 0;
int b = arr.length-1;
while(b>f) {
    int temp = arr[b];
    arr[b] = arr[f];
    arr[f] = temp;
    f++;
    b--;
}











