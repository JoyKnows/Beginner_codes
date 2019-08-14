import java.util.*;
class sum
{
    public static void main(String[] args) // Main Method Starts using Parameterised Input
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the no. whose prime no. is to be found");
        int n=sc.nextInt();
        int count=0,i; // Declaration of a counter variable fo factors
        for(i=1;i<=n;i++)
        {
            if(n%i==0) //Checking if the remainder of n/i is equal to 0
            {
                count++; //Incrementing the counter
            }
        }
        if (count==2) // Prime Numbers have only two factors
        {
            System.out.println(n+" is a Prime number");
        }
        else
            System.out.println(n+" is not a Prime number");
    } //End of main method
} //End of class