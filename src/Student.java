public class Student {
    private String name;
    private String surname;
    private int age;
    private int group;
    private int attendance;
    private double averageScore;
    private boolean presence;


    public Student(String name, String surname, int age, int group, int attendance, double averageScore, boolean presence) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.group = group;
        this.attendance = attendance;
        this.averageScore = averageScore;
        this.presence = presence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public boolean isPresence() {
        return presence;
    }

    public void setPresence(boolean presence) {
        this.presence = presence;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", attendance=" + attendance +
                ", averageScore=" + averageScore +
                '}';
    }
}
