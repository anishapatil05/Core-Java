package com.anisha.enumeration;

public class WeekDaysDemo {

	public static void main(String[] args) {

//		calling weekdays
		WeekDays w = WeekDays.FRIDAY;
		WeekDays ww = WeekDays.MONDAY;
		WeekDays u = WeekDays.SATURDAY;
		System.out.println(w + " " + ww + " " + u); // FRIDAY,MONDAY,SATURDAY
		System.out.println();

//		 calling all values and index also : ordinal()
		WeekDays[] days = WeekDays.values();

		for (WeekDays pp : days) {
			System.out.println(pp.ordinal() + " " + pp);
		}
		System.out.println();

//		 calling all values only using values();
		WeekDays[] values = WeekDays.values();

		for (WeekDays j : values) {
			System.out.println(j);
		}
		System.out.println();

//		calling weeks for semicolon is not mandotory
		Weeks[] ws = Weeks.values();
		for (Weeks k : ws) {
			System.out.println(k + " " + k.ordinal());
		}
	}

}
