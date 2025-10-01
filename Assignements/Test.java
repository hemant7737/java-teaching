public class Test {
    public String name;
    public void run() {
            System.out.print("1");
            try {
                System.out.print("2");
                name.toString();
                System.out.print("3");
            } catch (NullPointerException e) {
                System.out.print("4");
                try {
                    throw e;
                } catch(RuntimeException e2) {

                }
            } catch(RuntimeException e1) {
                System.out.println("6");
            }
            System.out.print("5");
    }
    public static void main(String[] args) {
        Test jerry = new Test();
        jerry.run();
        System.out.print("6");
    } 
}