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
public class employee {
int id,salary;
String name;
employee(int a,String b,int c)
{
    id=a;
    name=b;
    salary=c;
}
public void tsal(){
    int t=salary+(salary*20/100);
    System.out.println("total salary" +t);
}
    public static void main(String[] args) {
        employee e1=new employee(1,"jo",1500);
        employee e2=new employee(2,"ji",2000);
        System.out.println("1st employee");
        e1.tsal();
        System.out.println("2nd employee");
        e2.tsal();
        
    }
}
