public class Main {
    public static void main(String[] args) {
        Group group1 = new Group();
        Group group2 = new Group();

        group1.addStudent(new Student("Alex1", "Prohorov1", 21, 1, 83, 4.6, true));
        group1.addStudent(new Student("Alex2", "Prohorov2", 20, 1, 93, 4.7, false));
        group1.addStudent(new Student("Alex3", "Prohorov3", 22, 1, 95, 4, true));

        group2.addStudent(new Student("Alex4", "Prohorov4", 22, 2, 73, 3.9, true));
        group2.addStudent(new Student("Alex5", "Prohorov5", 23, 2, 90, 4.3, true));
        group2.addStudent(new Student("Alex6", "Prohorov6", 19, 2, 88, 4.5, false));


        System.out.println("Студенты первой группы:");
        group1.viewAllStudents();

        System.out.println("Студенты второй группы:");
        group2.viewAllStudents();

        System.out.println("===========================================================================================");

        System.out.println("Староста первой группы:");
        group1.viewStarosta();

        System.out.println("Староста второй группы:");
        group2.viewStarosta();

        System.out.println("===========================================================================================");

        System.out.println("Перекличка первой группы:");
        group1.pereklichka();

        System.out.println("Перекличка второй группы:");
        group2.pereklichka();
    }
}
