import java.util.Scanner;
class reverseword
{
    public void wordwithrepeated(String s)
    {
        int n=s.length();
        
        for(int i=0;i<n;i++)
        { int count=0;
            for(int j=i+1;j<n;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    count++;
                }
            }
            if(count>=1)
        {
            System.out.println(s.charAt(i));
        }
        }
        
    }
    public static void main(String args[])
    {
        reverseword sol=new reverseword();
        String str="apple";
        sol.wordwithrepeated(str);
    }
}