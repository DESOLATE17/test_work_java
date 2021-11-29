package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Company company_temp = new Company();
        String [] names = {"Nick", "Tom", "Kate", "Dylan", "Mike", "lily", "Thomas", "Rita"};
        String [] rang = {};
        int min = 115000;
        int max = 140000;
        long fixed_for_operators = 80000;
        long fixed_for_managers = 120000;
        long fixed_for_TopManagers = 200000;
        long profit = 11000000;

        for (int i = 0; i < 180; ++i){
            Employee employee_temp = new Employee();
            employee_temp.setName(names[i % 8]);
            employee_temp.setRang("Operator");
            employee_temp.setMonthSalary(fixed_for_operators, profit, ((int) (Math.random() * ++max)) + min);
            company_temp.hire(employee_temp);
        }

        for (int i = 0; i < 80; ++i){
            Employee employee_temp = new Employee();
            employee_temp.setName(names[i % 8]);
            employee_temp.setRang("Manager");
            employee_temp.setMonthSalary(fixed_for_managers, profit, ((int) (Math.random() * ++max)) + min);
            company_temp.hire(employee_temp);
        }

        for (int i = 0; i < 10; ++i){
            Employee employee_temp = new Employee();
            employee_temp.setName(names[i % 8]);
            employee_temp.setRang("TopManager");
            employee_temp.setMonthSalary(fixed_for_TopManagers, profit, ((int) (Math.random() * ++max)) + min);
            company_temp.hire(employee_temp);
        }
        System.out.println("Топ самых больших зарплат:");
        //company_temp.info();
        for (Employee employee : company_temp.getTopSalaryStaff(15)){
            System.out.println(employee.name+" "+employee.rang+" "+employee.salary);
        }
        System.out.println("Топ самых маленьких зарплат:");
        for (Employee employee : company_temp.getLowestSalaryStaff(30)){
            System.out.println(employee.name+" "+employee.rang+" "+employee.salary);
        }
        max = 270;
        min = 0;
        for (int i = 0; i < 135; i++) {
            company_temp.fire((int) (Math.random() * ++max) + min);
            max = 270 - i;
        }
        System.out.println("Топ самых больших зарплат после увольнения:");
        for (Employee employee : company_temp.getTopSalaryStaff(15)){
            System.out.println(employee.name+" "+employee.rang+" "+employee.salary);
        }
        System.out.println("Топ самых маленьких зарплат после увольнения:");
        for (Employee employee : company_temp.getLowestSalaryStaff(30)){
            System.out.println(employee.name+" "+employee.rang+" "+employee.salary);
        }

    }



}
