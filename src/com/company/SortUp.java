package com.company;

import java.util.Comparator;

 public class SortUp implements Comparator<Employee>
{
    public int compare(Employee a, Employee b)
    {
        return (int) (a.salary - b.salary);
    }
}

