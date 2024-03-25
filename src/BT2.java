import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        double[] array = new double[n];
        double sum = 0;
        System.out.println("Nhập giá trị của các phần tử trong mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
        double average = sum / n;
        System.out.println("Giá trị trung bình cộng của các phần tử trong mảng: " + average);
    }
}