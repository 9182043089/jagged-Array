import java.util.Scanner;
public class JaggedArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for jaggedArray: ");
        int numRows = sc.nextInt();
        int[][] jaggedArray = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter number of columns for row " + i + ": ");
            int numCol = sc.nextInt();
            jaggedArray[i] = new int[numCol];
        }
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
