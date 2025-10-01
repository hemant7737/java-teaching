class Iterative {
    public static void main(String[] arg) {

        // Iterative
        // int i = 5;
        // boolean b = true;
        // while(b)
        //     System.out.println("while!");

        // System.out.println("a");

        // Do while

        // do {
        //     System.out.println("Do While!");
        // } while(false);

        // do while(true)
        // System.out.println("While!");
        // while(false);


        // System.out.println("While");


        
        // int j = Integer.parseInt(arg[0]);
        // for(int i = 1;i<=10;i++){
        //     System.out.println(j+"x"+i+"="+j*i);
        // }

        // int j = 2;

        // for(int i = 1; i <= 10; i++) {
        //     j = i *j;
        //     System.out.println(j);
        // }


        // 2, 5, 8, 11, 14, 17,20, 23, 26, 29



        // for each
        // int[] arr = new int[]{1,2,3,4,5,6};

        // for(int v:arr) {
        //     System.out.println(v);
        // }

        int[][] arr1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        for(int[] a:arr1) {
        //    System.out.println(a);
            for(int b:a) {
                System.out.println(b);
            }
        }
            
    }
}