/**
 * Sample project for Data Dependency Graph (DDG) testing.
 */

public class Main {
    static Integer a = 1;
    
    public static void main(String[] args) {
        for (int i = 0; i < a; i++) {
            Integer b = a;
            b = 3;
        }
        
        for (int i = 0; i < a; i++) {
            Integer b = a;
            Integer c = a;
            System.out.println(a + b + c);
        }
    }
}
