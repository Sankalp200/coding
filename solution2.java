import java.util.*;
class solution2
{
    public int[] movezero(int arr[])
    {
        int n=arr.length;
        int temp[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[index]=arr[i];
                index++;
                
            }
        }
        for(int i=0;i<n;i++)
        {
           arr[i]=temp[i];
        }
        return temp;
    }
    public static void main(String args[])
    {
        solution2 sol=new solution2();
        int nums[]={0,2,4,4,5,0,3,2,5,0,6};
      int result[]= sol.movezero(nums);
      for(int i=0;i<nums.length;i++)
      {
          System.out.print(result[i]);
      }
    }
}