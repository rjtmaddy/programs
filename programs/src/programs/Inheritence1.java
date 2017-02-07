package programs;

class Test6 {
	int x=10;
	public void m1(){
		System.out.println("m1 method in parent");
	}
}

class Child1 extends Test6 {
	int x=9;
	public void m1(){
		System.out.println("m1 method in child");
	}
	void m2(){
		System.out.println("m2 method in child");
	}
}

class Child2 extends Child1{
	int x=8;
	public void m1(){
		System.out.println("m1 method in child2");
	}
	void m2(){
		System.out.println("m2 method in child2");
	}
}

class Inheritence1{
	public static void main(String...s){
		Test6 i = new Child1();
		i.m1();
	}
}
