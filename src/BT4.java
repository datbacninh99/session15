import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập giá trị cho các phần tử trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng: " + max);
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
