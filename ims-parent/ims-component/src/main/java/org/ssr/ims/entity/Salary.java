package org.ssr.ims.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Salary {
	private Integer id;
	private Integer salaryYear;
	private Integer salaryMonth;
	private Double baseSalary;
	private Double insurance;
	private Double accumnlationFund;
	private Double tax;
	private Double achievements;
	private Double reallySalary;
	private Double empId;
	
	
	

}
