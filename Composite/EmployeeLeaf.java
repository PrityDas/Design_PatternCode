/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design_Pattern.Composite;

/**
 *
 * @author TANIM
 */
public class EmployeeLeaf implements Depatment{
    public String name;
    public String deptName;
    public EmployeeLeaf(String name,String deptName){
        this.name=name;
        this.deptName=deptName;
    }

    @Override
    public void printDepartmentName() {
        System.out.println("Emplyee Name: "+name +"   "+"Department Name : "+deptName);
    }
    
    
}
