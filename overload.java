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
public class overload {
    void area(double a){
        System.out.println("area of square is "+ Math.pow(a,a));}
    void area(double a,double b){
        System.out.println("area of rectangle is" +a*b);
    }
    void area(float a){
        System.out.println("area of circle is" +(3.14*(a*a)));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of a");
       double a=s.nextDouble();
        System.out.println("enter the value of b");
       double b=s.nextDouble();
        overload k=new overload();
        k.area(a);
        k.area(a,b);
        k.area(a);
    }
}
