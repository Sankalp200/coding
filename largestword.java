import java.util.*;
class largestword
{
    public String LargestWord(String s)
    {
        int n=s.length();
        String word="";
        String largest="";
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            {
                word=word+s.charAt(i);
            }
            
            if(largest.length()>word.length())
            {
                largest=word;
                
            }
            if(s.charAt(i)==' ')
            {
                word=" ";
            }
            
           
        }
        
       
        if(word.length()>largest.length())
            {
                largest=word;
            }
            return largest;
        
    }
    public static void main(String args[])
    {
        largestword sol=new largestword();
        String str=" This is new Generation";
        System.out.println(sol.LargestWord(str));
    }
}