import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng của mảng: ");
        int row = scanner.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int col = scanner.nextInt();
        int[][] array = new int[row][col];
        int sum = 0;
        System.out.println("Nhập giá trị các phần tử trong mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Phần tử tại dòng " + (i + 1) + " cột " + (j + 1) + ": ");
                array[i][j] = scanner.nextInt();
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("Giá trị của các phần tử chẵn trong mảng và tổng của chúng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] % 2 == 0) {
                    if (array[i][j] % 2 == 0) {
                        System.out.println("Phần tử tại dòng " + (i + 1) + " cột " + (j + 1) + ": " + array[i][j]);
                    }
                }
            }
        }
        System.out.println("Tổng các phần tử chẵn trong mảng: " + sum);
    }
}
