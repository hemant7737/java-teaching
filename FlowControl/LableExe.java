class LableExe {
    public static void main(String[] arg) {

        l1:
        System.out.print("Hellow");
        for(int i=0; i < 5;i++) {
            System.out.print(i);
            l2:
            for(int j=0; j < 5;j++) {
                System.out.print(j);
                l3:
                for(int k=0; k < 5;k++) {
                    System.out.print(k);
                    continue l2;
                } 
                System.out.println();
            }
            System.out.println();                    
        }
        System.out.println();
    }
}