import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int totalMarks = 0;
        int totalMaxMarks = numSubjects * 100; // Assuming each subject has a maximum of 100 marks

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            int marks = scanner.nextInt();
            totalMarks += marks;
        }

        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Total maximum marks: " + totalMaxMarks);
        System.out.println("Average percentage: " + averagePercentage);

        char grade = calculateGrade(averagePercentage);
        System.out.println("Grade: " + grade);
    }

    private static char calculateGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else if (percentage >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}