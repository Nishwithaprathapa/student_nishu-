import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        int[] grades = new int[numStudents];
        System.out.println("Enter the grades of the students:");

        for (int i = 0; i < numStudents; i++) {
            grades[i] = scanner.nextInt();
        }

        int highestGrade = getHighestGrade(grades);
        int lowestGrade = getLowestGrade(grades);
        double averageGrade = getAverageGrade(grades);

        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
        System.out.println("Average Grade: " + averageGrade);
    }

    private static int getHighestGrade(int[] grades) {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    private static int getLowestGrade(int[] grades) {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }

    private static double getAverageGrade(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
