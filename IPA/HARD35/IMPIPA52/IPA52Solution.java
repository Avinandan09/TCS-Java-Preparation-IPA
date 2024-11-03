

import java.util.*;;
public class IPA52Solution {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Employee[] emp = new Employee[5];
        for (int i=0;i<emp.length;i++){
            int id = sc.nextInt();sc.nextLine();
            String name = sc.nextLine();
            String dept = sc.nextLine();
            int rate = sc.nextInt();sc.nextLine();
            int salary = sc.nextInt();sc.nextLine();
            emp[i] = new Employee(id,name,dept,rate,salary);
        }
        // findDept Method
        int sal = sc.nextInt();sc.nextLine();
        String dept = sc.nextLine();
        String[] ans1 = findDept(emp,sal);
        int ans2 = findSecondHighestSalary(emp,dept); 
    }
    public static String[] findDept(Employee[] emp, int sal){
        
    }
}

class Employee{
    private int EmpId;
    private String EmpName;
    private String Dept;
    private int Rating;
    private int Salary;
    public Employee(int EmpId, String EmpName, String Dept, int Rating, int Salary){
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.Dept = Dept;
        this.Rating = Rating;
        this.Salary = Salary;
    }
    public int getEmpId(){
        return EmpId;
    }
    public String getEmpName(){
        return EmpName;
    }
    public String getDept(){
        return Dept;
    }
    public int getRating(){
        return Rating;
    }
    public int getSalary(){
        return Salary;
    }
    public void setEmpId(int EmpId){
        this.EmpId = EmpId;
    }
    public void setEmpName(String EmpName){
        this.EmpName = EmpName;
    }
    public void setDept(String Dept){
        this.Dept = Dept;
    }
    public void setRating(int Rating){
        this.Rating = Rating;
    }
    public void setSalary(int Salary){
        this.Salary = Salary;
    }
}