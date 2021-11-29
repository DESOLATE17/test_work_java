package com.company;

public class Employee {
    public String name;
    public long salary;
    public String rang;

    public void setName(String name){
        this.name  = name;
    }

    public void setRang(String rang){
        this.rang  = rang;
    }

    public long setMonthSalary(long fixed, long money_company_got, long money_for_company){
        if (rang == "Manager"){
            this.salary = fixed + (int)(0.05 * money_company_got);
        }
        if (rang == "TopManager"){
            if (money_company_got > 10000000){
                this.salary = fixed + (int)(money_for_company * 1.5);
            }
            else {
                this.salary = fixed;
            }
        }
        if (rang == "Operator"){
            this.salary = fixed;
        }
        return salary;
    }

    public long getMonthSalary() {
        return salary;
    }
    public String getName(String name){
        return name;
    }
}