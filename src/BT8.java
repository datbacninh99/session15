import java.util.Scanner;
import java.util.Arrays;

public class BT8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị cần cập nhật:");
        int updateValue = scanner.nextInt();

        System.out.println("Nhập chỉ số phần tử cần cập nhật:");
        int updateIndex = scanner.nextInt();
        if (updateIndex >= 0 && updateIndex < n) {
            array[updateIndex] = updateValue;
        } else {
            System.out.println("Chỉ số không hợp lệ.");
        }
        System.out.println("Mảng sau khi cập nhật: " + Arrays.toString(array));
    }
}