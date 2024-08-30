package LOOP;

public class NestedLoop {
    public static void main(String[] args) {
        for (int count = 0; count < 10; count++) {
            for (int i = 0; i < 7; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
