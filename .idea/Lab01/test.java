import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        System.out.println("Vui lòng chọn một tùy chọn:");
        System.out.println("1. Có");
        System.out.println("2. Không");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Bạn đã chọn 'Có'.");
                break;
            case 2:
                System.out.println("Bạn đã chọn 'Không'.");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
        scanner.close();
    }
}
