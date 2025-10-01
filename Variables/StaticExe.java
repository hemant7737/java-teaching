class StaticExe {
    private static int i;
    private char c;
    private String s;

    public static void main(String[] arg) {
    
        System.out.println("Using ClassName: "+StaticExe.i);
        System.out.println("Directly: "+i);

        //System.out.println(c);

        StaticExe obj = new StaticExe();

        System.out.println(obj.c);
        System.out.println("Using Object reference: "+obj.i);
        System.out.println(obj.s);

        System.out.println("-----------------------------");
        obj.staticCheck();
    }


    void staticCheck() {
        System.out.println(c);
        System.out.println(s);

        System.out.println(i);

    }
}