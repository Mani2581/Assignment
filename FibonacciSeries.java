package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
int firstNum=0, range=8,secNum=1,sum;
System.out.println("first number is : "+firstNum);

for(int i=0;i<=range-1;i++)
	{
	
	sum=secNum+firstNum;
	
	
	firstNum=secNum;
	secNum=sum;
	System.out.println(sum);
	
}

}

}

/*
public static void main(String[] args) {
int n1=0,n2=1,n3,i,count=8;
	
	System.out.println(n1);
	System.out.println(n2);
	  for(i=2;i<count;++i) {
		  n3=n1+n2;
	  System.out.println(" "+n3);
	 n1=n2;
	 n2=n3;
}

}
}*/