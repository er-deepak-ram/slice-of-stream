package com.google;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestDrive {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "Johny", 30));
		empList.add(new Employee(2, "Rocky", 35));
		empList.add(new Employee(3, "Tim", 32));
		empList.add(new Employee(4, "Alex", 28));
		empList.add(new Employee(5, "Eric", 25));
		
//		Use case: Find 2nd and 3rd youngest
		List<Employee> slicedList = empList.stream()
										.sorted(Comparator.comparingInt(Employee::getAge))
										.skip(1)
										.limit(2)
										.collect(Collectors.toList());
		System.out.println(slicedList);
	}

}
