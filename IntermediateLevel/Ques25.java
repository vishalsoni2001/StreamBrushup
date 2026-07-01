package IntermediateLevel;

import Model.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//25. Group Employees by Department
public class Ques25 {
    public static void main(String[] args)
    {
        List<Employee> empList = Arrays.asList(
                new Employee(1, "Vishal", 50000,"cse"),
                new Employee(2, "Aryan", 30000,"it"),
                new Employee(3, "Rohan", 70000,"cse")
        );

        Map<String,List<Employee>> groupedEmployee= empList
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedEmployee.forEach((dept, employees) -> {
            System.out.println(dept + " -> " + employees);
        });

        //OUTPUT:
        //cse -> [Employee{id=1, name='Vishal', salary=50000.0, department='cse'}, Employee{id=3, name='Rohan', salary=70000.0, department='cse'}]
        //it -> [Employee{id=2, name='Aryan', salary=30000.0, department='it'}]

    }
}
