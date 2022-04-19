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
public class studentmark {
    int mark1,mark2,mark3,rollno,total;
    String name;
    studentmark()
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the roll.no ");
       rollno=s.nextInt();
       System.out.println("Enter the name ");
       name=s.next();
       System.out.println("Enter the mark-1");
       mark1=s.nextInt();
       System.out.println("Enter the mark-2");
       mark2=s.nextInt();
       System.out.println("Enter the mark-3");
       mark3=s.nextInt();
    }
    public void Scorecard()
    {
        System.out.println("Roll.No : "+rollno);
        System.out.println("Name    : "+name);
        System.out.println("Mark-1  : "+mark1);
        System.out.println("Mark-2  : "+mark2);
        System.out.println("Mark-3  : "+mark3);
        total=mark1+mark2+mark3;
        System.out.println("Total   : "+total+"\n");
        if(total>125)
            System.out.println("Grade : A");
        else if(total>100)
            System.out.println("Grade : B");
        else if(total>75)
            System.out.println("Grade : C");
        else if(total>50)
            System.out.println("Grade : D");
        else
            System.out.println("Fail");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the no.of students ");
        n=s.nextInt();
        studentmark st[]=new studentmark[n];
        for(int i=0;i<n;i++)
        {
            int t=i+1;
            System.out.println("Enter the details of student - "+t+"\n");
            st[i]=new studentmark();
        }
        System.out.println("Student Details\n");
        for(int i=0;i<n;i++)
        {
            int t=i+1;
            System.out.println("Student - "+t+"\n");
            st[i].Scorecard();
        }
        studentmark temp=new studentmark();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;i<n;i++)
            {
                if(st[i].total>st[j].total)
                {
                    temp=st[i];
                    st[i]=st[j];
                    st[j]=temp;
                }
            }

        }
        System.out.println("Topper : "+st[n-1].name);
    
    }
        // TODO code application logic here
   
    
} 

