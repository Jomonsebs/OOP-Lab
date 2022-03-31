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
public class product {
    int pcode,price;
    String pname;
    product(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the product code");
        pcode= s.nextInt();
        System.out.println("enter the product name");
        pname=s.next();
        System.out.println("enter the price");
        price= s.nextInt();
    }
    public void display(){
        System.out.println("product code is" +pcode);
        System.out.println("product name is" +pname);
        System.out.println("product price is" +price);
    }
    
     public static void main(String[] args) {
         product p1=new product();
         product p2=new product();
         product p3=new product();
         if(p1.price<p2.price && p1.price<p3.price)
             p1.display();
         else if(p2.price<p1.price &&p2.price<p3.price )
             p2.display();
         else
             p3.display();
             
     }
        
}
