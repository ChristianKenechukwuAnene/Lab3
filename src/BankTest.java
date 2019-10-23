public class BankTest {
    public static void main(String[] args) {
        SavingsAccount dollar = new SavingsAccount("christ",04476541,100.00,);
        System.out.println(dollar.toString());

        dollar.lodge(300);
        System.out.println(dollar.getBalance());

        dollar.withdraw(50);
        System.out.println(dollar.getBalance());

        System.out.println(dollar.calcTax());
    }

}
