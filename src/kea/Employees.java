package kea;

import java.util.HashMap;

public class Employees {

    private String employeeName;
    private String employeeCPR;
    private String employeeType;
    private String employeeHours;
    private String employeeSalary;
    private String employeeVacation;

    public String getEmployeeName(){
        return this.employeeName;
    }
    public void setEmployeeName(String value){
        this.employeeName = value;
    }

    public String getEmployeeCPR(){
        return this.employeeCPR;
    }
    public void setEmployeeCPR(String value){
        this.employeeCPR = value;
    }

    public String getEmployeeType(){
        return this.employeeType;
    }
    public void setEmployeeType(String value){
        this.employeeType = value;
    }

    public String getEmployeeHours(){
        return this.employeeHours;
    }
    public void setEmployeeHours(String value){
        this.employeeHours = value;
    }

    public String getEmployeeSalary(){
        return this.employeeSalary;
    }
    public void setEmployeeSalary(String value){
        this.employeeSalary = value;
    }

    public String getEmployeeVacation(){
        return this.employeeVacation;
    }
    public void setEmployeeVacation(String value){
        this.employeeVacation = value;
    }

    public Employees(String employeeName, String employeeCPR, String employeeType, String employeeHours, String employeeSalary, String employeeVacation){
        this.employeeName = employeeName;
        this.employeeCPR = employeeCPR;
        this.employeeType = employeeType;
        this.employeeHours = employeeHours;
        this.employeeSalary = employeeSalary;
        this.employeeVacation = employeeVacation;
    }

    @Override
    public String toString(){
        return "Name: " + employeeName + "CPR: " + employeeCPR + "Type: " + employeeType + "Hours: " + employeeHours + "Salary: " + employeeSalary + "Vacation: " + employeeVacation;
    }
}
