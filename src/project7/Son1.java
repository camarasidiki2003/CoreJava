package project7;

public class Son1 extends Pa{
 static int a=30;
 static int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandGrandPa obj = new GrandGrandPa();
		System.out.println(obj.GrandGrandPa1());
		Son1 obj1 = new Son1();
		a=10;
		b=12;
		obj1.abc();
		obj1.abc1();
	 System.out.println(a*b);
		

	}
	public void abc(int a, int b) {
		System.out.println("Hello from son1");
		//super.abc();
	}
	public void abc1() {
		super.abc();
	}

}
