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
public class e
{
	int id;
	String name;
	
	public e(int i, String n)
	{
		id = i;
		name = n;
	}
	void show()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
         e e1=new e(1,"jo");
         e e2=new e(2,"seb");
         e1.show();
         e2.show();
         
        }
}
