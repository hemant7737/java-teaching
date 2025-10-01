class Reverse {
    public static void main(String[] arg) {
        int[] arr = new int[]{1,2,3,4,5,1,2,3,4};
        System.out.println(arr.length);
        int f = 0;
        int b = arr.length-1;
        int itr = 0;
        while(f<b) {
            int temp = arr[b];
            arr[b] = arr[f];
            arr[f] = temp;
            f++;
            b--;
            itr++;
        } 

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }   
        System.out.println();
        System.out.println(itr);    
    }
}