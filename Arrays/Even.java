public class Even {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int k=1;
        for(int j=0;j<10;j++)
        {
            if(k%2==0) {
                arr[j] = k;
            }
            else {
                j--;
            }
            k++;
        }
        for(int i=0;i<10;i++) {
            System.out.println(arr[i]);
        }
    }

}