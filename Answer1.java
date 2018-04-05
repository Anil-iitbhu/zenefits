/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answer1;
import java.util.*;
import java.lang.*;
import java.io.*;
/**
 *
 * @author Dell
 */
public class Answer1 {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) 
    {
     int i,j,k=0,temp,sum=0,l;
     
     InputStreamReader ir =new InputStreamReader(System.in);
    BufferedReader br =new BufferedReader(ir);
     
    
     
     int n=Integer.parseInt(br.readLine());
     char c[]=new char[n];
     
     for (i=0;i<n;i++)
     {
       c=(br.readChar());
        
     }
     
     int a[]=new int [n];
     
     
     for (i=0;i<n;i++)
     {
        
         a[i]=(int)(c[i]);
     }
        for (i=0;i<n;i++)
        {
            for (j=i+1;j<n;j++)
            {
                if (a[i]>a[j])
                {
                    temp =a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        String s =sc.nextLine();
       int b[]=new int[n];
        for (i=0;i<3;i++)
        {
            b[i]=(int)s.charAt(i);
        }
        for (i=0;i<n;i++)
        {
            k=0;
            for (j=0;j<n;j++)
            {
                if(b[i]==a[j])
                    break;
                else k++;
            }
            int fac=1; 
            for(l=1;l<=n-1-i;l++)
            {
                fac=fac*l;
            }
            sum=sum+k*fac;
        }
    {
        
    }
     
    }
    
}
