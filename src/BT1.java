import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Giá trị của các phần tử trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": " + array[i]);
        }
    }
}