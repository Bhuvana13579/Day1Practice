public class Day4Prime {
    public static void main(String[] args)
    {
        int p=11;
        int c=0;
        for(int i=2;i<p;i++)
        {
           if(p%i==0)
               c++;
        }
        if(c==0)
            System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
