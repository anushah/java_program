import java.util.*;
import java.time.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    String log[][] = new String [n][3];
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            log[i][j] = sc.next();
	        }
	    }
	    System.out.println(n);
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<3;j++)
	        {
	            if(j==2)
	            {
	                System.out.print(log[i][j]);
	                break;
	            }
	            System.out.print(log[i][j]+",");
	        }
	        System.out.println();
	    }
	        String x = sc.next();
	        String y = sc.next();
	    
	        LocalTime xx = LocalTime.parse(x);
	        LocalTime yy = LocalTime.parse(y);
	        int count=0;
	        for(int i=0;i<n;i++)
	        {
	            LocalTime in = LocalTime.parse(log[i][1]);
	            LocalTime out = LocalTime.parse(log[i][2]);
	            if(in.isBefore(xx) && (out.isAfter(yy) || out==yy))
	            {
	                count++;
	            }
	        } 
	        
	       System.out.println(count);
	}
}
