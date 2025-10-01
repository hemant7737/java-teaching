class Selection {
    public static void main(String[] arg) {

        float marks = 50;

        // 60 or 60 above -> I
        //  45 or greater than 45 and less than 60 -> II
        // 36 or greater than 36 and less than 45 -> III
        // less than 36 -> FAIL
        // if(marks > 60) {
        //     System.out.println("I");
        // } else if(marks >= 45 && marks < 60) {
        //     System.out.println("II");
        // } else if(marks >= 36 && marks < 45) {
        //     System.out.println("III");
        // } else {
        //     System.out.println("FAIL");
        // }

        byte grade = 3;
        switch(grade) {
            case 100+10: System.out.println("I"); break;
            case 12: System.out.println("II"); break;
            case 7: System.out.println("III");break;

            default: System.out.println("FAIL");

        }
    }
}