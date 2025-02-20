package com.anisha.collectionfw.sorting.comparator;

import java.util.Comparator;

public class EmpIdComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if (e2.id == e1.id) {

			return 0;
		} else if (e2.id > e1.id) {
			return 1;
		} else {
			return -1;
		}

	}

}
