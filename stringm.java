/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


import java.util.Scanner;
public class stringm{
String s1,s2;
    stringm(String a ,String b){
    s1=a;
    s2=b;
         
    }
    public void length()
    {
        System.out.println("length of the 1st strings is:" + s1.length());
        System.out.println("lenth of the 2d string is:" +s2.length());
    }
    public  void concat()
    {
        System.out.println("concatination of two strings:" +s1.concat(s2));
    }
    public void loweupper()
    {
        System.out.println("lowercase of the 1st string is:"+s1.toLowerCase());
        System.out.println("lowercase of the 2nd string is:" +s2.toLowerCase());
        System.out.println("upper case of the 1st string is:" +s1.toUpperCase());
        System.out.println("upper case of the 2nd string is:"+s2.toUpperCase());
    }
    public void compare()
    {
        System.out.println("compare two strings:" +s1.equals(s2));
    }
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("enter string 1:");
        
        String s1=ss.nextLine();
        System.out.println("enter string 2  :");
        String s2=ss.nextLine();
        stringm b=new stringm(s1,s2);
        b.length();
        b.concat();
        b.loweupper();
        b.compare();
     
    }
}
