class EvenUsingContinue {
    public static void main(String[] arg) {
//   int num=10;
//         while(num>=10 && num<21)
//         {
//             if(num%2!=0)
//             {
//                 num++;
//                 continue;
//             }
        
//             System.out.println(num);
//             num++;
//         }

        for(int i = 10; i <=20; i++) {
            if(i%2!=0)
            {
                continue;
            }
             System.out.println(i);
        }
    }
}