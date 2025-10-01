public class Test {
    public static void main(String[] arg) {
     int array_variable [] = new int[10];
            for (int i = 0; i < 10; ++i) {
                array_variable[i] = i/2;
                array_variable[i]++;
                System.out.print(array_variable[i] + " ");
                i++;
            }

            String s = "\"Hello World\"";
            System.out.println(s);

            for(int i = 0; i <= 500; i++) {
                char c = (char)i;
                System.out.print(c+",");
            }
            
    }
}