package com.anisha.functionalI.predicate;

import java.util.ArrayList;
import java.util.function.Function;

public class StudentInfo {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Shreya", new int[] { 89, 45, 32, 56 }));

//		req : get sum of marks of given student obj

		Function<Student, Integer> sum = s -> {
			int totMarks = 0;
			for (int mark : s.getMarks()) {

				totMarks += mark;
			}

			return totMarks;

		};

		System.out.println("Total Marks " + sum.apply(students.get(0)));

	}
}
