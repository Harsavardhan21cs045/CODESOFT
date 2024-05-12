import java.util.*;

import java.util.Scanner;

public class Task2 {
    public static void main (String args[])
    {
        System.out.println("enter the marks:");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        int average=sum/5;
        System.out.println("total marks:"+sum);
        System.out.println("total Average:"+average);
        if(average>=90)
            System.out.println("GRADE A");
        else if(average>=80)
             System.out.println("GRADE B");
        else if(average>=70)
             System.out.println("GRADE C");
        else if(average>=60)
             System.out.println("GRADE D");
        else if(average>=50)
             System.out.println("GRADE E");
        else
            System.out.println("GRADE F");
            
               
    }
}
    

