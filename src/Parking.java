import java.util.*;
class Parking
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int bill=0;
        int time=0;
        System.out.println("enter the hours of parking in minutes");
        time=sc.nextInt();
        if(time<60)
        {
            bill=20;
        }
        else if(time>=60 && time<120)
        {
            bill=40;
        }
        else if(time>=120 && time<180)
        {
            bill=60;
        }
        else if(time>=180 && time<240)
        {
            bill=80;
        }
        else if(time>=240 && time<300)
        {
            bill=100;
        }
        else if(time>=300)
        {
            bill=120;
        }
        int total_bill=bill+20;
        System.out.println("ur parking time= "+time+"min ; basic rate= 20"+" ;"+"bill= Rs "+total_bill);
    }
}



