package com.gsuretech.streamapitutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class StreamApiTutorialApplication {

    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(
                new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1", "Project 2"))
        );


        employees.add(
                new Employee("Nilhil", "Gupta", 6000.0, List.of("Project 1", "Project 3"))
        );

        employees.add(
                new Employee("Shivam", "Kumar", 5500.0, List.of("Project 3", "Project 4"))
        );
        employees.add(
                new Employee("Angneepath", "Shahad", 2000.0, List.of("Project 3", "Project 4"))
        );


    }

    public static void main(String[] args) throws NoSuchFieldException {
        //SpringApplication.run(StreamApiTutorialApplication.class, args);

        //foreach
        employees.stream()
                .forEach(employee -> System.out.println(employee));


        //Map
        //Collect
        List<Employee> increasedSal =
                employees.stream()
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .collect(Collectors.toList());
        System.out.println(increasedSal);

        //filter

        List<Employee> filteredEmployee =
                employees.stream()
                        .filter(employee -> employee.getSalary() > 5000.0)
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .collect(Collectors.toList());

        System.out.println(filteredEmployee);

        //findFirst
        Employee firstEmployee =
                employees.stream()
                        .filter(employee -> employee.getSalary() > 7000.0)
                        .map(employee -> new Employee(
                                employee.getFirstName(),
                                employee.getLastName(),
                                employee.getSalary() * 1.10,
                                employee.getProjects()
                        ))
                        .findFirst()
                        .orElse(null);

        System.out.println(firstEmployee);

        //flatMap

        String projects =
                employees
                        .stream()
                        .map(employee -> employee.getProjects())
                        .flatMap(strings -> strings.stream())
                        .collect(Collectors.joining(","));

        System.out.println(projects);

        //short Circuit operations
        List<Employee> shortCircuit =
                employees
                        .stream()
                        .skip(1)
                        .limit(2)
                        .collect(Collectors.toList());
        System.out.println(shortCircuit);

        //finite

        Stream.generate(Math::random)
                .limit(5)
                .forEach(value -> System.out.println(value));

        //sort
        List<Employee> sortedEmployee
           = employees
                    .stream()
                    .sorted((a,b)-> a.getFirstName()
                            .compareToIgnoreCase(b.getFirstName()))
                    .collect(Collectors.toList());
        System.out.println(sortedEmployee);

        //min or max
        System.out.println( "Minimum" +
        employees.stream()
                .min(Comparator.comparing(employees -> employees.getSalary()))
                .orElseThrow(NoSuchFieldException::new));

    }


}
