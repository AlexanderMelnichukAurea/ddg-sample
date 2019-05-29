/**
 * Sample project for Data Dependency Graph (DDG) testing.
 */

public class Main {
    static int a = 0;
    
    public static void main(String[] args) {
        if (a == 0) {
            int b = 1;
        } else {
            int c = 2;
        }
        for (int i = 0; i < a; i++) {
            int b = 5;
            int c = 6;
        }
    }
}
