public class Day4Count {
    public static void main(String[] args)
    {
        int i=1234456;
        int c=0;
        while(i!=0)
        {
            c++;
            i=i/10;
        }
        System.out.println(c);
    }
}
