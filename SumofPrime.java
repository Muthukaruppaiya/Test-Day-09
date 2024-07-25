package DAY09;
import java.util.Arrays;
import java.util.Scanner;
public class SumofPrime {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    for(int i=0;i<a;i++)
    arr[i]=sc.nextInt();
    prime(arr,a);  
	}
static void prime(int arr[],int a) {
	int sum=0;
	int c=0;
	boolean bool=true;
	int t[]=new int[a];
	for(int i=0;i<a;i++) {
		bool=true;
		for(int j=2;j<arr[i];j++) {
			if(arr[i]%j==0) {
				bool=false;
				break;
			}}		
			if(bool){
				t[i]=arr[i];
				c++;
			}}	
	Arrays.sort(t);
	for(int i=c;i<a;i++) {
		sum=sum+t[i];
	}
	System.out.println(sum);
}
}
