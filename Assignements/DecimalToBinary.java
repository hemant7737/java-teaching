public class DecimalToBinary {
    public static String decimalToBinary(int num)
    {
        // int arr[]=new int[32];
        // for(int i=31;i>=0;i--)
        // {
        //     if(num>=0)
        //     {
        //         arr[i]=num%2;
        //         num=num/2;
        //     }
        //     else break;
        // }
        // return arr;

        String ans = "";
        while(num > 0) {
            ans = num % 2 + ans;
            num = num/2;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        // int arr[]=decimalToBinary(0);
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]);
        // }
        String result = decimalToBinary(10);

        System.out.println(decimalToBinary(10));

    }
}