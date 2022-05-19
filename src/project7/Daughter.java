package project7;

public class Daughter extends Pa {

	public static void main(String[] args) {
		daughter1();
		daughter2();
		Daughter obj = new Daughter();
		obj.daughter7();
		obj.daughter4();
		System.out.println(obj.GrandGrandPa1());
		System.out.println("is the display of number displaying the value returned by the method by using SYSO" +obj.daughter7());
			}
	public static void daughter1() {
		System.out.println("I am here as the static daughter of the inheritence number1");
	}
	public static void daughter2() {
		System.out.println("I am here as the daughter of the inheritence number2");
	}
	public void daughter3() {
		System.out.println("I am here as the non static-daughter of the inheritence number3");
	}
	private void daughter4() {
		System.out.println("I am here as the non-static private daughter of the inheritence number4");
	}
	protected void daughter5() {
		System.out.println("I am here as the non-static- protected daughter of the inheritence number5");
	}
	void daughter6() {
		System.out.println("I am here as the non-static default daughter of the inheritence number6");
	}
	public String daughter7() {
		return " I am here as the daughter of the inheritence number7";
	}




}
