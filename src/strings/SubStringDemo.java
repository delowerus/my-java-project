package strings;

public class SubStringDemo {
    public static void main(String[] args) {
        String str = "68 clear";
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(0,2) + 10); //"735327"
        System.out.println(Double.parseDouble(str.substring(0, 2)));
        System.out.println(Double.parseDouble(str.substring(0, 2)) + 10);
        System.out.println(Integer.parseInt(str.substring(0, 2)) + 20);
    }
}
