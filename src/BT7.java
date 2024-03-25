import java.util.Scanner;
import java.util.Arrays;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị cần chèn:");
        int addValue = scanner.nextInt();
        System.out.println("Nhập chỉ số chèn phần tử vào mảng:");
        int addIndex = scanner.nextInt();
        int[] newArray = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < addIndex)
                newArray[i] = array[i];
            else if (i == addIndex)
                newArray[i] = addValue;
            else
                newArray[i] = array[i - 1];
        }
        System.out.println("Mảng sau khi chèn: " + Arrays.toString(newArray));
    }
}
