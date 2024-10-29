package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount gabrielHutagaol = new BankAccount(100);
        gabrielHutagaol.withdraw(10);
        gabrielHutagaol.deposit(30);
        System.out.println(gabrielHutagaol.getSaldo());
    }
}