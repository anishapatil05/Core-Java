package com.anisha.collectionfw.sorting.userdefinedClass;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDataSorting {

	public static void main(String[] args) {

		NVEmployee e1 = new NVEmployee("Anisha", 333);
		NVEmployee e2 = new NVEmployee("Saniya", 444);
		NVEmployee e3 = new NVEmployee("Neha", 222);
		NVEmployee e4 = new NVEmployee("Shraddha", 111);

		GvEmployee emp1 = new GvEmployee("Anuu", 666);
		GvEmployee emp2 = new GvEmployee("Sanuu", 555);
		GvEmployee emp3 = new GvEmployee("Nehuu", 888);
		GvEmployee emp4 = new GvEmployee("Shraddhuu", 777);

//		Normal version
		ArrayList<NVEmployee> nVEmployees = new ArrayList<>();
		nVEmployees.add(e1);
		nVEmployees.add(e2);
		nVEmployees.add(e3);
		nVEmployees.add(e4);

		Collections.sort(nVEmployees);

//		Generic Version
		ArrayList<GvEmployee> gVEmployees = new ArrayList<>();
		gVEmployees.add(emp1);
		gVEmployees.add(emp2);
		gVEmployees.add(emp3);
		gVEmployees.add(emp4);

		Collections.sort(gVEmployees);

		System.out.println("Generic Version according to name");
		for (GvEmployee empp : gVEmployees) {
			System.out.println(empp.eId + " " + empp.ename);
		}

		System.out.println("Normal Version according to Id ");
		for (NVEmployee emp : nVEmployees) {

			System.out.println(emp.eId + " " + emp.ename);
		}

	}

}
