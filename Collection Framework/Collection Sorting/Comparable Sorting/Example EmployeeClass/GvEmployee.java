package com.anisha.collectionfw.sorting.userdefinedClass;

public class GvEmployee implements Comparable<GvEmployee> {
	String ename;
	int eId;

	public GvEmployee(String ename, int eId) {
		super();
		this.ename = ename;
		this.eId = eId;
	}

	@Override
	public int compareTo(GvEmployee emp) {

		return ename.compareTo(emp.ename);
	}

}
