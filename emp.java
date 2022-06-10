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
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage_1_2;
import java.util.Scanner;
public class emp {
    int eNo;
    String eNmae;
    double eSalary;
    public void details(){
    Scanner s1=new Scanner(System.in);
    System.out.println("enter the employee number");
    eNo=s1.nextInt();
        System.out.println("enter the employee name");
        eNmae=s1.nextLine();
        System.out.println("ente employee salary");
        eSalary=s1.nextDouble();
    }
    public void display(){
        System.out.println("employee number:"+eNo);
        System.out.println("employee name:"+eNmae);
        System.out.println("employee salary:"+eSalary);
    }
    public static void main(String[] args) {
        
    }
}
