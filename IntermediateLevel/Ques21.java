package IntermediateLevel;

import Model.Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//21:Sort Employees by Salary
public class Ques21 {

    public static void main(String[] args)
    {
        List<Employee> empList = Arrays.asList(
                new Employee(1, "Vishal", 50000),
                new Employee(2, "Aryan", 30000),
                new Employee(3, "Rohan", 70000)
        );

        List<Employee> sortedEmpList=empList
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .toList();

        System.out.println("After Sorting Employees by Salary");
        sortedEmpList.forEach(System.out::println);

//        OUTPUT:
//        After Sorting Employees by Salary
//        2 Aryan 30000.0
//        1 Vishal 50000.0
//        3 Rohan 70000.0

    }
}
