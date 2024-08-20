public class Main {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(84, 95, 85);
        StudentB studentB = new StudentB(74, 75, 88, 86);

        System.out.println("\nGroup 8\n");
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}