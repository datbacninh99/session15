import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị cần tìm: ");
        int findNumber = scanner.nextInt();
        int sum = 0;
        System.out.println("Các phần tử có giá trị bằng " + findNumber + " và chỉ số của chúng:");
        for (int i = 0; i < n; i++) {
            if (array[i] == findNumber) {
                System.out.println("Phần tử thứ " + (i + 1) + ": " + array[i]);
                sum += array[i];
            }
        }
        System.out.println("Tổng các phần tử có giá trị bằng " + findNumber + " là: " + sum);
    }
}