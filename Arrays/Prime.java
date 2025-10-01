public class Prime {
    public static void main(String[] args)
    {
        int arr[]=new int[100];
        arr[0] = 2;
        int num=3;
        for(int i=0;i<arr.length;i++)
        {
            if(num>=2)
            { 
                int x=2;
                while(num>x)
                {
                    if(num%x==0)
                    {
                        num++;
                        i--;
                        break;
                    }
                    x++;
                }
                if(num==x)
                {
                    arr[i]=num;
                    num++;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        } 
    }
}