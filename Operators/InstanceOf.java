class InstanceOf {
    public static void main(String[] arg) {



        // instanceof

        Object s = new String("Test");
        
        if(s instanceof Character) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}