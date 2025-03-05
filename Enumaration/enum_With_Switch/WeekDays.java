package com.anisha.enumeration.enumswitch;

public class WeekDays {

	public static void main(String[] args) {
		
		WeekDaysNames day = WeekDaysNames.MONDAY;
		
		switch (day) {
		case MONDAY: {
			
			System.out.println("Sunday is funday");
		}
		break;
		case TUESDAY: {
			System.out.println("Tuesday is lazy day");
		}
		break;
		case WEDENSDAY : {
			System.out.println("Wedensday is colorful day");
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + day);
		}

	}

}
