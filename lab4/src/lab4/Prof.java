package lab4;

/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Prof extends Observable{
	private String name;
	private Date midtermDate;
	private ArrayList<Student> students;
	private TeachingAssistant ta;

	public Prof(String aName) {
		this.name = aName;
		this.students = new ArrayList<Student>();
	}

	public Date getMidterm() {
		return this.midtermDate;
	}

	public String getName() {
		return this.name;
	}

	public void setMidterm(Date date) {
		this.midtermDate = date;
		setChanged();
		notifyObservers(date);
	}
	
	public void postponeMidterm(Date date){
		this.midtermDate = date;
		setChanged();
		notifyObservers(date);
	}
	
	//public void setTA(TeachingAssistant theTA){
	//	this.ta = theTA;
	//}
	
	//public void addStudent(Student s){
			//for (Student addStudent: this.students ) {
		//	Student.addObserver(s);
		//}
		//this.students.add(s);
	//}


	public static void main(String[] args) {

		Prof p = new Prof("Babak");
		Student s = new Student("Homer");
		Student s2 = new Student("Bart");
		
		TeachingAssistant ta = new TeachingAssistant("Michael");
	
	
		p.addObserver(s);
		p.addObserver(s2);
		p.addObserver(ta);
	
		Date midterm = new Date();
		p.setMidterm(midterm);
	
		p.postponeMidterm(new Date(midterm.getTime() + 1000000000));
	}

	

}


