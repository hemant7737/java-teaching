class ShortCircuitOp {
    public static void main(String[] arg) {
        
        int i = 10;
        int j = 20;
        int k = 40;

        boolean a = true;
        boolean b = false;

        // if(b && a) {
        //     System.out.println("If");
        // } else {
        //     System.out.println("Else");
        // }

        // if(b || a) {
        //     System.out.println("If");
        // } else {
        //     System.out.println("Else");
        // }

        if(i==j && !b) {
            System.out.println("If");
        } else {
            System.out.println("Else");
        }

        if(i==j || !b) {
            System.out.println("If");
        } else {
            System.out.println("Else");
        }

        System.out.println()
    }
}