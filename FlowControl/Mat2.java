public class Mat2 {
    public static void main(String[] arg)
    {
        int arr[][]=new int[][]{{2,3,4,},{11,32,31},{47,67,43}};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(i+j==arr.length-1)
                {
                    System.out.println(arr[i][j]);
                }
            }
        }
    
    }
}