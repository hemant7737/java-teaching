public class InstanceExe {

    private int i = 10;
    private boolean f = true;

    void add() {
        System.out.println(i);
        System.out.println(f);
    }

    // void print() {
    //     System.out.println("Value of i"+ i);

    //     intadd();
    // }

    public static void main(String[] arg) {
        
        InstanceExe obj = new InstanceExe();
        obj.add();
        obj.i = 20;
        
        InstanceExe obj2 = new InstanceExe();
        
        // System.out.println(obj.i);
        // System.out.println(obj.f);

        // System.out.println(obj2.i);
        // System.out.println(obj2.f);

        obj.add();



        obj2.add();
        
        
    }


    
}