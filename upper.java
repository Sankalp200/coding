import java.util.*;
class upper
{
    public String space(String str)
    {
        StringBuilder st=new StringBuilder();
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                st.append(" ");
                st.append(Character.toLowerCase(ch));
            }
            else
            st.append(ch);
        }
return st.toString();
        
    }
    public static void main(String args[])
    {
        upper sol=new upper();
        String strs="ThisISGoing";
        String result=sol.space(strs);
        System.out.println(result);
        
        
        
        
        
        
    }
}