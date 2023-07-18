public class christmasTree {
    public static void main(String[] args) {

        // // 5 - 1:
        // for (int i = 5; i > 0; i--) {
        // for (int j = i; j > 0; j--) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // // 1 - 5:
        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // 1 - 5:

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
