class Continue {
    public static void main(String[] arg) {

        for(int i = 0; i < 3; i++) {
            System.out.println("Before Continue");
            go to lable 1;
            if(i % 2 == 0) {
                continue;
            }
            System.out.println("After Continue");
        }
        System.out.println("completed");
    }
}