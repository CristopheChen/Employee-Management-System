/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ems;

/**
 *
 * @author cristophechen
 */
public class PTE extends EmployeeInfo {
    double hourlyWage, weeklyHours, yearlyWeeks;
    
    public PTE(int empNum, String firstName, String lastName, String gender, String workLoc, double deductRate, double hourlyWage, double weeklyHours, double yearlyWeeks){
        this.empNum = empNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.workLoc = workLoc;
        
        if(deductRate > 100)this.deductRate = 100;
        else this.deductRate = deductRate;
        
        if(hourlyWage < 0.0)this.hourlyWage = 0.0;
        else this.hourlyWage = hourlyWage;
        
        if(weeklyHours < 0.0)this.weeklyHours = 0.0;
        else this.weeklyHours = weeklyHours;
        
        if(yearlyWeeks < 0.0)this.yearlyWeeks = 0.0;
        else this.yearlyWeeks = yearlyWeeks;
    }
    
    public double getIncome(){
        double income = hourlyWage * weeklyHours * yearlyWeeks;
        return income - deductRate * 0.01 * income;
    }
}
