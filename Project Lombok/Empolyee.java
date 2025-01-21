package com.anisha.lombok;
import java.time.LocalDate;
import java.util.Objects;


// POJO classes using lombok
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Predefined annotations : Lombok library
@ToString
@EqualsAndHashCode
@Data
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Empolyee {

//	Private variables
	private String name;
	private double salary;
	private String workType;
	private int Id;
	private char gender;
	private int age;
	private LocalDate leaveDate;

}
