class StringOp {
    public static void main(String[] arg) {
        int x = 10;
        int y = 80;
        int z = 300;

        int a = 30;

        String s = "test";

        System.out.println(x+y+z); // 390
        System.out.println(x+a+y+z); // 420
        System.out.println(a+s+x+y+z); // 30test390
        System.out.println(z+a+s+x+y); // 330test1080
        System.out.println(z+a+s+x+y); // 330test1080
        System.out.println((z+a+s)+(x+y)); // 330test90
        System.out.println(z+(a+(s+x)+y)); // 30030test1080 --
        System.out.println((z+a)+(s+x)+y); //  330test1080

        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuilder b1 = new StringBuilder("hellob");
        StringBuilder b2 = new StringBuilder("hellob");

        System.out.println(b1==b2); // nai pata
        System.out.println(b1.equals(b2)); // true

    }
}