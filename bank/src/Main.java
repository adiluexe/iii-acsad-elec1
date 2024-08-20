public class Main {
    public static void main(String[] args) {
        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        System.out.println("\nGroup 8\n");
        System.out.println("Balance in BankA: $" + bankA.getBalance());
        System.out.println("Balance in BankB: $" + bankB.getBalance());
        System.out.println("Balance in BankC: $" + bankC.getBalance());
    }
}