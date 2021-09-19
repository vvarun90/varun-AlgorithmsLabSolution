package demoGLTransaction;
import java.util.Scanner;

public class Transaction {
public static void main (String[] args) {
	System.out.println("Enter the size of transaction array");
	Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    int tx[]= new int[num];
    System.out.println("Enter the values");
    int i=0;
    for (i=0;i<num;i++) {
    	System.out.println("Enter transactions " +(i+1));
    	tx[i]= sc.nextInt();
    }
   
    System.out.println("Enter the total no of targets that needs to be achieved");
   
    int targets =sc.nextInt();
    for(int j=0; j<targets;j++) {
    	System.out.println("Enter the value of target " +(j+1));
    	int targetValue= sc.nextInt();
    	int sum=0;
        for (int k=0; k<num ; k++) {
        	sum =sum+ tx[k];
        	if(sum>=targetValue) {
        System.out.println("target is acheived after "+(k+1)+ " transactions");
        break;
    }
        }
        
if (sum< targetValue)
	System.out.println("Given target is not achieved");
   }	
  }
}
