public class Main {

    public static void main(String[] arg) {
        B b = new B();
        //A a = new A();

        int sum = Test.sum(10,20);
        System.out.println(sum);

        Child c = new Child();
        int result = c.multiply(5,6);

        System.out.println(result);


    }
}