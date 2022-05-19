package staticKey;

public class X {
 int a =10;
 static int b= 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    X objx = new X();
    System.out.println(b);
    System.out.println(objx.a);
    objx.a = 999;
    objx.b = 222;
    X objx1 = new X();
    System.out.println(objx1.a);
    System.out.println(b);
    System.out.println(objx1.b);
    
    
	}

}
