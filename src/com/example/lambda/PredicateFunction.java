package com.example.lambda;

import java.util.function.Predicate;
class Employee{
    private String employeeName;
    private int rating;
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
public class PredicateFunction {
    Predicate<Employee> bonusLambda = (employee)->employee.getRating()>7?true:false;
    Predicate<Employee> isEmployee = (employee)->employee.getEmployeeName().equals("Sam");
    Predicate<String> emptyString = s->s.isEmpty();
    //composing
    Predicate<Employee> isEmployeeAndBonus = bonusLambda.and(isEmployee);
    public static void main(String[] args){

    }
}
