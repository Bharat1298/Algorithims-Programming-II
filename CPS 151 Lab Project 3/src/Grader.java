/**
 * Lab 2 - Grader
 * Practice making objects and classes by implementing
 * a grader program that stores grade values and gives
 * a average grade based on weight.
 * 
 * @author Bharat Khadka
 */

import java.util.ArrayList;

public class Grader {
    // Class variables for each category
    private ArrayList<Double> homeworkGrades;
    private ArrayList<Double> labGrades;
    private ArrayList<Double> midtermGrades;
    private double finalExamGrade;

    // Constructor
    public Grader() {
        homeworkGrades = new ArrayList<>();
        labGrades = new ArrayList<>();
        midtermGrades = new ArrayList<>();
        finalExamGrade = 0.0;
    }

    // Setter methods,
    // @param grades to be entered
    // @return nothing
    public void addHW(double grade) {
        homeworkGrades.add(grade);
    }

    public void addLab(double grade) {
        labGrades.add(grade);
    }

    public void addMid(double grade) {
        midtermGrades.add(grade);
    }

    public void addFinal(double grade) {
        finalExamGrade = grade;
    }

    // Method to calculate the average of a list of grades
    // @param list of grades to be calculated
    // @return average of the list
    private double calculateAverage(ArrayList<Double> grades) {
        if (grades.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to calculate the final grade
    // @param nothing
    // @return final grade to be used for determining letter grade
    public double calculateFinalGrade() {
        double homeworkAverage = calculateAverage(homeworkGrades);
        double labAverage = calculateAverage(labGrades);
        double midtermAverage = calculateAverage(midtermGrades);

        // Calculate final numerical grade
        double finalGrade = (homeworkAverage * 0.10) + (labAverage * 0.40) + 
                            (midtermAverage * 0.25) + (finalExamGrade * 0.25);

        // Print the final alphabetical grade
        return finalGrade;
    }

    // Method to print the final alphabetical grade
    public void printFinalGrade() {
    	double finalGrade = calculateFinalGrade();
        if (finalGrade >= 93) System.out.println("A");
        else if (finalGrade >= 90) System.out.println("A-");
        else if (finalGrade >= 87) System.out.println("B+");
        else if (finalGrade >= 83) System.out.println("B");
        else if (finalGrade >= 80) System.out.println("B-");
        else if (finalGrade >= 77) System.out.println("C+");
        else if (finalGrade >= 73) System.out.println("C");
        else if (finalGrade >= 70) System.out.println("C-");
        else if (finalGrade >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
