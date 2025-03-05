package com.anisha.methodref.userdefined;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StudentDetails {

	public static void main(String[] args) {

		StudentDetails obj = new StudentDetails();

		obj.isEligibalForNext(444);
		System.out.println();

//		Using static reference
		List<String> stu = chekingScore();
		System.out.println(stu);

		System.out.println();

//		Using Instance Arbitary object
		List<String> sorted_names = obj.studentNames();
		System.out.println(sorted_names);

//		 Using Constructor Reference 1 : Parametrized Constructor
		Supplier<Student> supplierStudent = () -> new Student("anu", 888, 90);
		System.out.println(supplierStudent.get());

//		 Using Constructor Reference 2 : non-Parametrized Constructor
		Supplier<Student> supplierStu = Student::new;
		System.out.println(supplierStu.get());
		System.out.println();

//		Using Instance Reference
		Set<Integer> ids = studentIds();
		System.out.println(ids);

	}

	public void isEligibalForNext(int id) {
		ArrayList<Student> allData = studentData();

		Optional<Student> data = allData.stream().filter(s -> s.getId() == id).findFirst();

		if (data.isPresent()) {

			Student s = data.get();

			if (s.getMarks() > 30) {
				System.out.println(s.getName() + " is Eligibal for Next exam");
			} else {
				System.out.println(s.getName() + " not Eligibal ");
			}

		} else {
			System.out.println("Student is not found");
		}

	}

	public static ArrayList<Student> studentData() {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Anisha", 111, 70));
		students.add(new Student("Saniya", 222, 40));
		students.add(new Student("Nagesh", 666, 27));
		students.add(new Student("Abhishek", 333, 80));
		students.add(new Student("Priya", 555, 20));
		students.add(new Student("Neha", 444, 30));

		return students;
	}

//Write a program that filters out students who scored less than 50 marks using a static method

	// Using Static Method Reference
	public static List<String> chekingScore() {

		ArrayList<Student> allData = studentData();

		List<String> lessScoredStudents = allData.stream().filter(StudentDetails::lowScores).map(Student::getName)
				.toList();

		return lessScoredStudents;
	}

	public static boolean lowScores(Student s) {

		return s.getMarks() < 50;
	}

//	Using Instance Method reference using arbitrary object of MyComp
	public List<String> studentNames() {

		ArrayList<Student> allData = studentData();

		List<String> sortedNmaes = allData.stream().sorted(new MyComp()).map(Student::getName).toList();

		return sortedNmaes;

	}

	public static String getNames(Student s) {
		return s.getName();
	}

//	Using Instance Reference  : Calling non-static method to static 

	public static Set<Integer> studentIds() {
		StudentDetails obj = new StudentDetails();
		ArrayList<Student> allData = studentData();

		Set<Integer> allIds = allData.stream().map(obj::getIds).collect(Collectors.toSet());

		return allIds;

	}

	public Integer getIds(Student s) {
		return s.getId();
	}
}

// Customized Comparator
class MyComp implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
