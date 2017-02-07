package programs;

class Class{
	void show(){
		System.out.println("parent");
	}
}

class ChildNew extends Class
{
	void display(){
		System.out.println("child");
	}

	public static void main(String...s)
{
	ChildNew c =new ChildNew();
	c.hashCode();
}
}
