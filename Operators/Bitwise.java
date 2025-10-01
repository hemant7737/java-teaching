class Bitwise {
    public static void main(String[] arg) {
        // Bitwise
        // &, |, ^
        // 10 & 10 = ?
        System.out.println(10&10);

        System.out.println(10|10);

        System.out.println(10^10);

        System.out.println(5&1);
        
        System.out.println(5&0);

        int n = 3;
        //int r = n&1;
        // if(r == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
        System.out.println((n&1)==0?"Even":"Odd");

        // [1,1,43,43,3,3,6,8,8,6,10]
        int[] arr = new int[]{1,1,43,43,3,3,6,10,8,6,10};
        int ans = 0;
        for(int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
            System.out.print("ANS = "+ans+",");
        }
        System.out.println(ans);


        // 0 ^ 0 = 0
        // 1 ^ 1 = 0
        // 0 ^ 1 = 1;
        // 1 ^ 0 = 1;

        // 4 ^ 0 = 
    }
}