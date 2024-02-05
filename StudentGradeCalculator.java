package CodsoftTasks;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        float averagePercentage, totalSubjects;
        int totalMarks = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of Subjects: ");
        totalSubjects = sc.nextFloat();
        for (int i = 1; i <= totalSubjects; i++) {
            System.out.println("Enter the Marks of Subject " + i + ":");
            totalMarks += sc.nextFloat();
        }
        averagePercentage = (totalMarks / totalSubjects);
        if (averagePercentage >= 85) {
            System.out.println("Total Marks: " + totalMarks + " , Average Percentage: " + averagePercentage + " ,Grade A");
        } else if (averagePercentage >= 70) {
            System.out.println("Total Marks: " + totalMarks + " , Average Percentage: " + averagePercentage + " ,Grade B");
        } else if (averagePercentage >= 60) {
            System.out.println("Total Marks: " + totalMarks + " , Average Percentage: " + averagePercentage + " ,Grade C");
        } else {
            System.out.println("Total Marks: " + totalMarks + " , Average Percentage: " + averagePercentage + " ,Grade D");
        }
    }
}

