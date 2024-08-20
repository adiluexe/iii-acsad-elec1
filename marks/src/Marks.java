abstract class Marks {
    abstract double getPercentage();
}

class StudentA extends Marks {
    int subject1, subject2, subject3;

    // Constructor
    StudentA(int score1, int score2, int score3) {
        this.subject1 = score1;
        this.subject2 = score2;
        this.subject3 = score3;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3) / 3.0;
    }
}

class StudentB extends Marks {
    int subject1, subject2, subject3, subject4;

    // Constructor
    StudentB(int subject1, int subject2, int subject3, int subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    double getPercentage() {
        return (subject1 + subject2 + subject3 + subject4) / 4.0;
    }
}