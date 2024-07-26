import java.util.*;
class adam{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
int number=obj.nextInt();
int sn,num,l,rev=0;
sn=number*number;
num=sn;
System.out.println(num);
while(sn>0)
{
l=sn%10;
rev=(rev*10)+l;
sn=sn/10;
}
System.out.println(rev);
int last,r=0;
while(number>0)
{
last=number%10;
r=(r*10)+last;
number=number/10;
}
System.out.println(r*r);
}
}



