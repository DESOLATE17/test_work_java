package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Company {

    public String name;
    public List <Employee> employees = new ArrayList<Employee>();
    public long money = 10000000;

    public void hire(Employee person){
        employees.add(person);
    }

    public void hireAll(Employee[] person, int n){
        for (int i = 0; i < n; ++i) {
            employees.add(person[i]);
        }
    }

    public long getIncome() {
        return money;
    }

    public void fire(int index) {
        employees.remove(employees.get(index));
    }

    public void info() {
        System.out.println("Список сотрудников:");
        for(int i = 0; i < employees.size(); ++i){
            System.out.println(employees.get(i).name+" "+employees.get(i).salary);
        }
    }


    List<Employee> getLowestSalaryStaff(int count){
        Collections.sort(employees, new SortUp());
        List <Employee> salaries_up = new ArrayList<Employee>();
        for (int i = 0; i < count; ++i){
            salaries_up.add(employees.get(i));
        }
        return salaries_up;
    }

    List<Employee> getTopSalaryStaff(int count){
        Collections.sort(employees, new SortUp());
        List <Employee> salaries_down = new ArrayList<Employee>();
        for (int i = employees.size()- 1; i >= employees.size() - count; --i){
            salaries_down.add(employees.get(i));
        }
        return salaries_down;
    }

}
