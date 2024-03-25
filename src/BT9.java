import java.util.Scanner;
import java.util.Arrays;

public class BT9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập chỉ số phần tử cần xóa:");
        int deleteIndex = scanner.nextInt();
        if (deleteIndex >= 0 && deleteIndex < n) {
            int[] newArray = new int[n - 1];
            for (int i = 0, j = 0; i < n; i++) {
                if (i != deleteIndex) {
                    newArray[j++] = array[i];
                }
            }
            array = newArray;
        } else {
            System.out.println("Chỉ số không hợp lệ.");
        }
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(array));
    }
}