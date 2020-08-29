package com.test.lambda.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapInJava8 {
	public static void main(String[] args) {
		 List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                 new Employee(1, "A", 100),
                 new Employee(2, "A", 200),
                 new Employee(3, "B", 300),
                 new Employee(4, "B", 400),
                 new Employee(5, "C", 500),
                 new Employee(6, "C", 600)));

		Map<Integer, String> employeesMap = employeeList.stream()
				.collect(Collectors.toMap(Employee::getNumber,Employee::getName));
//System.out.println(employeesMap);
		employeesMap.forEach((k, v) -> System.out.println("item " + k + "value" + v));
		System.out.println("map ends");
		Employee[] emp = employeeList.stream().filter(e -> e.getNumber() > 400).toArray(Employee[]::new);
		for (Employee i : emp)
			System.out.println(i);
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate.getMonthValue());

	}

}
