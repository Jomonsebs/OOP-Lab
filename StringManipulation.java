/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;


import java.util.Scanner;
public class StringManipulation{
String string1,string2;
    public void mani(String a ,String b){
    string1=a;
    string2=b;
         
    }
    public void length()
    {
        System.out.println("length of the strings is" + string1.length());
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
      String  string1=s.next();
        StringManipulation s1=new StringManipulation(string1,string2);
        s1.length();
    }
    
}
