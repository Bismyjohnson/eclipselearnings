package pkg;

public class operator {

	public static void main(String[] args) {
		System.out.println("------arithemetic operator---");
		int a=20,b=10;
				System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));//quotient
		System.out.println("a%b="+(a%b));//reminder
		System.out.println("----assignment perator--");
		int c=b;
		System.out.println(a==b);//a=a+b 30
		System.out.println(a-=b);//a=a-b 20
		System.out.println("---relational perator--");
		int v1=20,v2=10;
		System.out.println(v1==v2);//false
		System.out.println(v1>v2);
		System.out.println(v1<=v2);
		System.out.println(v1>=v2);
		System.out.println(v1!=v2);
		System.out.println(v1==v2);
		
		System.out.println("--logical operator---");
		String username="abc";
		String password="abc123";
		
		System.out.println(username=="abc"&&password=="abc123");//true
		System.out.println(!(username=="abc"));
		System.out.println(username=="abc"||password=="abc123");
		
		System.out.println("---unary operator--");
		//++increment by1
		//--decrement by1
		int v3=5;
		System.out.println(v3++);//5
		System.out.println(++v3);//7
		System.out.println(v3);//6
		
		System.out.println("---ternary operator--");
		//variable=condition?exp1;exp2;
		String ans=v1>v2?"v1 is greater":"v2 is greater";
		System.out.println(ans);
		
		
		

	}

}
