package LambdaExpression;
//Write a java program to execute Lambda Expression with multiple parameter.

interface Addition{
	int add(int a, int b);
}

public class P3 {
	public static void main(String[] args) {
		Addition ad1=(a,b)->(a+b);
		System.out.println(ad1.add(50, 11));
		
		Addition ad2=(int x,int y)->(x+y);
		System.out.println(ad2.add(510,400));
		
		
	}
	

}
