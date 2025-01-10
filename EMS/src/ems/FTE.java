/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ems;

/**
 *
 * @author cristophechen
 */

public class FTE extends EmployeeInfo {
    double yearlySalary;
    
    public FTE(int empNum, String firstName, String lastName, String gender, String workLoc, double deductRate, double yearlySalary){
        this.empNum = empNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.workLoc = workLoc;
        
        if(deductRate > 100)this.deductRate = 100;
        else this.deductRate = deductRate;
        
        if(yearlySalary < 0.0)this.yearlySalary = 0.0;
        else this.yearlySalary = yearlySalary;
    }
    
    public double getIncome(){
        return yearlySalary - deductRate * 0.01 * yearlySalary;
    }
}
