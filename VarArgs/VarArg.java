public class VarArg {


    public void print(int y, int... x) {
        System.out.println(y);
        System.out.println(x);
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }

    public void p1(int... x) {

    }
    public void p1(int[] x) {

    }   


    public static void main(String[] arg) {
        VarArg obj = new VarArg();
        obj.print(10);
        obj.print(10,213,2342);
        obj.print(10,79837984,5454,454,454545,1224);
        obj.print(34,56,7,5,4343);


    }
}