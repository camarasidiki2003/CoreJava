package localGlobal;

public class Variables {
 static int a =10;
 int b= 20;
 static int c = 25;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     final int a= 99;// this is final its value can not be modified
     int b =22;
     
     System.out.println(Variables.a);
     System.out.println(a);
     System.out.println(c);
     System.out.println(a+Variables.a+XYZ.a);
     Variables v = new Variables();
     XYZ x =new XYZ();
     System.out.println(b+v.b+x.b);
	}

}
