import java.util.ArrayList;
import java.util.List;

public class Group implements Professor {
    private int countStudents;
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        countStudents = students.size();
    }

    public void viewStarosta() {
        for (Student st : students) {
            if (st.getAttendance() >= 90 && st.getAverageScore() >= 4.3) {
                System.out.println("Староста группы: " + st.getName() + " " + st.getSurname());
            }
        }
    }

    public void viewAllStudents() {
        for (Student st : students) {
            System.out.println(st);
        }
        System.out.println("Количество студентов в группе: " + countStudents);
    }

    @Override
    public void pereklichka() {
        int count = 0;
        System.out.println("Присудствуют :");
        for (Student st : students) {
            if (st.isPresence()) {
                System.out.println(st.getName() + " " + st.getSurname());
            } else {
                count++;
            }
        }

        if(countStudents > count){
            System.out.println("Отсутствующих студентов: " + count);
            for(Student st : students){
                if(!st.isPresence()){
                    System.out.println(st.getName() + st.getSurname());
                }
            }
        }
    }
}