/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author sjcet
 */
public class Rectangle {
int l,b;
Rectangle(int a,int c){
    l=a;
    b=c;
}
public void per(){
   int p=2*(l+b);
    System.out.println("perimeter is" +p);
}
public void area(){
    int ar=l*b;
    System.out.println("Area is " +ar);
}
    public static void main(String[] args) {
       Rectangle r1=new Rectangle(2,3);
       Rectangle r2=new Rectangle(4,5);
        System.out.println("First Rectangle");
 r1.per();
 r1.area();
        System.out.println("Second rectangle");
 r2.per();
 r2.area();
    }
    
    
}
