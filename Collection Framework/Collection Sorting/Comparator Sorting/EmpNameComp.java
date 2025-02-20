package com.anisha.collectionfw.sorting.comparator;

import java.util.Comparator;

public class EmpNameComp implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name);
	}
}
