package DAY09;

import java.util.Arrays;
import java.util.Scanner;

public class Indexalp {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int arr[]=new int[a];
    int arr1[]=new int[a];
    char ch[]=new char[a];
    for(int i=0;i<a;i++)
    	arr[i]=sc.nextInt();
    for(int i=0;i<a;i++)
    	arr1[i]=arr[i];
    Arrays.sort(arr1);
    int i=0;
    char cha='a';
    for(int c=0;c<a;c++) {
    	ch[c]=cha;
    	cha++;
    }
    check(arr,ch,arr1);
	}
static void check(int a[],char b[],int c[]) {
	char res[]=new char[a.length];
	int k=0;;
	int first =a[0];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++)
		if(c[i]==a[j]) {
			res[j]=b[i];
		}			
	}
	for(char m:res)
		System.out.print(m);
}
}
