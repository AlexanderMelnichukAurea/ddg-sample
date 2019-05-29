/**
 * Sample project for Data Dependency Graph (DDG) testing.
 */

public class Main {
    static Integer a = 1;
    
    public static void main(String[] args) {
        if (a == 0) {
            Integer b = a;
        } else {
            Integer c = a;
        }
        for (int i = 0; i < a; i++) {
            Integer b = a;
            Integer c = a;
            System.out.println(a + b + c);
        }
    }
}
