import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng: ");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột trong mảng: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        System.out.println("Nhập giá trị của các phần tử trong mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Phần tử tại dòng " + (i + 1) + " cột " + (j + 1) + ": ");
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Giá trị các phần tử trong mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("[%d]", array[i][j]);
            }
            System.out.println();
        }
    }
}