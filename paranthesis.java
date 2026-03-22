 import java.util.*;
class paranthesis
{
    public String extra(String s)
    {
        StringBuilder str=new StringBuilder();
        int count=0;
        int start=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                count ++;
                else
                count--;
                if(count==0)
                {
                    str.append(s.substring(start+1,i));
                    start=i+1;   
                }
           }
            return str.toString();
            
       
        }
       
        
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter string");
        String strs=sc.nextLine();
        paranthesis sol=new paranthesis();
        System.out.println(sol.extra(strs));
        
    }
}

