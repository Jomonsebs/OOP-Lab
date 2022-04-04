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
public class Student {
int m1,m2,m3;
Student(int a,int b,int c)
{
    m1=a;
    m2=b;
    m3=c;
}
public void sum(){
   int s=m1+m2+m3;
            System.out.println("sum is" +s);
}
public void per(){
 
    float pe=((m1+m2+m3)*100)/100; 
            System.out.println("percentage is" +pe);
}
    public static void main(String[] args) {
        Student s1=new Student(10,20,30);
        Student s2=new Student(40,30,10);
        System.out.println("Student 1");
        s1.sum();
        s1.per();
        System.out.println("Student 2");
        s2.sum();
        s2.per();
    }
}
   

