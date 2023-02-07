import java.util.*;
public class Binary_Search
{
    public static void main(String args[])
    {
        int arr[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers in the Array");
        for(int k=0; k<arr.length; k++)
        arr[k]=sc.nextInt();
        int l=0, u=arr.length-1, val, pos=-1, mid=0;
        System.out.println("Enter a Value");
        
        val=sc.nextInt();
        while(l<=u)
        {
            mid=(l+u)/2;
            if(arr[mid]==val)
            {
                pos=mid;
                break;
            }
            else if(arr[mid]<val)
            {
                l=mid+1;
            }
            else
            {
                u=mid-1;
            }
        }
        if(pos>-1)
        System.out.println("Number found in the position of: " +(pos+1));
        else
        System.out.println("Number not found");
        sc.close();
    }
}