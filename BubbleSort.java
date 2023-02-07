import java.util.*;
public class BubbleSort
{
    public static void main(String args[])
    {
        int k, no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many numbers do you want to enter");
        no=sc.nextInt();
        int num[]=new int[no];
        System.out.println("Enter the n numbers");
        for(k=0; k<num.length; k++)
        {
            num[k]=sc.nextInt();
        }
        System.out.println("Enter 'A' for Ascending Order and 'D' for Descending Order");
        char ch=sc.next().charAt(0);
        if(ch=='A' || ch=='a')
        {
            int i, j, temp;
            for(i=0; i<num.length; i++)
            {
                for(j=0; j<num.length-1-i; j++)
                {
                    if(num[j]>num[j+1])
                    {
                        temp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=temp;
                    }
                }
            }
            System.out.println("The sorted numbers are");
            for(i=0; i<num.length; i++)
            System.out.println(num[i]);
        }
        else 
        if(ch=='D' || ch=='d')
        {
            int i, j, temp;
            for(i=0; i<num.length; i++)
            {
                for(j=0; j<num.length-1-i; j++)
                {
                    if(num[j]<num[j+1])
                    {
                        temp=num[j];
                        num[j]=num[j+1];
                        num[j+1]=temp;
                    }
                }
            }
            System.out.println("The sorted numbers are");
            for(i=0; i<num.length; i++)
            System.out.println(num[i]);
        }
        else 
        {
            System.out.println("ERROR...");
        }  
        sc.close(); 
    }
}