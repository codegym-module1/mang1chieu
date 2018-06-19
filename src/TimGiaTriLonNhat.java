import java.util.Scanner;
public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
//        do {
//            System.out.print("Enter a size:");
//            size = scanner.nextInt();
//            if (size > 20)
//                System.out.println("Size should not exceed 20");
//        } while (size > 20);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap vao gia tri: ");
            int giatri = scanner.nextInt();
            array[i] = giatri;

        }
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }
        System.out.println("GTLN là: " + max);
        }
    }

