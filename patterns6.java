public class patterns6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <=2*n ; i++) {
            int totalColsInRow = i > n ? 2 * n - i : i;
            int NoOfSpaces = n - totalColsInRow;
            for (int s = 0; s < NoOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totalColsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
