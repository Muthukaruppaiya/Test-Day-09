package DAY09;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   String str[]=new String[a];
   char pri=0;
   long l=0;
   long sin=0;
   char len=0;
   for(int i=0;i<a;i++) {
	   str[i]=sc.next();
	  
   }
   for(int i=0;i<a;i++) {
	   len=leng(str[i]);
	   pri=prime(str[i]);	    
	    l=even(str[i]);
	    sin=single(str[i]);
   System.out.print(len);
   System.out.print(pri); 
   System.out.print(sin);
   System.out.print(l);
   System.out.println();
   }}
static char prime(String a) {
	Long l=new Long(a);
	boolean bool=true;
	if(l==0) {
		return 'Z';
	}
	if(l==1) {
		return '0';
	}
	for(int i=2;i<l/2;i++) {
		bool=true;
		if(l%i==0) {
			bool=false;
			break;
		}
	}
	if(bool) {
		return 'P';
	}
	return 'N';
	
}
static long even(String a) {
	Long l=new Long(a);
return (l/2);
}
static long single(String s) {
	long sum=0;
	Long l=new Long(s);	
	while(l>9) {	
		while(l>0) {
			sum=sum+l%10;
			l=l/10;//123
		}
		l=sum;
		sum=0;
	}
return l;
}
static char leng(String a) {
	if(a.length()==6) {
		return 'C';
	}else
		return 'W';
	}
}
