package com.java.arrays;

// Assignment No.9 : Areays as return type in non-primitive datatype

// Create an array with Student 
//           variables: id, name,marks,gender for a 10 student information and put this 
//       information in a array & print all student information

public class Empolyee {

	public String name;
	public int id;
	public double marks;
	public char gender;

	public Empolyee(String sname, int sid, double smarks, char sgender) {
		name = sname;
		id = sid;
		marks = smarks;
		gender = sgender;
	}

	public Empolyee() {

	}

	public Empolyee[] getEmpolyees() {
		Empolyee[] employee = new Empolyee[10];
		employee[0] = new Empolyee("Anisha", 1, 90, 'F');
		employee[1] = new Empolyee("nisha", 8, 60, 'F');
		employee[2] = new Empolyee("Ani", 2, 40, 'M');
		employee[3] = new Empolyee("Anu", 6, 90, '3');
		employee[4] = new Empolyee("Anisha", 1, 90, 'F');
		employee[5] = new Empolyee("Anisha", 1, 90, 'F');
		employee[6] = new Empolyee("Anisha", 1, 90, 'F');
		employee[7] = new Empolyee("Anisha", 1, 90, 'F');
		employee[8] = new Empolyee("Anisha", 1, 90, 'F');
		employee[9] = new Empolyee("Anisha", 1, 90, 'F');

		return employee;
	}

	public static void main(String[] args) {
		Empolyee obj = new Empolyee();
		Empolyee[] allinfo = obj.getEmpolyees();

		for (Empolyee e : allinfo) {
			System.out.println(e.name);
			System.out.println(e.id);
			System.out.println(e.marks);
			System.out.println(e.gender);
		}
		
		obj.printAllInformation(allinfo);
	}
		
		public void printAllInformation(Empolyee[] employe)
		{
			for (Empolyee e : employe) {
				System.out.println("hii");
				System.out.println(e.name);
				System.out.println(e.id);
				System.out.println(e.marks);
				System.out.println(e.gender);
			}
			
		}

	

}
