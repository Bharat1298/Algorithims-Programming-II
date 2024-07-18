
public class TestGrader {

	public static void main(String[] args) {
		//Grader instance
		Grader myGrader = new Grader();
		
		//add homework grades
		myGrader.addHW(94.5);
		myGrader.addHW(90.9);
		myGrader.addHW(94.0);
		
		//add lab grades
		myGrader.addLab(70.0);
		myGrader.addLab(95.0);
		
		//add midterm grades
		myGrader.addMid(84.0);
		myGrader.addMid(95.0);
		
		//add Final Exam grade
		myGrader.addFinal(90.5);
		
		//calculate and print final grade
		myGrader.calculateFinalGrade();
		myGrader.printFinalGrade();
	}

}