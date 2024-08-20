public class Job {
    int salary;
    int yearsOfExperience;
    String jobPosition;
    String companyName;

    public Job(int salary, int yearsOfExperience, String jobPosition, String companyName) {
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.jobPosition = jobPosition;
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void displaySummaryDetails() {
        int calculatedSalary = getSalary();
        System.out.println("Salary: " + calculatedSalary);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Job Position: " + jobPosition);
        System.out.println("Company Name: " + companyName);
    }
}
