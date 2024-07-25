package DAY09;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str[]=sc.next().split("");
    check(str);
	}
static void check(String s[]) {
	StringBuilder num=new StringBuilder();
	StringBuilder spl=new StringBuilder();
	for(int i=0;i<s.length;i++) {
		int a=s[i].charAt(0)-'0';
		//System.out.println(a);
		if(a<9 && 0<a) {
			num.append(s[i]);

		}else if(s[i].charAt(0)=='+'||s[i].charAt(0)=='-'||s[i].charAt(0)=='*'||s[i].charAt(0)=='/') {
		spl.append(s[i]);
	}
}
	
	String s1=num.toString();
	String s2=spl.toString();
	display(s1,s2);
}

   static void display(String a,String b) {
	  // System.out.println(a);
	  // System.out.println(b);
	   int j=0;
	int sum=a.charAt(0)-'0';
	for(int i=1;i<a.length();i++) {
		int d=(int)a.charAt(i)-'0';
		//System.out.println(d);
      	
			char ch=b.charAt(j);
		switch(ch){
				case '+':
					sum=sum+d;break;
				case '-':
					sum=sum-d;break;
				case '*':
					sum=sum*d;break;
				case '/':
					sum=sum/d;break;
					
			}
		j++;
		
		
		}
	 System.out.println(sum+" ");
	}	
  
   }



