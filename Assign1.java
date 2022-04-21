import java.util.*;

public class Assign1

{
       public static void main(String args[])
	   {
		   
		   
	   Scanner sc=new Scanner (System.in);
	   int a,b,res;
	   
	   System.out.println("enter no:");
	   a=sc.nextInt();
	   b=sc.nextInt();
	   
	   System.out.println(a>b && b>a);
	   
	   System.out.println(a<b || b<a);
	   
	   System.out.println(!(a>b));
	   }
	   
}


