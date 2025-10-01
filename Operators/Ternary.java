class Ternary {
    public static void main(String[] arg) {
        final int i = 20;
        final int y = 58;
        
        byte b = true ? 2342 : 3230;
        byte c = false ? 2424 : 23423;
        System.out.println(b+"---"+c);

        b = i < y ? i : y;
        c = i > y ? y : i;
        System.out.println(b+"---"+c);
    }
}