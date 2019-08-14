import java.util.*;
class joy1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=0;
        System.out.println("enter the no. whose table is to be calculated");
        number=sc.nextInt();
        int i=0;
        for(i=0;i<=10;i++)
            System.out.println(number+"*"+i+"="+(number*i));
    }
}


