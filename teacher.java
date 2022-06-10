/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class person {
    String name,gender,address;
    int  age;
    public person(){
        Scanner p1=new Scanner(System.in);
        System.out.println("enter the name");
        name=p1.next();
        System.out.println("enter the gender");
        gender=p1.next();
        System.out.println("enter the address");
        address=p1.next();
        System.out.println("enter the age");
        age=p1.nextInt();
    }
    void disp()
    {
        System.out.println("the details are");
        System.out.println(name);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(age);
    }
}
    class employee extends person
    {
        String company_name,qualification;
        int empid,salary;
        employee(){
            Scanner e1=new Scanner(System.in);
            System.out.println("enter the employee id");
            empid=e1.nextInt();
            System.out.println("enter the company name");
            company_name=e1.next();
            System.out.println("enter the qualification");
            qualification=e1.next();
            System.out.println("enter the salary");
            salary=e1.nextInt();
        }
        void disp1()
        {
            System.out.println("the details are");
            System.out.println(empid);
            System.out.println(company_name);
            System.out.println(qualification);
            System.out.println(salary);
        }
    }
class teacher extends employee
{
    int teacher_id;
    String subject,department;
    teacher(){
        Scanner 
    }
            
        }
           
        
        
                
    

