class SoftwareDeveloper extends Job {
    public SoftwareDeveloper(int salary, int yearsOfExperience, String jobPosition, String companyName) {
        super(salary, yearsOfExperience, jobPosition, companyName);
    }

    @Override
    public int getSalary() {
        if (yearsOfExperience > 3) {
            return (int) (salary * .3) + salary;
        } else {
            return (int) (salary * .05) + salary;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SoftwareDeveloper developer1 = new SoftwareDeveloper(50000, 4, "Senior Developer", "ComSoc");
        SoftwareDeveloper developer2 = new SoftwareDeveloper(45000, 2, "Junior Developer", "Concentrix");
        SoftwareDeveloper developer3 = new SoftwareDeveloper(60000, 5, "Lead Developer", "Alorica");

        System.out.println("\n");
        System.out.println("Group 8");
        System.out.println("");
        developer1.displaySummaryDetails();
        System.out.println("\n");

        developer2.displaySummaryDetails();
        System.out.println("\n");

        developer3.displaySummaryDetails();
        System.out.println("\n");

    }
}