public class Main {

    public static void main(String[] args){

        for(int i = 1; i <= 5; i++){
            LPAstudent s = new LPAstudent("S92300" + i,
                    switch(i){
                case 1 -> "Mary";
                case 2 -> "Carol";
                case 3 -> "John";
                case 4 -> "Tom";
                case 5 -> "Yuki";
                default -> "Wala na information";
                    },
                    "05/11/1985",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S923006", "Ann", "05/11/1985", "Java Masterclass");
        LPAstudent recordStudent = new LPAstudent("S923007", "Bill", "05/11/1985", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        pojoStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}
