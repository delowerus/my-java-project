package variables;

/* Understanding static:
* - a variable, a method and a class can be declared as static
* - static class members (variables, methods) belong to the class itself not to the objects of that class
* - a static method can access only other static variables and methods
* - we can call static method by class name
*
*
* */

public class StaticMethod {
    //non static variable
    int count = 0;

    // non static method
    public int add(int a, int b){
        count++;
        return a + b;
    }

    // static method
    public static int sub(int a, int b){
        return a - b;
    }

    public static void main(String[] args) {
        StaticMethod sc = new StaticMethod();

        // call add() method
        System.out.println(sc.add(3, 4));
        System.out.println(sc.add(5, 6));
        System.out.println(sc.add(7, 8));
        System.out.println("Count: " + sc.count);

        // call sub() method
        System.out.println(sub(10, 5));
        System.out.println(StaticMethod.sub(20, 10));
    }
}
