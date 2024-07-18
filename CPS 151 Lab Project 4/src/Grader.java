import java.util.ArrayList;

public class Grader {
	//class variables
	private ArrayList<Double> homework;
	private ArrayList<Double> labs;
	private ArrayList<Double> midterms;
	private ArrayList<Double> finalExam;
	private double classGrade;
	
	public Grader() {
		homework = new ArrayList<Double>();
		labs = new ArrayList<Double>();
		midterms = new ArrayList<Double>();
		finalExam = new ArrayList<Double>();
		classGrade = 0.0;
	}
	
	public void addHW(double grade) {
		homework.add(grade);
	}
	public void addLab(double grade) {
		labs.add(grade);
	}
	public void addMid(double grade) {
		midterms.add(grade);
	}
	public void addFinal(double grade) {
		finalExam.add(grade);
	}
	public double getClassGrade() {
		return classGrade;
	}
	private double average(ArrayList<Double> assignments) {
		double avg = 0.0;
		for(double grade : assignments) {
			avg += grade;
		}
		return avg/assignments.size();
	}
	public void calculateFinalGrade() {
		double hwTotal = average(homework);
		double labTotal = average(labs);
		double midTotal = average(midterms);
		double finalTotal = average(finalExam);
		classGrade = (hwTotal*0.1)+(labTotal*0.4)+(midTotal*0.25)+(finalTotal*0.25);
	}
	
	public void printFinalGrade() {
		if(classGrade >= 93.0)
			System.out.println("The final grade for the course is A");
		else if(classGrade >= 90.0)
			System.out.println("The final grade for the course is A-");
		else if(classGrade >= 87.0)
			System.out.println("The final grade for the course is B+");
		else if(classGrade >= 83.0)
			System.out.println("The final grade for the course is B");
		else if(classGrade >= 80.0)
			System.out.println("The final grade for the course is B-");
		else if(classGrade >= 77.0)
			System.out.println("The final grade for the course is C+");
		else if(classGrade >= 73.0)
			System.out.println("The final grade for the course is C");
		else if(classGrade >= 70.0)
			System.out.println("The final grade for the course is C-");
		else if(classGrade >= 60.0)
			System.out.println("The final grade for the course is D");
		else
			System.out.println("The final grade for the course is F");
	}
}
