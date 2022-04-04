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
public class matrix {
    
    public static void main(String[] args) {
        int m,n;
        Scanner ma=new Scanner(System.in);
        System.out.println("enter the rows and columns of the matrix");
        m=ma.nextInt();
        n=ma.nextInt();
        int m1[][]=new int[m][n];
        int m2[][]=new int[m][n];
        int m3[][]=new int[m][n];
        System.out.println("enter the elements of 1st matrix");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++){
                m1[i][j]=ma.nextInt();
            }}
        System.out.println("enter the elements of 2nd matrix");
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                
                m2[i][j]=ma.nextInt();
            }}
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                m3[i][j]=m2[i][j]+m1[i][j];
            }}
        System.out.println("sum of the matrix is");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("\t");
                System.out.print(m3[i][j]);
                
            }
            System.out.println();
            
        }
}
    
    
}
