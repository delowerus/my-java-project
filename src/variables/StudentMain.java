package variables;

public class StudentMain {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();

        System.out.println(Student.getNumberOfStudents());
        System.out.println(s1.id);
        System.out.println(s2.id);
        System.out.println(s3.id);
        System.out.println(s4.id);
    }
}
