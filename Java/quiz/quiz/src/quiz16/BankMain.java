package quiz16;

public class BankMain {
    public static void main(String[] args) {
        BankQueueSystem bankQueue = new BankQueueSystem();

        bankQueue.takeTicket("이경훈");
        bankQueue.takeTicket("홍길동");
        bankQueue.takeTicket("이성계");
        bankQueue.takeTicket("이방원");
        bankQueue.takeTicket("김나박이");

        System.out.println(bankQueue.callNextCustomer());
    }
}
