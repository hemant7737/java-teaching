1. Given an array of integer [1,2,3,4,5,6,7,8,9,10].

Write a program that will copy an array into an another array.

int[] a = new int[5];
int[] b = new int[5];
b = a;

---------------------------------
What is the result of the following class? (Choose all that apply)
1: public class _C {
        2: private static int $;
        3: public static void main(String[] main) {
        4: String a_b;
        5: System.out.print($);
        6: System.out.print(a_b);
7:      } 
    }
A. Compiler error on line 1.
B. Compiler error on line 2.
C. Compiler error on line 4.
D. Compiler error on line 5.
E. Compiler error on line 6.
F. 0null
G. nullnull
------------------------------------------------------------------
1: public class BearOrShark {
2: public static void main(String[] args) {
        3: int luck = 10;
        4: if((luck>10 ? luck++: --luck)<10) {
        5: System.out.print("Bear");
        6: } if(luck<10) System.out.print("Shark");
7: } }
A. Bear
B. Shark
C. BearShark
D. The code will not compile because of line 4.
E. The code will not compile because of line 6.
F. The code compiles without issue but does not produce any output.

-----------------------------------------------------------------------
What is the output of the following program?
1: public class Dog {
    2: public String name;
    3: public void parseName() {
            4: System.out.print("1");
            5: try {
                6: System.out.print("2");
                7: int x = Integer.parseInt(name);
                8: System.out.print("3");
            9: } catch (NumberFormatException e) {
                10: System.out.print("4");
            11: }
    12: }
    13: public static void main(String[] args) {
            14: Dog leroy = new Dog();
            15: leroy.name = "Leroy";
            16: leroy.parseName();
            17: System.out.print("5");
18:     } 
}
A. 12
B. 1234
C. 1235
D. 124
E. 1245
F. The code does not compile.
G. An uncaught exception is thrown.

------------------------------------------------------------------------------
What is printed by the following? (Choose all that apply)
1: public class Mouse {
2: public String name;
    3: public void run() {
            4: System.out.print("1");
            5: try {
                6: System.out.print("2");
                7: name.toString();
                8: System.out.print("3");
            9: } catch (NullPointerException e) {
                10: System.out.print("4");
                11: throw e;
            12: } catch(Exception e1) {
                    System.out.println("6");
                }
            }
            13: System.out.print("5");
    14: }
    15: public static void main(String[] args) {
        16: Mouse jerry = new Mouse();
        17: jerry.run();
        18: System.out.print("6");
    19: } 
}
A. 1
B. 2
C. 3
D. 4
E. 5
F. 6
G. The stack trace for a NullPointerException
-------------------------------------------------
1. Print Fibonacci series using loop.

2. Reverse a number without using String.

3. Convert a decimal number to binary using loop.





-----------------------------------------------------------
com
    ->learning
                ->java
                    ->datatype
                        .java
                    ->array
                        .java
                    ->loops
                        .java
                    ->operators
                        .java

build->
        com->
            learning->
                    java
                        ->datatype
                            .class
                        ->array
                            .class                        
                        ->loops
                            .class                        
                        ->operators
                            .class                        


--------------------------------------------------------------------------
