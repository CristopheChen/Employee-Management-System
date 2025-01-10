/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ems;

/**
 *
 * @author cristophechen
 */

import java.util.*;

public class HashTable {
    
    //hashtable is organized into 10 buckets
    //each bucket only holds employee number that when modulu 10 equates to the bucket numbers
    ArrayList<EmployeeInfo> employees[] = new ArrayList[10];
    
    public HashTable(){
        for(int i = 0; i < 10; ++i)employees[i] = new ArrayList<EmployeeInfo>();
    }
    
    //finding the bucket index based on an employee number
    public int findIndex(int empNum){
        return empNum % 10;
    }
    
    //adding an employee to the hashtable
    //method finds the right bucket and also checks if the employee number already exists
    public int addEmployee(EmployeeInfo employee){
        int index = findIndex(employee.empNum);
        
        for(int i = 0; i < employees[index].size(); ++i){
            if(employees[index].get(i).empNum == employee.empNum){
                System.out.println("Employee number already exists.");
                return 0;
            }
        }
        
        employees[index].add(employee);
        
        return 1;
    }
    
    //removes an employee from the hashtable using only an employee number
    public int removeEmployee(int empNum){
        int index = findIndex(empNum);
        
        for(int i = 0; i < employees[index].size(); ++i){
            if(employees[index].get(i).empNum == empNum){
                employees[index].remove(employees[index].get(i));
                return 1;
            }
        }
        
        return 0;
    }
    
    //finds the arraylist index of an employee using only employee number
    public int findEmployee(int empNum){
        int index = findIndex(empNum);
        
        for(int i = 0; i < employees[index].size(); ++i){
            if(employees[index].get(i).empNum == empNum)return i;
        }
        
        return -1;
    }
}
