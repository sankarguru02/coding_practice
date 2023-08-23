
import java.util.*;

public class listtoarray {
    void circularArrayRotation(int arr[], int k) {
        // Write your code here
            
            int cpy[]=arr;
            int len = cpy.length;
            List<Integer> ls=new ArrayList<Integer>();
           
            while(k>0){
                 int temp=cpy[len-1];
                for(int i=len-1;i>0;i--){
                    cpy[i] = cpy[i-1];
                }
                cpy[0] = temp;
                k--;

            }
            for(int i=0;i<cpy.length;i++)
            {
                ls.add(cpy[i]);

            }
            System.out.println(ls);
            
            
        }
    public static void main(String args[])
    {
        int arr[]={1,2,3};
        listtoarray ls=new listtoarray();
        ls.circularArrayRotation(arr,2);

    }
    
}
