abstract class A {
    abstract void test();

    void print() {
        System.out.println("Class A");
    }
}

abstract class B extends A {
    abstract void test();

    void print() {
        System.out.println("Class B");
    }
}

class AbstractExe extends B {

    void test() {
        System.out.println("test");
    }

    public static void main(String[] arg) {
        A d = new AbstractExe();
        d.print();

    }


}