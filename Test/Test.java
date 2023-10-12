public class CustomOptions {
    public static void main(String[] args) {
        // Hiển thị tùy chọn cho người dùng
        System.out.println("Vui lòng chọn một tùy chọn:");
        System.out.println("1. Có");
        System.out.println("2. Không");

        // Đọc tùy chọn của người dùng
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Xử lý tùy chọn của người dùng
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

        // Đóng scanner
        scanner.close();
    }
}
