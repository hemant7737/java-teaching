class DoWhileWithContinue {
      public static void main(String[] arg) {
        int x = 1;
        do {
            x++;
            
            if(x == 4) {
                continue;
            }
            System.out.print(x);
            

        }while(x < 5);
      }
}