class EqualityOp {
    public static void main(String[] arg) {
        int a = 10;
        int b = 20;
        int c = 10;
        boolean b1 = true;
        boolean b2 = false;

        System.out.println(a==b);
        System.out.println(a==c);

        Object obj1 = new Integer(10);
        Object obj2 = null;

       System.out.println(obj1 == obj2);

        System.out.println(obj1 == null);
        
        // System.out.println(b1 == b2);

        // System.out.println(!true != !false ? (!false ? false : true) : true);




    }
}