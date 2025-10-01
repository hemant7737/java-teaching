class Mat {
    public static void main(String[] ar) {
        {
        int arr[][]=new int[][]{{2,3,4,5,34},{11,32,31,44,33},{47,67,43,90,122},{12,36,77,66,222},{12,36,77,66,222}};
        int a=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            // for(int j=0;j<arr[i].length;j++)
            // {
            //     System.out.println(arr[i][a]);
            //     a--;
            //     break;
            // }
            while(a >= 0) {
                System.out.println(arr[i][a]);
                a--;
                break;
            }
        }
        }
    }
}