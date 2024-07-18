/**
 * Lab 4 - FixMe
 * Practice debugging and deciphering errors in a program.
 * Broken code was supplied by instructor and the purpose
 * of the task was to fix all of the errors and get the program
 * working as expected. 
 * 
 * @author Bharat Khadka
 */

import java.util.ArrayList;

public class FixMe {

	public static void main(String[] args) {
		// Grader object
		Grader myGrader = new Grader();
		
		//number of assignments per category
		int hw = 4; //Changed from double to int
		int lab = 10;
		int midterms = 3;
		//add homework grades
	    double grade = hw;
	    for (int i = 0; i < hw; i++) { // Loop was originally missing iterator
	    	myGrader.addHW(grade);
	    	grade *= 2.9;
	    }
	    //add lab grades
	    grade = lab;
	    for (int i = 0; i < lab; i++) {// Originally missing the end condition
	    	myGrader.addLab(grade);
	    	grade *= 1.28;
	    }
	    //add midterm grades
	    grade = midterms;
	    for (int i = 0; i < midterms; i++) {// Variable i was not initialized
	    	myGrader.addMid(grade);
	    	grade *= 5.75;
	    }
	    //add final exam grade
	    myGrader.addFinal(85.4);//Found value by guess and check
	    //calculate numerical grade for course
	    myGrader.calculateFinalGrade();
	    //print numberical grade
	    System.out.println("Numerical final grade: " + myGrader.getClassGrade());
	    //print final letter grade
	    myGrader.printFinalGrade();
	}

}
