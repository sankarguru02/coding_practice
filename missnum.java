import java.util.*;

class missnum{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the numbers ");
        int arr[]={1,2,3,5};
        int res=0;
        int n=arr.length;
        for(int i = 1;i<=n;i++)
        {
            res^=i;
        }
        for(int i=0;i<n-1;i++)
        {
            res^=arr[i];
        }
        System.out.println(res);
          
}}
