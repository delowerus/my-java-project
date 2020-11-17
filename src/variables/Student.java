package variables;

public class Student {
    //instance variables
    String name;
    int id = 0;

    // static variable
    static int count = 0;

    //constructor
    public Student(){
        count++;
        id = count;
    }

    // get number of students
    public static int getNumberOfStudents(){
        return count;
    }
}
