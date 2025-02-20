package com.anisha.collectionfw.sorting.userdefinedClass;

// Sorting with Normal and generic version of NVEmployee class
public class NVEmployee implements Comparable {

	String ename;
	int eId;

	public NVEmployee(String ename, int eId) {
		super();
		this.ename = ename;
		this.eId = eId;
	}

	@Override
	public int compareTo(Object o) {

		NVEmployee e = (NVEmployee) o;

		if (eId == e.eId) {
			return 0;
		} else if (eId > e.eId) {
			return 1;
		} else {
			return -1;
		}

	}

}
