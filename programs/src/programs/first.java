package programs;

public class first {

	public static void main(String[] args){
		new test(55);
		new test(55,65.5d);
	}
}
class test{
	int marks;
	double percentage;
	
	test(int a){
		marks = a;
		System.out.println("marks is "+marks);
	}
	test(int a , double b){
		marks=a;
		percentage=b;
		System.out.println("marks is "+marks);
		System.out.println("percentage is "+percentage);
	}
}
